package loops.practice_qn;

import java.util.*;
public class Qn4_multiplication_of_table {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter number : ");
        int number = sc.nextInt();

        for(int i = 1 ;i<=10;i++){
            System.out.println(number*i);
        }
    }
}
