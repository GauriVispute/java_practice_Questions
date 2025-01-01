package recursion;
//factorial
public class fact {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fn_1 = factorial(n-1);
        int fn = n*fn_1;
        return fn;
    } 
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
