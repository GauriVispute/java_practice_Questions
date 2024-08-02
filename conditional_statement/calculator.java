package conditional_statement;

import java.util.*;
public class calculator {
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 :");
        float n1 = sc.nextFloat();
        System.out.print("Enter number 2 : ");
        float n2 = sc.nextFloat();

        System.out.print("Enter your choice +,-,*,/,% : ");
        char operator = sc.next().charAt(0);

        float result=0;

        switch(operator){
            case '+' : result = n1+n2;
            break;
            case '-' : result = n1-n2;
            break;
            case '*' : result = n1*n2;
            break;
            case '/' : result = n1/n2;
            break;
            case '%' : result = n1%n2;
            break;
            default : System.out.println("oops! ");
        }

        System.out.println("Result = "+result);

    }
}
