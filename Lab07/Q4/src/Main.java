public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("2021001", "John Doe", 85.5),
            new Student("2021002", "Jane Smith", 90.0)
        };
        Student.serializeStudents(students, "serial.txt");
        Student[] studentsFromFile = Student.deserializeFromFile("serial.txt");
        for (Student s : studentsFromFile) {
            System.out.println(s);
        }
    }
}