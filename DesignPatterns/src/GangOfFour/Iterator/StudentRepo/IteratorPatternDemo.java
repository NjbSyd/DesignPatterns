package GangOfFour.Iterator.StudentRepo;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        StudentsRepository studentsRepository = new StudentsRepository();
        studentsRepository.sort();
        StudentIterator studentIterator=studentsRepository.getIterator();
        studentIterator.printStudentWithNameStartingFrom("P");
        studentIterator.printAll();
    }
}
