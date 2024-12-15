package Strings;
import java.util.Scanner;
 
public class create_string {

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char str [] = {'a','b','c','d'};
        String str1 = "abcd";
        String str2 = new String ("xyz");

        // Strings are IMMUTABLE //
        
        /*
         * 
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter name :  ");
         String name;
         name = sc.nextLine();
         System.out.print(name);

         String fullName = "Tony Stark";
         System.out.println(fullname.length());
         */

        String firstname = "Gauri";
        String lastname = "Vispute";
        String fullname = firstname +" "+lastname;
        //System.out.println(fullname);
        //System.out.println(fullname+" is this");
        //System.out.println(fullname.charAt(0));
        //printLetters(fullname);

    }
}