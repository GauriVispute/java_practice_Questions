package recursion_practice;

public class check_palindrome_string {
    public static boolean isPalindrome(String str,int start,int end){
        if(start == end+1){
            return true;
        }
        //kaam
        if(str.charAt(start) == str.charAt(str.length()-1-start)){
            isPalindrome(str,start+1,end);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str,0,str.length()/2));
    }
}
