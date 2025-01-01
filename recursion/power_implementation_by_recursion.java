package recursion;

public class power_implementation_by_recursion {

    public static int power(int base,int indices){
        if(indices == 0){
            return 1; //2^0 = 1
        }
        // int xnm1 = power(base,indices-1);
        // int xn = base*result;
        // return xn;
        return base*power(base,indices-1);

    }
    public static void main(String[] args) {
       System.out.println(power(2,4));
    }
}