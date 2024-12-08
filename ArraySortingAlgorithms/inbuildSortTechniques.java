package ArraySortingAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class inbuildSortTechniques {

    public static void printArray(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Arrays package
        int numbers [] = {5,4,1,2,3};  // t.c :- O(n*logn) 
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    
        // Collection framework
        Integer arr[] = {5,4,1,2,3};
        Arrays.sort(arr,Collections.reverseOrder());
        printArray(arr);

    }

}
