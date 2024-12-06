package Arrays.Array_practice;

public class count_subarray_with_equal_zero_and_ones {
    /*
     * no of 1s and no.of zeros equal
     */

    public static int countSubarrayWithEqualZerosAndOnes(int n[]){
        int count = 0 ;
        for(int i = 0;i<n.length;i++){
            int start = 0;
            for(int j = i+1;j<n.length;j++){
                int end = j;
                int sum = 0;
                int countFor1=0;
                int countFor0=0;
                System.out.print("(");
                for(int k =start;k<=end;k++){
                    sum+=n[k];
                    System.out.print(n[k]+" ");
                    if(n[k] == 1){
                        countFor1 +=1;
                    }else{
                        countFor0 += 1;
                    }
                }
                System.out.println(")   Sum : "+sum);
                if(countFor1 == countFor0){
                    count+=1;
                }
            }
            System.out.println();
        }
        return count;
    }

     public static void main(String [] args){
        int numbers [] = {1, 0, 0, 1, 0, 1, 1};
        System.out.println("Count = "+countSubarrayWithEqualZerosAndOnes(numbers));
     }
}
