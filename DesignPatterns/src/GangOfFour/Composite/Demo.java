package GangOfFour.Composite;


public class Demo {
    public static void main(String[] args) {
        EmployeesController employeesController = EmployeesController.getInstance();

        employeesController.generateOrganogram();

        // Give bonus to all employees, 20% of their salary
        System.out.println("\n"+"-".repeat(30) + "\nGiving bonus to all employees\n");
        employeesController.activateBonus(20);

        // Give bonus to all employees who are teachers, 10% of their salary
        // Change the first parameter to one or more ["director","doo","hod","teacher"]
        // to give bonus to that specific single/multiple employee type
        System.out.println("\n"+"-".repeat(30) + "\nGiving bonus to all teachers\n");
        employeesController.activateBonus(10, "teacher");

        // Give bonus to all employees who are teachers or hod, 10% of their salary
        System.out.println("\n"+"-".repeat(30) + "\nGiving bonus to all teachers and hod\n");
        employeesController.activateBonus(10, "doo", "hod");

        // Subscribe all employees to university for updates
        employeesController.subscribeToUniversity();

        // Send update to all employees
        System.out.println("\n"+"-".repeat(30) + "\nSending update to all employees\n");
        employeesController.updateUniversity("University is closed today");

        // Send update to all employees who are teachers
        System.out.println("\n"+"-".repeat(30) + "\nSending update to all teachers\n");
        employeesController.updateUniversity("Please Come for Meeting", "teacher");

        // Send update to all employees who are teachers or hod
        System.out.println("\n"+"-".repeat(30) + "\nSending update to all teachers and hod\n");
        employeesController.updateUniversity("No Classes Today", "teacher", "hod");
    }
}
