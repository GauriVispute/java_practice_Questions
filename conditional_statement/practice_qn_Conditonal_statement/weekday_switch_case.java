package conditional_statement.practice_qn_Conditonal_statement;

import java.util.*;
public class weekday_switch_case {
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number(1-7) : ");
        int number = sc.nextInt();

        switch (number) {
            case 1 : System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday");
            break;
            default:System.out.println("oop! wrong number enter");
                break;
        }
    }
}
