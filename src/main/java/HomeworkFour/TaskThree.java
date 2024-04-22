package HomeworkFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TaskThree {
    public static void main(String[] args) {

        // Task: Write a Java program to find the intersection of two arrays (common elements).

        Integer[] arr1 = {1,2,3,4,5,9};
        Integer[] arr2 = {1,5,7,8,9,4,3};
        ArrayList<Integer> coms = new ArrayList<Integer>();

        for(int i = 0 ; i < arr1.length ; i++){
            for(int j = 0 ; j < arr2.length ; j++){
                if(arr1[i].equals(arr2[j]) && !coms.contains(arr1[i])){
                    coms.add(arr1[i]);
                }
            }
        }

        System.out.println(coms);

    }
}
