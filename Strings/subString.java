package Strings;

public class subString {

        public static void subString(String str ,int si,int ei){
            for(int i=si;i<ei;i++){
                System.out.print(str.charAt(i));
            }
        }
        public static void main(String[] args) {
        String str = "HelloWorld";
            //subString(str,0,5);
        System.out.print(str.substring(4,7));
    }
}
