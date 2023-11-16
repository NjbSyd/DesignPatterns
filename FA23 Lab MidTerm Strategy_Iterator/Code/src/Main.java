import Data.PC;
import Data.Student;
import Iterator.ComputersIterator;
import Iterator.Iterator;
import Iterator.StudentsIterator;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(1, "Najeeb", "Software", "7th"),
                new Student(2, "Mahmoud", "Software", "7th"),
                new Student(3, "Mohamed", "Software", "7th"),
        };

        Iterator stdIterator = new StudentsIterator(students);
        while (stdIterator.hasNext("Najeeb")) {
            System.out.println(stdIterator.next("Najeeb"));
        }

        Map<Integer, PC> computers = new HashMap<>();
        computers.put(1, new PC("Linux", new String[]{"Paint", "VS Code"}));
        computers.put(2, new PC("Windows", new String[]{"Paint", "VS Code"}));
        computers.put(3, new PC("Linux", new String[]{"Paint", "VS Code"}));

        Iterator compIterator = new ComputersIterator(computers);

        while (compIterator.hasNext("Windows")) {
            System.out.println(compIterator.next("Windows"));
        }
    }
}