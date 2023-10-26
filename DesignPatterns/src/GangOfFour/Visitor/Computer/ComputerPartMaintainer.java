package GangOfFour.Visitor.Computer;

public interface ComputerPartMaintainer {
    void maintain(Computer computer);
    void maintain(Mouse mouse);
    void maintain(Keyboard keyboard);
    void maintain(Monitor monitor);
    void maintain(Multimedia multimedia);
}
