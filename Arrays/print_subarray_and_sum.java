package Arrays;

public class print_subarray_and_sum {

    public static void  printSubarraySum(int n[]){
        /*
         * 1st finding the subarray 
         * then finding the 'Sum of array'
         * find the Max and Min numbers of sum
         * find the total_subarray(ts)  
        */
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int ts = 0;

        for(int i =0 ;i<n.length;i++){
            int start = i;
            for(int j = i;j<n.length;j++){
                int end = j ;
                System.out.print("(");
                int sum = 0;
                for(int k=start;k<=end;k++){
                    System.out.print(n[k]+" ");
                    sum += n[k];
                    if (sum>max){
                        max = sum;
                    }
                    if(sum<min){
                        min = sum;
                    }
                }System.out.println(")"+" Sum = "+sum);
                 ts+=1;
            }
            System.out.println();
        }

        System.out.println("Total Subarray = "+ts);
        System.out.print("Maximum = "+max+" , Minimum = "+min);

    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarraySum(numbers);   
    }
}
