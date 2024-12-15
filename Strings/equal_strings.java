package Strings;

public class equal_strings {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        /*
         * 
         if(s1==s2){
            System.out.println("Strings are Equal");
        } else{
            System.out.println("Strings are not Equal");
        }
        
        if(s2==s3){
            System.out.println("Strings are Equal");
        } else{
            System.out.println("Strings are not Equal");
        }
        */

        if(s1.equals(s3)){
            System.out.println("Strings are Equal");
        } else{
            System.out.println("Strings are not Equal");
        }
    }
}
