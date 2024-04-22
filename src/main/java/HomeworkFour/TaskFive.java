package HomeworkFour;

import java.util.Arrays;

public class TaskFive {
    public static void main(String[] args) {

        //Write a Java program to search for a specific element in an array and return its index.

        Integer[] arr1 = {1,2,3,4,5,9};
        int itemToSearch = 3;

        System.out.println(Arrays.asList(arr1).indexOf(itemToSearch));
    }
}
