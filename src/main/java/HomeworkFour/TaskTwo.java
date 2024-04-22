package HomeworkFour;

import java.util.Arrays;
import java.util.Collections;

public class TaskTwo {
    public static void main(String[] args) {

        // Task: Write a Java program to sort an array of integers in ascending and descending order.

        Integer[] arr1 = {2,1,3,5,4};

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr1));
    }
}
