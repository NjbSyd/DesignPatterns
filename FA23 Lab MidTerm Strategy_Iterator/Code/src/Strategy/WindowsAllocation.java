package Strategy;

import Data.PC;
import Data.Student;
import Iterator.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WindowsAllocation implements AllocationStrategy{
    private final List<String> allocation = new LinkedList<>();

    @Override
    public void allocatePC(Student[] std, Map<Integer, PC> pc) {
        Iterator studentIterator = new StudentsIterator(std);
        Iterator computerIterator = new ComputersIterator(pc);
        while (studentIterator.hasNext("0") && computerIterator.hasNext("Windows")) {
            Student tempStd = (Student) studentIterator.next("0");
            PC tempPC = (PC) computerIterator.next("Windows");
            allocation.add(tempStd.name() + " got " + tempPC.os() + " PC");
        }
    }

    public List<String> getAllocations() {
        return allocation;
    }
}
