package GangOfFour.Strategy.Shopping.Strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}