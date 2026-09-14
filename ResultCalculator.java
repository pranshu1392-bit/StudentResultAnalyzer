<<<<<<< HEAD
public class ResultCalculator {

    static int total(int[] marks) {
        int sum = 0;

        for (int mark : marks)
            sum += mark;

        return sum;
    }

    static double percentage(int[] marks) {
        return total(marks) / 5.0;
    }

    static String grade(double percentage) {

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    static String status(int[] marks) {

        for (int mark : marks) {
            if (mark < 40)
                return "FAIL";
        }

        return "PASS";
    }
=======
public class ResultCalculator {

    static int total(int[] marks) {
        int sum = 0;

        for (int mark : marks)
            sum += mark;

        return sum;
    }

    static double percentage(int[] marks) {
        return total(marks) / 5.0;
    }

    static String grade(double percentage) {

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    static String status(int[] marks) {

        for (int mark : marks) {
            if (mark < 40)
                return "FAIL";
        }

        return "PASS";
    }
>>>>>>> f15896a26f8e5eacf82401342913cf516e3b612f
}