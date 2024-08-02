package function.function_practice_qn;

public class Qn3 {
    public static int reverseNum(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev =rev*10+rem;
            n/=10;
        }
        return rev;
    }

    public static void palindrome(int n){
        int myNum = n;
        if(reverseNum(n)==myNum){
            System.out.println(myNum +" is palindrome!");
        } else{
            System.out.println(myNum +" is not palindrome!");
        }

    }

    public static void main(String[] args) {
        palindrome(12341);
    }
}