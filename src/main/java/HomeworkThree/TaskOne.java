package HomeworkThree;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a gender: ");
        String gender = scanner.nextLine();

        switch (gender.toLowerCase()) {
            case "m":
                System.out.println("You are M");
                break;
            case "f":
                System.out.println("You are F");
                break;
            default:
                System.out.println("Undefined");
        }
    }
}

