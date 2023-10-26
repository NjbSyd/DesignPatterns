package GangOfFour.Visitor.Computer;

public interface ComputerPart {
     void accept(ComputerPartVisitor computerPartVisitor);
     void accept(ComputerPartMaintainer computerPartMaintainer);
}

