package GangOfFour.Strategy.Calculator;

public interface ComputationChainHandler {
    void setNext(ComputationChainHandler handler);

    int computeInRange(int num1, int num2);
}
