package GangOfFour.Composite.Employee;

import GangOfFour.Composite.Iterator.EmployeeIterator;
import GangOfFour.Composite.Iterator.Iterator;

import java.util.List;

public class DOO extends BaseEmployee {
    String rank;

    public DOO(String name, int salary, String rank) {
        super(name, salary);
        this.rank = rank;
    }

    @Override
    public void giveBonus(int percent) {
        System.out.println("DOO " + name + " got " + (percent*salary/100) + " bonus");
    }

    @Override
    public void addSubordinate(IEmployee subordinate) {
        System.err.println("DOO cannot have subordinates");

    }

    @Override
    public void update(String change){
        System.out.println("DOO "+name+" got notification from University of change:"+change);
    }

    @Override
    public List<IEmployee> getSubordinatesList() {
        return null;
    }
    @Override
    public String toString() {
        return "\nDOO{" + "\nName='" + name + '\'' +
                ", \nSalary=" + salary +
                ", \nRank='" + rank + '\'' +
                "\n} ";
    }
}
