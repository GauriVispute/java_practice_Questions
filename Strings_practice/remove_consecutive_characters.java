package Strings_practice;

public class remove_consecutive_characters {
    public static String removeConsecutiveCharacters(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                i++;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbaaaa";
        System.out.println(removeConsecutiveCharacters(str));
    }
}
