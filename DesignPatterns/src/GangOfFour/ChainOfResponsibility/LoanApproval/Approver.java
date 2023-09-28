package ChainOfResponsibility_LoanApproval;

public interface Approver {
    void setNext(Approver next);
    void process(Loan loan);
}



