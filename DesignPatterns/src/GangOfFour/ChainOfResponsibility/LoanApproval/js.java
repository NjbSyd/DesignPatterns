//package ChainOfResponsibility_LoanApproval;
//
//class OperationHandler {
//    private OperationHandler next;
//
//    public void setNext(OperationHandler next) {
//        this.next = next;
//    }
//
//    public int compute(int a, int b) {
//        return 0; // Default implementation, should be overridden by subclasses
//    }
//
//    public int handle(int a, int b) {
//       if(this.)
//    }
//}
//
//class Adder extends OperationHandler {
//    String response = "add";
//    public int compute(int a, int b) {
//        return a + b;
//    }
//}
//
//class Subtractor extends OperationHandler {
//    String response = "sub";
//    public int compute(int a, int b) {
//        return a - b;
//    }
//}
//
//class Multiplier extends OperationHandler {
//    String response = "mul";
//    public int compute(int a, int b) {
//        return a * b;
//    }
//}
//
//class Divider extends OperationHandler {
//    String response = "div";
//    public int compute(int a, int b) {
//        if (b != 0) {
//            return a / b;
//        } else {
//            throw new ArithmeticException("Division by zero");
//        }
//    }
//}
