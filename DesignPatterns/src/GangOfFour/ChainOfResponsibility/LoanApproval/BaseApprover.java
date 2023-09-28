package ChainOfResponsibility_LoanApproval;

public abstract class BaseApprover implements Approver {
    protected Approver next = null;

    public void setNext(Approver next) {
        this.next = next;
    }
}
