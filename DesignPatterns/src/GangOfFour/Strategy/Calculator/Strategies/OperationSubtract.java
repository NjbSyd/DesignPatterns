package GangOfFour.Strategy.Calculator.Strategies;

import GangOfFour.Strategy.Calculator.ComputationChainHandler;

public class OperationSubtract implements Strategy, ComputationChainHandler {
    private ComputationChainHandler next;

    public OperationSubtract() {
        this.setNext(null);
    }

    public OperationSubtract(ComputationChainHandler next) {
        this.setNext(next);
    }

    @Override
    public int doOperation(int num1, int num2) {
        System.out.print("Subtraction: " + num1 + " - " + num2 + " = ");
        return num1 - num2;
    }

    @Override
    public void setNext(ComputationChainHandler handler) {
        this.next = handler;
    }

    @Override
    public int computeInRange(int num1, int num2) {
        boolean num1InRange = num1 >= 100 && num1 <= 1000,
                num2InRange = num2 >= 100 && num2 <= 1000;
        if (num1InRange && num2InRange) {
            return doOperation(num1, num2);
        } else if (next != null) {
            return next.computeInRange(num1, num2);
        } else {
            System.out.println("No handler For this range: " + num1 + "," + num2);
            return Integer.MIN_VALUE;
        }
    }

}
