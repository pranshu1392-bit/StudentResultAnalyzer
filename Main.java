<<<<<<< HEAD
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {

            System.out.println("\n===== STUDENT RESULT ANALYZER =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. View Result");
            System.out.println("4. Class Analysis");
            System.out.println("5. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent(sc, manager);
                    break;

                case 2:
                    manager.showAll();
                    break;

                case 3:
                    showResult(sc, manager);
                    break;

                case 4:
                    ClassAnalyzer.analyze(manager.students);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void addStudent(
            Scanner sc, StudentManager manager) {

        System.out.print("Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Marks " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        manager.add(new Student(id, name, marks));

        System.out.println("Student added!");
    }

    static void showResult(
            Scanner sc, StudentManager manager) {

        System.out.print("Student ID: ");
        int id = sc.nextInt();

        Student s = manager.find(id);

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        int total = ResultCalculator.total(s.marks);
        double p = ResultCalculator.percentage(s.marks);

        System.out.println("\n===== RESULT =====");
        System.out.println("Name: " + s.name);
        System.out.println("Total: " + total + "/500");
        System.out.printf("Percentage: %.2f%%%n", p);
        System.out.println("Grade: " +
                ResultCalculator.grade(p));
        System.out.println("Status: " +
                ResultCalculator.status(s.marks));
    }
=======
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {

            System.out.println("\n===== STUDENT RESULT ANALYZER =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. View Result");
            System.out.println("4. Class Analysis");
            System.out.println("5. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent(sc, manager);
                    break;

                case 2:
                    manager.showAll();
                    break;

                case 3:
                    showResult(sc, manager);
                    break;

                case 4:
                    ClassAnalyzer.analyze(manager.students);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void addStudent(
            Scanner sc, StudentManager manager) {

        System.out.print("Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Marks " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        manager.add(new Student(id, name, marks));

        System.out.println("Student added!");
    }

    static void showResult(
            Scanner sc, StudentManager manager) {

        System.out.print("Student ID: ");
        int id = sc.nextInt();

        Student s = manager.find(id);

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        int total = ResultCalculator.total(s.marks);
        double p = ResultCalculator.percentage(s.marks);

        System.out.println("\n===== RESULT =====");
        System.out.println("Name: " + s.name);
        System.out.println("Total: " + total + "/500");
        System.out.printf("Percentage: %.2f%%%n", p);
        System.out.println("Grade: " +
                ResultCalculator.grade(p));
        System.out.println("Status: " +
                ResultCalculator.status(s.marks));
    }
>>>>>>> f15896a26f8e5eacf82401342913cf516e3b612f
}