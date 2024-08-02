package pattern_part2;

public class palindromic_with_number {
    public static void Palindromic_with_Number(int n){
        for(int i =1;i<=n;i++){
            //spaces
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Decending number 
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
             //Acending numberfrom 2
            for(int j = 2;j<=i;j++){
                System.out.print(j);
            }        
            System.out.println();    
        }
       
    } 
    public static void main(String[] args) {
        Palindromic_with_Number(5);
    }
}
