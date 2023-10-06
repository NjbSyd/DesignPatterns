package GangOfFour.Strategy.Shopping.Strategies;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class PayByEasypaisa implements PayStrategy{
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String accountNumber;
    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using Easypaisa.");
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter the Easypaisa account number: ");
            accountNumber = READER.readLine();

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
