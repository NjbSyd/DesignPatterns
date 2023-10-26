package GangOfFour.Visitor.Computer;

public class ComputerPartMaintainVisitor implements ComputerPartMaintainer {

    @Override
    public void maintain(Computer computer) {
        System.out.println("Maintaining Computer.");
    }

    @Override
    public void maintain(Mouse mouse) {
        System.out.println("Maintaining Mouse.");
    }

    @Override
    public void maintain(Keyboard keyboard) {
        System.out.println("Maintaining Keyboard.");
    }

    @Override
    public void maintain(Monitor monitor) {
        System.out.println("Maintaining Monitor.");
    }

    @Override
    public void maintain(Multimedia multimedia) {
        System.out.println("Maintaining Multimedia.");
    }
}
