package recursion_practice;

public class reverse_a_string {
    public static void reverse(String str,int i,StringBuilder sb){
        if(i == -1){
            System.out.println(sb.toString());
            return ;
        }
        //kaam
        sb.append(str.charAt(i));
        
        reverse(str,i-1,sb);
        

    }
    public static void main(String[] args) {
        String str = "gauri";
        reverse(str,str.length()-1,new StringBuilder(""));
    }
}
