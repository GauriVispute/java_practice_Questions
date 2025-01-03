package recursion_practice;
public class mean_of_array {

    //hold


    // public static int  sumOfArray(int arr [],int i){
    //     if(i == arr.length){
    //         return 0;
    //     }
    //     return arr[i]+sumOfArray(arr,i+1);
    // }
    public static int meanOfArray(int arr,int i){
        if(i == 1){
            return (int) arr[i-1];
        }
        return (int) ((arr[i]+meanOfArray(arr,i-1)*(i-1))/i);
    }

    public static void main(String[] args) {
        int arr [] = {1,2,5,6};
        //System.out.println(sumOfArray(arr,0)/arr.length);
        int n = arr.length-1;
        System.out.println(meanOfArray(arr,n));
    }
}