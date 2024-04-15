import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        double number = 0;
        boolean error = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            number = scanner.nextDouble();
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                System.out.println("Next time enter a number.");
            } else {
                System.out.println(Math.pow(number, 2));
            }
        }
    }
}
