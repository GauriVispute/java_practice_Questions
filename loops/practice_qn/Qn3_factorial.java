package loops.practice_qn;

import java.util.*;
public class Qn3_factorial {
    public static void main(String[] args) {
       @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in); 

       System.out.print("Enter number :  ");
       int number = sc.nextInt();

       int fact =1;
       for(int i =1;i<=number;i++){
        fact *= i;
    }
       System.out.println("Factorial of "+number+"! = "+fact);
    }
}
