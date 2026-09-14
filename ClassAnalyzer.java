<<<<<<< HEAD
import java.util.ArrayList;

public class ClassAnalyzer {

    static void analyze(ArrayList<Student> students) {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        double sum = 0;
        Student topper = students.get(0);

        for (Student student : students) {

            double percentage =
                    ResultCalculator.percentage(student.marks);

            sum += percentage;

            if (percentage >
                    ResultCalculator.percentage(topper.marks)) {

                topper = student;
            }
        }

        double average = sum / students.size();

        System.out.println("\n===== CLASS ANALYSIS =====");

        System.out.printf(
                "Class Average : %.2f%%%n",
                average
        );

        System.out.println(
                "Topper        : " +
                topper.name
        );

        System.out.printf(
                "Topper Marks  : %.2f%%%n",
                ResultCalculator.percentage(topper.marks)
        );
    }
=======
import java.util.ArrayList;

public class ClassAnalyzer {

    static void analyze(ArrayList<Student> students) {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        double sum = 0;
        Student topper = students.get(0);

        for (Student student : students) {

            double percentage =
                    ResultCalculator.percentage(student.marks);

            sum += percentage;

            if (percentage >
                    ResultCalculator.percentage(topper.marks)) {

                topper = student;
            }
        }

        double average = sum / students.size();

        System.out.println("\n===== CLASS ANALYSIS =====");

        System.out.printf(
                "Class Average : %.2f%%%n",
                average
        );

        System.out.println(
                "Topper        : " +
                topper.name
        );

        System.out.printf(
                "Topper Marks  : %.2f%%%n",
                ResultCalculator.percentage(topper.marks)
        );
    }
>>>>>>> f15896a26f8e5eacf82401342913cf516e3b612f
}