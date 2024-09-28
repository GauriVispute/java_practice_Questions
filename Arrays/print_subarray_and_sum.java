package Arrays;

public class print_subarray_and_sum {

    public static void  printSubarraySum(int n[]){

        for(int i =0 ;i<n.length;i++){
            int start = i;
            for(int j = i;j<n.length;j++){
                int end = j ;
                System.out.print("(");
                int sum = 0;
                for(int k=start;k<=end;k++){
                    System.out.print(n[k]+" ");
                    sum += n[k];
                }System.out.println(")"+" Sum = "+sum);
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarraySum(numbers);   
    }
}
