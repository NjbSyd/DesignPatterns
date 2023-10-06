package GangOfFour.Strategy.Calculator.Strategies;

import GangOfFour.Strategy.Calculator.ComputationChainHandler;

public class OperationDivide implements Strategy, ComputationChainHandler {
    private ComputationChainHandler next;

    public OperationDivide() {
        this.setNext(null);
    }

    public OperationDivide(ComputationChainHandler next) {
        this.setNext(next);
    }

    @Override
    public int doOperation(int num1, int num2) {
        System.out.print("Division: " + num1 + " / " + num2 + " = ");
        return num2 != 0 ? (num1 / num2) : Integer.MIN_VALUE;
    }

    @Override
    public void setNext(ComputationChainHandler handler) {
        this.next = handler;
    }

    @Override
    public int computeInRange(int num1, int num2) {
        boolean num1InRange = num1 >= 5000 && num1 <= 10000,
                num2InRange = num2 >= 5000 && num2 <= 10000;

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
