package recursion_practice;

public class binary_to_decimal {
    static int count = -1;
    public static int binToDec(int n){
        if(n==0){
            return 0;
        }
        count++;
        return binToDec(n/10) + n%10 * (int)Math.pow(2,count);

    }

    public static void main(String[] args) {
        int n = 1010;
        System.out.println(binToDec(n));
    }
}