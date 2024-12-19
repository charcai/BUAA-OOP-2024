import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student implements java.io.Serializable {
    private String studentID;
    private String name;
    private double score;

    public Student(String studentID, String name, double score) {
        this.studentID = studentID;
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return studentID + " " + name + " " + score;
    }

    public static void writeInfoFile(Student[] students, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Student student : students) {
                writer.write(student.studentID + "," + student.name + "," + student.score);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student[] readFromFile(String filePath) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String studentID = parts[0].trim();
                    String name = parts[1].trim();
                    double score = Double.parseDouble(parts[2].trim());
                    students.add(new Student(studentID, name, score));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students.toArray(new Student[0]);
    }

    public static void serializeStudents(Student[] students, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student[] deserializeFromFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (Student[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new Student[0];
    }
}