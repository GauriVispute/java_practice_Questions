package conditional_statement;

import java.util.*;

public class ternary_operator_eg {
    public static void main(String [] args){
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Marks : ");
        int marks = sc.nextInt();

        String reportCard  =  (marks >=33)? "Pass" : "Fail";
        System.out.println(reportCard); 
    }
}
