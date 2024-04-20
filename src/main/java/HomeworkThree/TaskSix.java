package HomeworkThree;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean error = false;

        try {
            System.out.print("Enter a number for full sum: ");
            number = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("Next time enter a number.");
            error = true;
        }
        finally {
            if(!error && number >= 0){
                int fsum = 0;
                while (number > 0){
                    fsum += number;
                    number--;
                }
                System.out.println("Full sum of entered number = " + fsum);
            }
        }
    }
}
