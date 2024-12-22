package Bit_manipulation;

public class fast_Exponentiation {

    public static int fastExponention(int a,int n){
        int ans = 1;
        while(n>0){
            if((n & 1) !=0){
                ans = a*ans;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExponention(3, 5));
    }
}
