package Strings_practice;

public class print_duplicates_in_string {

    public static String sortString(String str){
        //create array of string length
        char ch [] = new char [str.length()];
        //store string in char array 
        for(int i=0;i<ch.length;i++){
            ch[i] = str.charAt(i);
        }
        //sorting :slection sort
        for(int i=0;i<ch.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<ch.length;j++){
                if(ch[minPos]>ch[j]){
                    minPos=j;
                }
            }
            char temp = ch[minPos];
            ch[minPos] = ch[i];
            ch[i] = temp;
        }

        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<ch.length;i++){
            sb.append(ch[i]);
        }

       return sb.toString();
    }

    public static void printAllDuplicates(String str){
        String str1 = sortString(str);
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str1.length()-1 && str1.charAt(i) == str1.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                System.out.println(str1.charAt(i)+" : "+count);
            }
        }
    }


    public static void main(String[] args) {
        String str = "avadhutvispute";
        printAllDuplicates(str);
        //sortString(str);
    }
}
