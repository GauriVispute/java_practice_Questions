package conditional_statement.practice_qn_Conditonal_statement;

import java.util.*;

public class postive_or_negative_no {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (positive / negative) : ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println(number+" is positive");
        } else {
            if(number == 0){
                System.out.println(number+" neither positive nor negative");
            }
            else{
                System.out.println(number+" is negative");
            }
        }

    }
}
