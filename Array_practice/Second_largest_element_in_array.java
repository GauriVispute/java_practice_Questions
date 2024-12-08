package Array_practice;

import java.util.*;

public class Second_largest_element_in_array {

    public static int secondLargestNumber(int [] n){
        int  max = n[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i =1;i<n.length;i++){
            if(max<n[i]){
                //max = n[i];
                secondMax = max;
                max = n[i];
            }else if(n[i]>secondMax && max!=n[i]){
                secondMax = n[i];
            }else{//duplicate case
                secondMax=-1;
            }
            
        }
        return secondMax;
    }

    public static void main(String[] args) {

        int number [] = {34,2,1,67,40};
        
        System.out.println(secondLargestNumber(number));
    }
}
