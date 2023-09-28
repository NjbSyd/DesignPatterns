package ObserverPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        Observer hexaObserver = new HexaObserver(subject);
        Observer octalObserver = new OctalObserver(subject);
        Observer binaryObserver = new BinaryObserver(subject);

        System.out.println("First state change: 15 with all 3 observers");
        subject.setState(15);
        System.out.println("Second state change: 10 with all 3 observers");
        subject.setState(10);
        subject.detach(hexaObserver);
        System.out.println("Second state change: 20 with all 2 observers");
        subject.setState(20);
    }
}