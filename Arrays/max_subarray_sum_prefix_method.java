package Arrays;

public class max_subarray_sum_prefix_method {
    
    public static void maxSubarray(int n []){
        int prefix [] = new int [n.length];
        int max = Integer.MIN_VALUE;
        int sum = 0 ;

        prefix[0] = n[0];
        for(int i =1 ;i<n.length;i++){
            prefix[i] = n[i]+prefix[i-1];
        }

        for(int i = 0;i<n.length;i++){
            int start = i;
            for(int j=i;j<n.length;j++){
                int end = j;
                sum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];

                if(sum>max){
                    max =sum;
                    System.out.println(max+" ");
                }
            }
        }
        System.out.println("Maximum : "+max);       
    }

    public static void main(String[] args) {
        int arr [] = {1,-2,6,-1,3};      
        maxSubarray(arr);
    }
}
