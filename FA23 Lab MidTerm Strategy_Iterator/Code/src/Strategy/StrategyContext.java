package Strategy;

import Data.PC;
import Data.Student;

import java.util.Map;

public class StrategyContext {
    private AllocationStrategy strategy;

    void setStrategy(AllocationStrategy strategy){
        this.strategy=strategy;
    }

    void executeStrategy(Student[] std, Map<Integer, PC> pc){
        strategy.allocatePC(std,pc);
    }
}
