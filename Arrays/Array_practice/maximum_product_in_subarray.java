package Arrays.Array_practice;

public class maxium_product_in_subarray {

    public static int maximumProductInSubarray(int n[]){
        int maxP = Integer.MIN_VALUE;
        int range [] = new int[2];
        for(int i=0;i<n.length;i++){
            int start = i;
            for(int j=i;j<n.length;j++){
                int end =j;
                int p = 1;
                for(int k=start;k<=end;k++){
                    //System.out.print(n[k]+" ");
                    p*=n[k];
                    maxP = Math.max(maxP,p);
                }
            }
        }
        return maxP;
    }

    public static void main(String [] args){
        int numbers [] = {-2, 6, -3, -10, 0, 2};
        System.out.println("Maximum product : "+maximumProductInSubarray(numbers));
    }
}