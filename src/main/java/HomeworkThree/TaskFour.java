package HomeworkThree;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean error = false;

        try {
            System.out.print("Enter a number for factorial: ");
            number = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("Next time enter a number.");
            error = true;
        }
        finally {
            if(!error && number >= 0){
                int fact = 1;
                while (number > 0){
                    fact *= number;
                    number--;
                }
                System.out.println("Factorial of entered number = " + fact);
            }
        }
    }
}
