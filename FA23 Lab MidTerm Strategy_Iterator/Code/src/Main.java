import Data.PC;
import Data.RandomDataGenerator;
import Data.Student;
import Strategy.LinuxAllocation;
import Strategy.StrategyContext;
import Strategy.WindowsAllocation;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student[] students = RandomDataGenerator.generateStudents(10);
        Map<Integer, PC> pcs = RandomDataGenerator.generatePCs(10);
        StrategyContext context = new StrategyContext();
        context.setStrategy(new LinuxAllocation());
        context.executeStrategy(students, pcs);

        System.out.println("Linux Allocation:");
        for (String s : context.getAllocation()) {
            System.out.println(s);
        }


        context.setStrategy(new WindowsAllocation());
        context.executeStrategy(students, pcs);


        System.out.println("Windows Allocation:");
        for (String s : context.getAllocation()) {
            System.out.println(s);
        }
    }
}