package HomeworkTwo;

import java.util.List;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        double[] numbers = new double[3];

        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("Enter number " + (i+1) + " : ");
                numbers[i] = scanner.nextDouble();
            } catch (Exception e) {
                error = true;
                break;
            }
        }

        if (error) {
            System.out.println("Invalid data provided.");
        } else {
            double maxValue = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > maxValue) {
                    maxValue = numbers[i];
                }
            }
            System.out.println("Greatest value is: " + maxValue);
        }
    }
}
