package recursion;

public class power_optimize_code {
    static int count ;

    public static int optimizePower(int x,int n){
        
        if(n == 0){
            return 1;
        }

        /* O(n)
         * if(n%2 ==0){
         *      return OptimizePower(x,n/2)*OptimizePower(x,n/2);
         * } else{
         *   n-=1;;
         *      return x * optimizePower(x,n/2)*OptimizePower(x,n/2);
         * }
         * 
         */
        
        int halfPower = optimizePower(x,n/2);
        int halfPowerSq = halfPower*halfPower;

        if(n%2 != 0){
            halfPowerSq =  x*halfPowerSq;
        }
            return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(optimizePower(2,6));
        
    }
}