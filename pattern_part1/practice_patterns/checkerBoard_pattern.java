package pattern_part1.practice_patterns;
import java.util.Scanner;

public class checkerBoard_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        
        for (int i = 1;i<=number;i++) {
            for(int j=1;j<=number;j++){
                if((i+j) % 2==0){
                    System.out.print(" * ");
                }else{
                    System.out.print(" _ ");
                }
            }
            System.out.println();
        }
    }
}
