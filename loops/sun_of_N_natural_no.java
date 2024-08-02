package loops;

import java .util.*;
public class sun_of_N_natural_no {
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter number : ");
        int number =sc.nextInt();

        int i=1 ,sum=0;

        while(i<=number){
            sum+=i;
            i++;
        }
        System.out.println("Sum = "+sum);

    }
}