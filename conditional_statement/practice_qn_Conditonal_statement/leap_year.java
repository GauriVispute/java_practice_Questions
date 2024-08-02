package conditional_statement.practice_qn_Conditonal_statement;
import java.util.*;

public class leap_year {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int number = sc.nextInt();

        if (number%4 ==0 && (!(number%100 ==0 ) || number %400==0 )) {
            System.out.println(number + " is leap year");
        }else{
            System.out.println("Not a leap year");
        }

    }
}
