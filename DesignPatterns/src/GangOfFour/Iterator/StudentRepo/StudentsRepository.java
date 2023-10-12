package GangOfFour.Iterator.StudentRepo;

public class StudentsRepository implements Container {
    public Student[] students = Student.getStudents();

    public void sort() {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].name.compareTo(students[j + 1].name) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public StudentIterator getIterator() {
        return new ConcreteStudentIterator();
    }

    private class ConcreteStudentIterator implements StudentIterator {
        private int index;

        ConcreteStudentIterator() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < students.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return students[index++];
            }
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return index >= 0;
        }

        @Override
        public Object previous() {
            return students[index--];
        }

        @Override
        public Object moveTofirst() {
            index = 0;
            return students[0];
        }

        @Override
        public Object moveTolast() {
            index = students.length - 1;
            return students[index];
        }

        @Override
        public void printAll() {
            sort();
            System.out.println("All Students:");
            for (Student oneStudent : students) {
                System.out.println("Student: { " + oneStudent.name + ", " + oneStudent.regNo + ", " + oneStudent.gender + ", " + oneStudent.phoneNo + " }");
            }
        }

        @Override
        public void printStudentWithNameStartingFrom(String name) {
            System.out.println("Students with name starting from " + name + ":");
            for (Student oneStudent : students) {
                if (oneStudent.name.startsWith(name))
                    System.out.println("Student: { " + oneStudent.name + ", " + oneStudent.regNo + ", " + oneStudent.gender + ", " + oneStudent.phoneNo + " }");
            }
        }
    }
}
