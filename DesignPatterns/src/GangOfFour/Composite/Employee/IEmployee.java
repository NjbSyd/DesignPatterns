package GangOfFour.Composite.Employee;
import GangOfFour.Composite.Iterator.Iterator;
import GangOfFour.Composite.Observer.IEmployeeObserver;

import java.util.List;

public interface IEmployee extends IEmployeeObserver {
    void giveBonus(int percent);
    void addSubordinate(IEmployee subordinate);
    List<IEmployee> getSubordinatesList();
    String getName();
    int getSalary();
    Iterator getIterator();

}
