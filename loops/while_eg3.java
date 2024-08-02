package loops;

import java.util.*;
public class while_eg3 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int counter = 1;
        while(counter <=n){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
