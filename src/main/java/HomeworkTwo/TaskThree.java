package HomeworkTwo;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        int year = 0;

        try {
            System.out.print("Enter a year: ");
            year = scanner.nextInt();
        } catch (Exception e) {
            error = true;
        } finally {
            if (error || year < 0) {
                System.out.println("Enter a valid year.");
            } else {
                System.out.println(year % 4 == 0 ? "It is a leap year." : "It is not a leap year.");
            }
        }
    }
}

