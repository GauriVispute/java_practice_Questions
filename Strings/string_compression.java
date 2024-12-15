package Strings;

public class string_compression {

    public static String stringCompression(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            //sb.append(str.charAt(i));
            Integer count = 1;
            for(int j =i;j<str.length()-1;j++){
                if(str.charAt(j) == str.charAt(j+1)){
                    count++;
                }else{
                    break;
                }
            }
            //sb.append(count);
            i+=(count-1);   // jump into the next index

            if(count>1){
                sb.append(str.charAt(i));
                sb.append(count);
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbccccdd";
       // String str = "abc";
        System.out.println("Compressed String "+stringCompression(str));
    }
}
