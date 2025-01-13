package recursion_practice;

public class copy_string {
    public static void copyString(char [] str,int i,char [] newStr){
        //base case
        
        if(i == str.length){
            return ;
        }
        newStr[i] = str[i];
        copyString(str,i+1,newStr);
    } 
    public static void main(String[] args) {
        char[] str = "gauri".toCharArray();
        char[] newStr = new char [str.length] ;

        copyString(str,0,newStr);
        for(int i=0;i<newStr.length;i++){
            System.out.print(newStr[i]+" ");
        }
        //System.out.println(String.valueOf(newStr));
    }
}
