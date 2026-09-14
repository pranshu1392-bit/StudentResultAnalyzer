import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    void add(Student student) {
        students.add(student);
    }

    Student find(int id) {

        for (Student student : students) {
            if (student.id == id)
                return student;
        }

        return null;
    }

    void showAll() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {

            double percentage =
                    ResultCalculator.percentage(student.marks);

            System.out.println(
                    student.id + " - " +
                    student.name + " - " +
                    String.format("%.2f", percentage) +
                    "% - " +
                    ResultCalculator.grade(percentage)
            );
        }
    }
}