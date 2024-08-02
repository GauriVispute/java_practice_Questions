package conditional_statement;

public class largest_of_three_no {
    public static void main(String[] args) {
        int A = 1 , B=2 , C=6;

        if (A>=B &&  A>=C) {
            System.out.println(A+" is greater");
        } else if ( B>=C) {
            System.out.println(B+" is greater");
        }else{
            System.out.println(C+" is greater");
        }
    }
}
