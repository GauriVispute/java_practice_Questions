package Strings_practice;

public class valid_paranthesis {
    public static int validParanthesis(String str){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '('){
                count++;
            } else{
                count--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "]]()((()))((";
        if(validParanthesis(str) == 0 ){
            System.out.println("Has valid Parenthesis");
        } else{
            System.out.println("Paranthesis are not valid");
        }
    }
}
