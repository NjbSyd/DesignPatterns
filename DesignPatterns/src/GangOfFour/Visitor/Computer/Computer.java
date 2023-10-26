package GangOfFour.Visitor.Computer;

public class Computer implements ComputerPart {

    ComputerPart[] parts;
    public ComputerPart mouse,keyboard,monitor,multimedia;
    public Computer() {
        this.mouse = new Mouse();
        this.keyboard = new Keyboard();
        this.monitor = new Monitor();
        this.multimedia = new Multimedia();
        parts = new ComputerPart[]{mouse, keyboard, monitor, multimedia};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }


    @Override
    public void accept(ComputerPartMaintainer computerPartMaintainer) {
        for (ComputerPart part:parts) {
            part.accept(computerPartMaintainer);
        }
    }
}
