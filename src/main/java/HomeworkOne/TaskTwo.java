package HomeworkOne;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        int numberOne = 0;
        int numberTwo = 0;

        boolean errorOne = false;
        boolean errorTwo = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number one: ");

        try {
            numberOne = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong data format for number one.");
            errorOne = true;
        }

        System.out.print("Enter number two: ");

        try {
            numberTwo = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong data format for number two.");
            errorTwo = true;
        } finally {
            if (errorOne || errorTwo) {
                System.out.println("It is not possible to perform calculations.");
            } else {
                System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
                System.out.println(numberOne + " * " + numberTwo + " = " + numberOne * numberTwo);
            }
        }
    }

}
