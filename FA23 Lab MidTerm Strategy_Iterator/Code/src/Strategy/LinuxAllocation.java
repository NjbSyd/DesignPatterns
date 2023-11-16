package Strategy;

import Data.PC;
import Data.Student;
import Iterator.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LinuxAllocation implements AllocationStrategy {
    private final List<String> allocation=new LinkedList<>();
    @Override
    public void allocatePC(Student[] std, Map<Integer,PC> pc) {
        Iterator studentIterator=new StudentsIterator(std);
        Iterator computerIterator=new ComputersIterator(pc);
        while(studentIterator.hasNext("1")) {
            Student tempStd=studentIterator.next("1");
            
        }
    }

    public List<String> getAllocation() {
        return allocation;
    }
}
