package GangOfFour.Visitor.Computer;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);

    }

    @Override
    public void accept(ComputerPartMaintainer computerPartMaintainer) {
        computerPartMaintainer.maintain(this);
    }
}
