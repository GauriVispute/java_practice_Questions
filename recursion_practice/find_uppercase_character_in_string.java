package recursion_practice;

public class find_uppercase_character_in_string {

    public static boolean isLowerCaseCharacter(char ch){
        for(char c = 'a';c<='z';c++){
            if(ch == c){
                return true;
            }
        }
        return false;
    }

    public static char findUpperCaseCharacter(String str,int i){
        if(i==str.length()){
            return '\0';
        }

        if(isLowerCaseCharacter(str.charAt(i)) != true){
            return str.charAt(i);
        }else{
            //lower
            return findUpperCaseCharacter(str,i+1);
        }
    } 
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(findUpperCaseCharacter(str,0));
    }
}
