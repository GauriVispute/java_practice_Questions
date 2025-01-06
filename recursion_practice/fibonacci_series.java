package recursion_practice;
public class fibonacci_series {
    public static void  fib(int n,int a,int b){
        if(n==-1){
            return ;
        }
        if(n>-1){
            System.out.print(a+" ");
            fib(n-1,b,a+b);
        }
    }


    public static void main(String[] args) {
        fib(50,0,1);
    }
}