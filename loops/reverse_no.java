package loops;

import java.util.Scanner;

public class reverse_no {
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter number : ");
       int n = sc.nextInt();
    
       int rev = 0;
       while(n>0){
            int div = n%10;
            rev = rev*10+div;
            n=n/10;
       }
      System.out.println("Reverse number : "+rev);
    }
}
