package function.function_practice_qn;

public class Qn5 {
    public static int sumDigit(int n){
        int sum =0 ;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigit(12345));
    }
}
