package Array_practice;

public class subarray_sum_zero {

    public static int subarraySumZero(int n[],int sum){
        int count = 0;
        for(int i=0;i<n.length;i++){
            int start = i;
            for(int j = i;j<n.length;j++){
                int end = j;
                int currSum = 0;
                for(int k = start;k<=end;k++){
                    currSum += n[k];
                }
                if(currSum == 0){
                    count+=1;
                }
            }
        }
      return count;
    }
    
    public static void main(String [] args){
        int numbers [] = {4, 2, 0, 1, -1, 6};
        System.out.println("numbers of pairs : "+subarraySumZero(numbers,0));
    }
}
