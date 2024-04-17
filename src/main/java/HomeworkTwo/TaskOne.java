package HomeworkTwo;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        double number = 0;

        try {
            System.out.print("Enter a number: ");
            number = scanner.nextDouble();
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                System.out.println("Enter a number next time.");
            } else {
                System.out.println(number >= 0 ? "Number is positive." : "Number is negative");
            }
        }
    }
}
