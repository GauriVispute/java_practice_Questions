package Strings_practice;
import java.util.Scanner;

public class check_anagrams_string {

    public static boolean checkAnagramsString(String str1,String str2){
        
        int count=0;
        for(int i=0;i<str1.length();i++){
            for(int j=0;i<str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    count++;
                    break; 
                }
            }
            if(count == str1.length()){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String str1 ,str2 ;
        System.out.print(" Enter 1st String : ");
        str1 = sc.next();
        System.out.print(" Enter 2nd String : ");
        str2 = sc.next();
        
        if(checkAnagramsString(str1,str2) == true){
            System.out.println("Strings are Anagrams");
        } else{
            System.out.println("Strings are not Anagrams");
        }
    }
}