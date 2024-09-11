package Arrays.Array_practice;
import java.util.*; 
public class largest_no {
    public static void largest_smallest_no(int n[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n.length;i++){
            if(n[i]>max)
                max = n[i];
            if(n[i]<min)
                min = n[i];
        }

        System.out.println("largest number = "+max);
        System.out.println("Smallest number = "+min);
    }
    public static void main(String[] args) {
        int number[] = {99,2,6,3,4,5,1};

        largest_smallest_no(number);
    }
}
