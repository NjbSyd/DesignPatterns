package Iterator;

import Data.Student;
import jdk.jfr.BooleanFlag;

public class StudentsIterator implements Iterator {

    private final Student[] array;
    private int index;

    public StudentsIterator(Student[] array) {
        this.array = array;
        this.index = 0;
    }

    @Override
    public Student next() {
        return array[index++];
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Student next(String key) {
        return next();
    }

    @Override
    public boolean hasNext(String key) {
        if (index >= array.length) return false;
        for (int i = index; i < array.length; i++) {
            if (array[i].regNo() % 2 == Integer.parseInt(key)) {
                index = i;
                return true;
            }
        }
        return false;
    }
}
