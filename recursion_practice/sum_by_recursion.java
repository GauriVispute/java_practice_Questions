package recursion_practice;

public class sum_by_recursion {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(6));
    }
}