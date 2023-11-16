package Strategy;

import Data.PC;
import Data.Student;

import java.util.List;
import java.util.Map;

public class StrategyContext {
    private AllocationStrategy strategy;

    public void setStrategy(AllocationStrategy strategy){
        this.strategy=strategy;
    }

    public void executeStrategy(Student[] std, Map<Integer, PC> pc){
        strategy.allocatePC(std,pc);
    }

    public List<String> getAllocation() {
        return strategy.getAllocations();
    }
}
