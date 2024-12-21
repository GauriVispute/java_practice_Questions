package Bit_manipulation;

public class check_power_of_two {

public static boolean validPowerOfTwo(int n){
    // if((n & (n-1) ) == 0){
    //     System.out.println("valid power of 2");
    // } else{
    //     System.out.println("Not power of Two");
    // }

    return (n &(n-1)) == 0 ; 
}

    public static void main(String[] args) {
        System.out.println(validPowerOfTwo(4));
        //validPowerOfTwo(7);
    }
}
