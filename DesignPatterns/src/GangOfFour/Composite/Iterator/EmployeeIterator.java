package GangOfFour.Composite.Iterator;

import GangOfFour.Composite.Employee.IEmployee;

import java.util.List;
import java.util.Stack;

public class EmployeeIterator implements Iterator {
    private final Stack<IEmployee> stack = new Stack<>();
    private final Stack<Object[]> levelStack = new Stack<>();

    public EmployeeIterator(IEmployee root) {
        stack.push(root);
        levelStack.push(new Object[]{0, root});
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public boolean hasNextWithLevel() {
        return !levelStack.isEmpty();
    }

    @Override
    public IEmployee next() {
        if (!hasNext()) {
            return null;
        }
        IEmployee current = stack.pop();
        if (current != null) {
            List<IEmployee> subordinates = current.getSubordinatesList();
            if (subordinates != null)
                for (int i = subordinates.size() - 1; i >= 0; i--) {
                    stack.push(subordinates.get(i));
                }
        }
        return current;
    }

    @Override
    public Object[] nextWithLevel() {
        if (!hasNextWithLevel()) {
            return null;
        }
        Object[] current = levelStack.pop();
        if (current != null) {
            List<IEmployee> subordinates = current[1] != null ? ((IEmployee) current[1]).getSubordinatesList() : null;
            if (subordinates != null)
                for (int i = subordinates.size() - 1; i >= 0; i--) {
                    levelStack.push(new Object[]{(int) current[0] + 1, subordinates.get(i)});
                }
        }
        return current;
    }

}
