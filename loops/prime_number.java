package loops;

import java.util.*;
public class prime_number {
    @SuppressWarnings("resource")
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente number : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                isPrime =false;
            }
        }
        if (isPrime == true) {
            System.out.println(n+" is Prime number");
        } else {
            System.out.println(n+" is not Prime number");
        }
    }
}
