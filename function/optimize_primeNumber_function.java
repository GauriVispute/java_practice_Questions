package function;

public class optimize_primeNumber_function {
    public static boolean isPrime (int n){
        // prime no is give as 'True'
        if(n ==2 ){
            return true;
        }
        for (int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true; 
    }

    public static void main(String [] args){
        System.out.println(isPrime(7));
    }
}
