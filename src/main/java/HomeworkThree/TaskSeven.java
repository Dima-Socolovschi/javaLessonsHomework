package HomeworkThree;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean error = false;

        try {
            System.out.print("Enter a number for 7 sequence: ");
            number = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("Next time enter a number.");
            error = true;
        }
        finally {
            if(!error){
                for(int i = 0 ; i < 11 ; i++){
                    System.out.print(number + " ");
                    number += 7;
                }
            }
        }
    }
}
