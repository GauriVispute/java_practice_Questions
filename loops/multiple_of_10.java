package loops;

import java.util.*;
public class multiple_of_10 {
    @SuppressWarnings("resource")
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter number : ");
            int number = sc.nextInt();
            if(number%10 == 0){
                break;
            }
            System.out.println(number);
        }
        System.out.println("out of loop!");
    }
}
