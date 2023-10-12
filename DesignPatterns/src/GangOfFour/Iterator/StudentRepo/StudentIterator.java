package GangOfFour.Iterator.StudentRepo;

public interface StudentIterator extends Iterator {
    void printAll();

    void printStudentWithNameStartingFrom(String name);
}
