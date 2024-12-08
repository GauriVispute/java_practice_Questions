package Array_practice;
import java.util.Scanner;
public class no_of_occurrences {
    public static int occurrences_of_numbers_in_array(int [] n ,int target){
        int count = 0;
        for (int i =0;i<n.length;i++){
            if(n[i]== target )
                count+=1;
        }
        return count;
    }

    public static void main(String[] args) {
        int numbers [] = {1,2,3,2,2,4,5,6,6,8,9,3,2,2};
        System.out.print("Enter the number to check no of occurrences : ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("number has occurred "+occurrences_of_numbers_in_array(numbers,target)+" times in array");
    }
}
