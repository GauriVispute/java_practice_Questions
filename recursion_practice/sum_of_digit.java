package recursion_practice;

public class sum_of_digit {
    public static int sumOfDigit(int n){
        if(n == 0){
            return 0;
        }
        return n%10+sumOfDigit(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(1234));
    }
}
