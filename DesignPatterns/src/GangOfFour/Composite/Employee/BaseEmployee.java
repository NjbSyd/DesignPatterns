package GangOfFour.Composite.Employee;

import GangOfFour.Composite.Iterator.EmployeeIterator;
import GangOfFour.Composite.Iterator.Iterator;

public abstract class BaseEmployee implements IEmployee {
    protected String name;
    protected int salary;

    public BaseEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator(this);
    }
    public abstract void giveBonus(int percent);

    @Override
    public abstract void update(String change);
}
