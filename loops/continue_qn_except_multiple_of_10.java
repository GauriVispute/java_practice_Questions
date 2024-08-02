package loops;

import java.util.Scanner;

public class continue_qn_except_multiple_of_10 {
    @SuppressWarnings("resource")
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        /*
        while (true) {
            System.out.print("Ente number : ");
            int number = sc.nextInt();
            if (number%10 == 0) {
                continue;
            }
            System.out.println(number);
        }*/

        do {
            System.out.print("Enter number : ");
            int number = sc.nextInt();
            if(number %10 ==0){
                continue;
            }
            System.out.println(number);
        } while (true);


    }
}
