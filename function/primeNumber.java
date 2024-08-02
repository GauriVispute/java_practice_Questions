package function;

public class primeNumber {
    public static boolean isPrime  (int n){
        if(n == 2){
            return true;
        }
        //boolean isPrime = true;
        for(int i =2 ;i<=n-1;i++){
            if (n%2 == 0 ) {
               // isPrime = false;
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    
    }
}
