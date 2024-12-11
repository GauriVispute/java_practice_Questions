package Array_practice;

public class max_sum_in_configuration {
    public static void cyclicRotationByOne(int n[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){        
            int temp = n[0];
            for(int j=1;j<n.length;j++){
                n[j-1]=n[j];
            }
            n[n.length-1] = temp;

            // display all rotations
            int sum = 0;
            for(int j=0;j<n.length;j++){
               System.out.print(n[j]+" ");
               max = Math.max(max,sum+=n[j]*j);
            }
            System.out.print("   sum = "+sum+"\n");
        }
        System.out.println("Maximum sum in configuration : "+max);        
    }

 public static void main(String[] args) {
    int numbers [] = {4,13};
    cyclicRotationByOne(numbers);
 }   
}