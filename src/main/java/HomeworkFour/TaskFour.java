package HomeworkFour;

import java.util.Arrays;
import java.util.Collections;

public class TaskFour {
    public static void main(String[] args) {

        //Write a Java program to calculate the average of all elements in an integer array.

        int[] arr1 = {1,2,3,4,5,9};

        System.out.println((Arrays.stream(arr1).sum())/arr1.length);

    }
}
