package function;

public class binominal_coefficent {
    public static int factorial(int n){
        int f =1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f ;
    }

// public static float factorial(int n ){
//     int f =1;
//         for(int i=1;i<=n;i++){
//             f*=i;
//         }
//         return f ;
// }

    public static int binomialCoefficient(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nMinusR_fact=factorial(n-r);

        int binomial_coeff = n_fact/(r_fact*nMinusR_fact);
        return binomial_coeff;
    }
     public static void main(String[] args) {
        int n =5,r =2;
        System.out.println("Binominal Coefficent = "+ binomialCoefficient(n,r));
    }
}
