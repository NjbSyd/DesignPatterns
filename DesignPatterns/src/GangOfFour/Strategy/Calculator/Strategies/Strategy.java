package GangOfFour.Strategy.Calculator.Strategies;


public interface Strategy {
    int doOperation(int num1, int num2);

    int computeInRange(int num1, int num2);
}
