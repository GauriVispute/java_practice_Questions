package Backtracking;

import Strings.subString;

public class permutations_of_string {
    //public static int count = 0;
    public static void  findPermutation(String str,String ans){
        if(str.length()==0){
            //count++;
            System.out.println(ans);
            return ;
        }
        //no.of choices for a string between characters for 1st sit
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            //del the current element
            // "abcde"="ab"+"de" = "abde";
            String NewStr = str.substring(0,i)+str.substring(i+1);
            findPermutation(NewStr,ans+curr);
        }

    }

    public static void main(String[] args) {
        String str = "abcdef";
        findPermutation(str,"");
        //System.out.println(count);
    //System.out.println(str.substring(0,0));
    }
}
