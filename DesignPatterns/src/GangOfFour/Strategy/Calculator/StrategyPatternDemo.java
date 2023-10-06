package GangOfFour.Strategy.Calculator;

import GangOfFour.Strategy.Calculator.Strategies.OperationAdd;
import GangOfFour.Strategy.Calculator.Strategies.OperationPower;
import GangOfFour.Strategy.Calculator.Strategies.Strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Strategy add = new OperationPower();
        Context context = new Context(add);
        // 100 to 1000 is range for Subtraction, So Chain will deliver range specific operation
        System.out.println(context.computeInRange(1000, 999));
        // Direct Strategy Execution, No Chaining
        System.out.println(context.executeStrategy(2, 99));
    }
}
