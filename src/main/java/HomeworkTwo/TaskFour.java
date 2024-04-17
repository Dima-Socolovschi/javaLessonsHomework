package HomeworkTwo;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        double[] numbers = new double[5];

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Enter number " + (i + 1) + " : ");
                numbers[i] = scanner.nextDouble();
            } catch (Exception e) {
                error = true;
                break;
            }
        }

        if (error) {
            System.out.println("Invalid data provided.");
        } else {
            double sum = 0;

            for (double number : numbers) {
                sum += number;
            }

            System.out.println("Sum of numbers is: " + sum + " and average is: " +  sum/numbers.length);


        }
    }
}
