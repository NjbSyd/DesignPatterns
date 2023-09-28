package ChainOfResponsibility_LoanApproval;

public class Loan {
    private final String serialNumber;
    private final double amount;
    private final String purpose;
    private final double interestRate;

    public Loan(String number, double amount, String purpose,double interestRate){
        this.serialNumber = number;
        this.amount = amount;
        this.purpose = purpose;
        this.interestRate=interestRate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getAmount() {
        return amount;
    }

    public String getPurpose() {
        return purpose;
    }
    public double getInterestRate() {
        return interestRate;
    }
    @Override
    public String toString() {
        return "Loan [number=" + serialNumber + ", amount=" + amount + ", purpose=" + purpose +", Interest Rate="+(interestRate*100)+ "% ]";
    }

}
