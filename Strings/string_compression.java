package Strings;

public class string_compression {

    public static String stringCompression(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<str.length();i++){
           
            //sb.append(str.charAt(i));
            Integer count = 1;
            for(int j =i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                    i++;
                }else{
                    break;
                }
            }
            sb.append(str.charAt(i));
            //sb.append(count);
            //i+=(count-1);   // jump into the next index
            if(count>1){
                sb.append(count);
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
