package Strategy;

import Data.PC;
import Data.Student;
import Iterator.ComputersIterator;
import Iterator.Iterator;
import Iterator.StudentsIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LinuxAllocation implements AllocationStrategy {
    private final List<String> allocation = new LinkedList<>();

    @Override
    public void allocatePC(Student[] std, Map<Integer, PC> pc) {
        Iterator studentIterator = new StudentsIterator(std);
        Iterator computerIterator = new ComputersIterator(pc);
        while (studentIterator.hasNext("1") && computerIterator.hasNext("Linux")) {
            Student tempStd = (Student) studentIterator.next("1");
            PC tempPC = (PC) computerIterator.next("Linux");
            allocation.add(tempStd.name() + " got " + tempPC.os() + " PC");
        }
    }


    public List<String> getAllocations() {
        return allocation;
    }
}
