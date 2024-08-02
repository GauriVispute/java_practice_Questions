package function;

public class factorial_function {
    public static int factorial(int n){
        int f=1;
        for(int i =1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n = 7;
        
        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
}
