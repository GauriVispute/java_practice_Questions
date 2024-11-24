package Arrays.Array_practice;

public class max_min_subarray {
 
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void maxMinNumber(int sum){
        if (sum>max) {
            max=sum;
        } else {
            min = sum;
        }
    }

    public static void subarrays(int n []){
        
        for(int i = 0 ;i<n.length;i++){
            int start = i;
            for(int j=i;j<n.length;j++){
                int end = j;
                int sum = 0;
                for(int k = start;k<=end;k++){
                    System.out.print(n[k]+ " ");
                    sum += n[k];
                }
                System.out.println("Sum = "+sum);
                maxMinNumber(sum);
            }
            System.out.println();
        }
        System.out.println("Maximum : "+max+"\nMinimum : "+min);
    }

    public static void main(String [] args){
        int numbers[] = {2,4,6,8,10};
        subarrays(numbers);
    } 
}
