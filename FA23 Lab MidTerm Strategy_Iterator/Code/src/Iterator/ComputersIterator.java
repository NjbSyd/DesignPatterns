package Iterator;

import Data.PC;

import java.util.Map;

public class ComputersIterator implements Iterator {

    private final Map<Integer, PC> computers;
    private final PC[] computersArray;
    private int index;

    public ComputersIterator(Map<Integer, PC> computers) {
        this.computers = computers;
        this.computersArray = computers.values().toArray(new PC[0]);
        this.index = 0;
    }

    @Override
    public PC next() {
        return computersArray[index++];
    }

    @Override
    public boolean hasNext() {
        return index <= computersArray.length - 1;
    }

    @Override
    public PC next(String key) {
        for (int i = index; i < computersArray.length; i++) {
            if (computersArray[i].os().equals(key)) {
                index=i;
                return computersArray[index++];
            }
        }
        return null;
    }

    @Override
    public boolean hasNext(String key) {
        if(index>=computersArray.length) return false;
        for (int i = index; i < computersArray.length; i++) {
            if (computersArray[i].os().equals(key)) {
                return true;
            }
        }
        return false;
    }


}
