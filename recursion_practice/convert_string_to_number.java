package recursion_practice;
public class convert_string_to_number{
    static String digit [] = {"zero","one","two","three","four","five","six","seven","eight","nine"}; 
    public static  void convertStringToNumber(int n){
        if(n == 0){
            return ;
        }
        int lastDigit = n%10;
        convertStringToNumber(n/10);
        System.out.print(digit[lastDigit]+" ");
    }
       
    public static void main(String[] args) {
       convertStringToNumber(2025);
       
    }
}