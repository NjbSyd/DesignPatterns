package GangOfFour.Composite.Iterator;
import GangOfFour.Composite.Employee.IEmployee;

public interface Iterator {
    boolean hasNext();
    IEmployee next();
    Object[] nextWithLevel();
    boolean hasNextWithLevel();
}
