package recursion_practice;

public class string_length {
    public static int strLength(String str){
        if(str.length() == 0)
            return 0;
        return strLength(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str = "Gauri";
        System.out.println(strLength(str));
    }
}