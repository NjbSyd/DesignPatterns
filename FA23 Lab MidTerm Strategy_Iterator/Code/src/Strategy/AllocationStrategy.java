package Strategy;

import Data.PC;
import Data.Student;

import java.util.List;
import java.util.Map;

public interface AllocationStrategy {
    void allocatePC(Student[] std, Map<Integer,PC> pc);
    List<String> getAllocations();
}
