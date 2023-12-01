package GangOfFour.Composite;

import GangOfFour.Composite.Employee.*;
import GangOfFour.Composite.Iterator.Iterator;
import GangOfFour.Composite.Observer.UniversitySubject;


public class EmployeesController {
    private static IEmployee root;
    private static EmployeesController employeesController;
    private static UniversitySubject universitySubject;

    // Generate organogram of the organization
    public void generateOrganogram() {
        Iterator iterator = root.getIterator();
        while (iterator.hasNextWithLevel()) {
            Object[] employee = iterator.nextWithLevel();
            int level = (int) employee[0];
            IEmployee current = (IEmployee) employee[1];

            String indentation = getIdentation(level);
            System.out.println(indentation + current.getClass().getSimpleName() + " " + current.getName());
        }
    }

    private String getIdentation(int level) {
        if(level==0)
            return "";
        String defaultIndentation="|\t";
        String defaultPointer="└── ";

        return defaultIndentation.repeat(level-1)+defaultPointer;
    }


    //Give bonus to all employees
    public void activateBonus(int percent) {
        Iterator iterator = root.getIterator();
        while (iterator.hasNext()) {
            IEmployee employee = iterator.next();
            employee.giveBonus(percent);
        }
    }

    //Give bonus to specific employees
    public void activateBonus(int percent, String... type) {
        Iterator iterator = root.getIterator();
        while (iterator.hasNext()) {
            IEmployee employee = iterator.next();
            for (String s : type) {
                if (employee.getClass().getSimpleName().equalsIgnoreCase(s)) {
                    employee.giveBonus(percent);
                }
            }
        }
    }

    //Subscribe all employees to university
    public void subscribeToUniversity() {
        Iterator iterator = root.getIterator();
        while (iterator.hasNext()) {
            IEmployee employee = iterator.next();
            universitySubject.registerObserver(employee);
        }
    }

    public void updateUniversity(String change) {
        universitySubject.notifyObservers(change);
    }

    public void updateUniversity(String change, String... type) {
        universitySubject.notifyObservers(change, type);
    }

    /*
     * Code given below is not part of the task.
     * These are helper methods to initialize the organization
     * and generate the organogram and other functionality.
     * */


    //Private constructor to initialize the organization locally
    private EmployeesController() {
        initializeOrganization();
    }

    //Get instance of the class using singleton pattern
    public static EmployeesController getInstance() {
        if (employeesController == null) {
            employeesController = new EmployeesController();
        }
        return employeesController;
    }

    //Method to initialize the organization
    private void initializeOrganization() {
        IEmployee teacherCs1 = new Teacher("Nabil", 402000, "in class", "Post Doc in Machine Learning");
        IEmployee teacherCs2 = new Teacher("Sara", 301500, "online", "Ph.D. in Artificial Intelligence");
        IEmployee teacherCs3 = new Teacher("Alex", 450000, "on leave", "Doctorate in Cyber-security");
        IEmployee teacherCs4 = new Teacher("Emily", 380000, "in class", "Masters in Data Science");
        IEmployee teacherCs5 = new Teacher("Rajesh", 420000, "online", "Ph.D. in Cloud Computing");
        IEmployee teacherSe1 = new Teacher("Aisha", 350000, "on leave", "Post Doc in Natural Language Processing");
        IEmployee teacherSe2 = new Teacher("Daniel", 410000, "in class", "Masters in Information Security");
        IEmployee teacherSe3 = new Teacher("Lily", 320000, "on leave", "Ph.D. in Computer Vision");
        IEmployee teacherSe4 = new Teacher("Khaled", 400000, "in class", "Doctorate in Software Engineering");
        IEmployee teacherSe5 = new Teacher("Mia", 390000, "online", "Masters in Blockchain Technology");

        IEmployee dooCs1 = new DOO("Zeeshan", 500000, "1st");
        IEmployee dooCs2 = new DOO("Ayesha", 550000, "2nd");
        IEmployee dooEe1 = new DOO("Kamran", 520000, "1st");
        IEmployee dooSe1 = new DOO("Nadia", 530000, "1st");
        IEmployee dooSe2 = new DOO("Imran", 510000, "2nd");


        IEmployee hodCs = new HOD("Ali", 600000, "Computer Science");
        IEmployee hodEe = new HOD("Sana", 650000, "Electrical Engineering");
        IEmployee hodSe = new HOD("Farhan", 620000, "Software Engineering");

        hodCs.addSubordinate(teacherCs1);
        hodCs.addSubordinate(teacherCs2);
        hodCs.addSubordinate(teacherCs3);
        hodCs.addSubordinate(teacherCs4);
        hodCs.addSubordinate(teacherCs5);
        hodCs.addSubordinate(dooCs1);
        hodCs.addSubordinate(dooCs2);

        hodEe.addSubordinate(dooEe1);

        hodSe.addSubordinate(teacherSe1);
        hodSe.addSubordinate(teacherSe2);
        hodSe.addSubordinate(teacherSe3);
        hodSe.addSubordinate(teacherSe4);
        hodSe.addSubordinate(teacherSe5);
        hodSe.addSubordinate(dooSe1);
        hodSe.addSubordinate(dooSe2);

        IEmployee director = new Director("Zain", 700000);
        director.addSubordinate(hodCs);
        director.addSubordinate(hodEe);
        director.addSubordinate(hodSe);
        root = director;
        universitySubject = new UniversitySubject();
    }
}