package recursion_practice;
public class max_min_in_array {
    static void  minMaxInArray(int arr [] , int i,int max,int min){
        if(i == arr.length){
            System.out.println("Max : "+max+"\nMin : "+min);
            return;
        }
        max = Math.max(arr[i],max);
        min = Math.min(arr[i],min);
        minMaxInArray(arr,i+1,max,min);
    }
    public static void main(String[] args) {
        int arr[] = {2,6,7,1,10};
        minMaxInArray(arr,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}