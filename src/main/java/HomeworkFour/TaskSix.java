package HomeworkFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskSix {
    public static void main(String[] args) {

        //Write a Java program to merge two sorted arrays into a single sorted array.

        Integer[] arr1 = {2,1,3,5,4};
        Integer[] arr2 = {1,5,7,8,9,4,3};

        List<Integer> sorted = new ArrayList<>(List.of(arr1));
        sorted.addAll(List.of(arr2));
        Collections.sort(sorted);
        System.out.println(sorted);

    }
}
