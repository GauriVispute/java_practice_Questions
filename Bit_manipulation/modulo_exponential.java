package Bit_manipulation;

public class modulo_exponential {

    public static int moduloExponenetial(int a,int n,int x){
        int ans =1;
        while(n>0){
            if((n&1)==1){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans%x;
    }

    public static void main(String[] args) {
        System.out.println(moduloExponenetial(5, 3, 2));
    }
}
