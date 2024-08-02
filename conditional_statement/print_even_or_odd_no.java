package conditional_statement;

import java.util.Scanner;

public class print_even_or_odd_no {
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        if (n%2 ==0){
            System.out.println(n+" is Even number");
        } else{
            System.out.println(n+" is Odd number");
        }
    }
}
