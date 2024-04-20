package HomeworkThree;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        double[] numbers = new double[2];
        int value = 0;

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.print("Enter a number: ");
                numbers[i] = scanner.nextDouble();
            } catch (Exception e) {
                error = true;
            } finally {
                if (error) {
                    System.out.println("Next time enter a number.");
                    break;
                }
            }
        }
        if (!error) {
            if(numbers[0] < numbers[1]){
                value = 1;
            }
            else if(numbers[0] > numbers[1]){
                value = 2;
            }

            switch (value){
                case 1:
                    System.out.println("Max number is : " + numbers[1]);
                    break;
                case 2:
                    System.out.println("Max number is : " + numbers[0]);
                case 0:
                    System.out.println("No Max number.");
            }
        }
    }
}
