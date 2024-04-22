package HomeworkFour;

import java.util.*;

public class TaskOne {
    public static void main(String[] args) {

        // Task: Write a Java program to reverse an array of integers.

        Integer[] arr1 = {1,2,3,4,5};

        Collections.reverse(Arrays.asList(arr1));

        System.out.println(Arrays.toString(arr1));

    }
}
