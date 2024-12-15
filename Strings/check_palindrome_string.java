package Strings;

public class check_palindrome_string {
    public static boolean isPalindrome(String str){
        
        int len = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(len-1-i)){
               return false;
            } 
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Gauri";
        System.out.println(isPalindrome(str));;
    }
}
