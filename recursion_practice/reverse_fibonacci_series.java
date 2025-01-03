package recursion_practice;
public class reverse_fibonacci_series {
    public static void fib(int n,int a,int b){
        if(n> -1){
            fib(n-1,b,a+b);
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        fib(10,0,1);
    }
}