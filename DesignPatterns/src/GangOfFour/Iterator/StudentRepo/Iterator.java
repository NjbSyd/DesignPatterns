package GangOfFour.Iterator.StudentRepo;

public interface Iterator {
    boolean hasNext();

    Object next();

    boolean hasPrevious();

    Object previous();

    Object moveTofirst();

    Object moveTolast();
}

