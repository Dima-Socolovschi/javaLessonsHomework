package HomeworkThree;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        double[] numbers = new double[2];

        System.out.print("Enter calal operation(+-*/^): ");
        String operation = scanner.nextLine();

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
            switch (operation){
                case "+":
                    System.out.println(numbers[0] + " + " + numbers[1] + " = " + (numbers[0] + numbers[1]));
                    break;
                case "-":
                    System.out.println(numbers[0] + " - " + numbers[1] + " = " + (numbers[0] - numbers[1]));
                    break;
                case "*":
                    System.out.println(numbers[0] + " * " + numbers[1] + " = " + numbers[0] * numbers[1]);
                    break;
                case "/":
                    System.out.println(numbers[0] + " / " + numbers[1] + " = " + numbers[0] / numbers[1]);
                    break;
                case "^":
                    System.out.println(numbers[0] + " ^ " + numbers[1] + " = " + Math.pow(numbers[0], numbers[1]));
                    break;
                default:
                    System.out.println("Oppps, something went wrong.");
            }
        }
    }
}
