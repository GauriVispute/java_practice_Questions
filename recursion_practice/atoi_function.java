package recursion_practice;

public class atoi_function {
     public static int power = 0;
    public static int atoi(String str,int i){
        if(i == str.length()){
            power = 0;
            return 0;
        }
        int c1 = (int)str.charAt(i)*(int)Math.pow(10,power++);
        int c2 = (int)atoi(str,i+1)*(int)Math.pow(10,power++);
        
        return   c1+c2 ;       
    }
    public static void main(String[] args) {
        String str = "112";
        System.out.print(atoi(str,0));
    }
}
