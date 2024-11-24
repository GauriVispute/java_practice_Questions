package Arrays;

public class max_min_subarray_sum {

    public static void maxSubarraySum(int n[]){
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<n.length;i++){
            int start = i;
            for(int j = i;j<n.length;j++){
               int end = j;
               int sum = 0 ;
               for(int k = start;k<=end;k++){
                    //System.out.print(n[k]+" ");
                    //need to calculate the subarray which has maximum sum and print the sum only
                    sum += n[k];
               }
               System.out.println(" Sum = "+sum); 
                if(sum > max){
                    max = sum;
                }
            }
            System.out.println();
        }
        System.out.println("max Value : "+max);
    }

    public static void main(String[] args) {
        int numbers [] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}
