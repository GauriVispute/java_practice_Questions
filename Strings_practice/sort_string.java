package Strings_practice;

public class sort_string {

    public static String sortString(String str){
        StringBuilder sb = new StringBuilder("");
        char ch [] = new char [str.length()];

        for(int i = 0;i<ch.length;i++){
             ch[i]= str.charAt(i);
        }

        // selection sort
        for(int i = 0;i<ch.length-1;i++){
            int minPos = i;
            for(int j = i+1;j<ch.length;j++){
                if(ch[minPos]>ch[j]){
                    minPos = j;
                }
                //sort
                int temp = ch[minPos];
                ch[minPos] = ch[i];
                ch[i] = (char)temp; 
            }
        }

        for(int i = 0;i<ch.length;i++){
            sb.append(ch[i]);
       }

        return sb.toString();
    } 

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(sortString(str));
    }
}