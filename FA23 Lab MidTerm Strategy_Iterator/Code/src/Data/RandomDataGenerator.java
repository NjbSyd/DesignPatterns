package Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomDataGenerator {
    Random random = new Random();

    public static Student[] generateStudents(int n) {
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(i, "Student" + i, "Discipline" + i, "Semester" + i);
        }
        return students;
    }

    public static Map<Integer, PC> generatePCs(int n) {
        Map<Integer, PC> pcs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            pcs.put(i++, new PC("Windows", new String[]{"Paint", "VS Code", "Chrome"}));
            pcs.put(i++, new PC("Linux", new String[]{"Gimp", "VS Code", "Chrome"}));
        }
        return pcs;
    }
}
