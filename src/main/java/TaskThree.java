import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        double side = 0;
        boolean error = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter square side: ");

        try {
            side = scanner.nextDouble();
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                System.out.println("Next time enter a number.");
            } else {
                System.out.println("Area of the square is :  " + Math.pow(side, 2));
                System.out.println("Perimeter of the square is :  " + 4 * side);
            }
        }
    }
}

