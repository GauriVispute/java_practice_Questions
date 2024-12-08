package Array_practice;

public class subarray_with_sum{

    public static int[] subarrayWithSum(int n [],int sum){
        int [] range = new int [2]; 
     /*breaks statement 
     only breaks one loop not the multiple 
     it breaks the Inner loop not the Outer-loop
     */
        int num =0;
        for(int i = 0;i<n.length;i++){
            int start = i;
            for(int j=i;j<n.length;j++){
                int end = j;
                int currSum = 0;
                for(int k = start;k<=end;k++){
                    currSum+=n[k];
                }
                if(currSum == sum){
                    range[0] = start+1;
                    range[1] = end+1;
                    return range;
                }
            }
        }
        //if(num == 0){    
            range[0]=range[1] = -1;
        //}
        return range;
    } 

    public static void main(String [] args){
        int numbers[] = {2,4,6,8,10};
        int [] arrayR = subarrayWithSum(numbers,10);
        System.out.print("indices : "+arrayR[0]+","+arrayR[1]+"\n");

        int sum=0;
        for(int i = arrayR[0]-1;i<arrayR[1];i++){
            sum+=numbers[i];
            System.out.print(numbers[i]+" ");
        }
        System.out.println("\nSum : "+sum);

    }
}
