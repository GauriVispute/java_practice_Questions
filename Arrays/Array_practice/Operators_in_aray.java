package Arrays.Array_practice;

import java.util.*;

public class Operators_in_aray {

    
    public static int sum(int n[]){
        int sum =0;
        for (int i=0 ;i<n.length;i++){
            sum+=n[i];
        }
        return sum;
    }


   

    public static void main(String[] args) {
        int numbers []=  {1,2,3,4,5};
        System.out.println("Sum of numbers in array = "+sum(numbers));
        
        
    }
}
