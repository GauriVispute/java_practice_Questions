package recursion_practice;

public class Decimal_to_Binary {
    public static int decToBin(int n){
        if(n==1){
            return 1;
        }
        return decToBin(n/2)*10+n%2;

        // int rem = n%2;
        // int rev = rev*10+rem
        // int div = decToBin(n/2);
    }

    public static void main(String[] args) {
        System.out.println(decToBin(10));
    }
}