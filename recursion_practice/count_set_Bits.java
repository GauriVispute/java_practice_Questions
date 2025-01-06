package recursion_practice;

public class count_set_Bits {
   
    
   public static void  countSetBit(int n,int count){
    
        if(n==0){
            System.out.println(count);        
            return ;
        }
        if(n%2== 1){
            count++;
        }
    countSetBit(n/2,count);
   }
    public static void main(String[] args) {
       countSetBit(100,0);
    }   
}
