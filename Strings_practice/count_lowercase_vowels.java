package Strings_practice;
import java.util.Scanner;

public class count_lowercase_vowels {
    public static int countLowerCaseVowels(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter string : ");
        // String str = sc.nextLine();
        // System.out.println(countLowerCaseVowels(str));

       // Qn3 : 
       String str1 = "ApnaCollege";
       str1  = str1.replace("l","");
       System.out.println(str1);
    }
}
