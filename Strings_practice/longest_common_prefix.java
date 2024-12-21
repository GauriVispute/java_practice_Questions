package Strings_practice;

public class longest_common_prefix {

    public static String longestCommonPrefix(String str[]){
        StringBuilder sb = new StringBuilder();
        int minStrlen = Integer.MAX_VALUE;

        for(int i = 0;i<str.length;i++){
            minStrlen = Math.min(minStrlen,str[i].length());
        }
       // System.out.println(minStrlen);

        for(int i=0;i<str.length;i++){ // array iteration
            char ch = str[0].charAt(i);
            char temp = 0;
            for(int j=1;j<minStrlen;j++){
                // System.out.print(j +" ");
                if(ch == str[j].charAt(j-1)){
                    temp = ch;
                }
            }
            sb.append(temp);
            //System.out.println(str[i]);
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String str[] = {"aabb","aabbaaaa","aabbaa","aabbaabb"};
        System.out.println(longestCommonPrefix(str));
        //longestCommonPrefix(str);
    }
}
