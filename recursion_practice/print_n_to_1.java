package recursion_practice;

public class print_n_to_1{
    public static void printDecrease(int n){
        if(n == 0){
            return ;
        }
        System.out.println(n);
        printDecrease(n-1);
    }
    public static void main(String [] args){
        printDecrease(10);
    }
}