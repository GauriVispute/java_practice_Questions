package loops.practice_qn;

import java.util.Scanner;

public class Qn2_sumEven_or_sumOdd {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int sumEven= 0,sumOdd=0,number,choice=1;
        
        do{
            System.out.print("Enter number : ");
            number = sc.nextInt();
            if(number%2 == 0){
                sumEven += number;
            } else{
                sumOdd += number;
            }

            System.out.print(" Enter choice (1 to continue or 0 for exit) : ");
            choice = sc.nextInt();

        }while(choice == 1);
        System.out.println("Sum of Even Integers = "+sumEven);
        System.out.println("Sum of Odd Integers = "+sumOdd);
    }
}
