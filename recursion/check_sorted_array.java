package recursion;

public class check_sorted_array {

    public static boolean isSorted(int arr [],int i){
        //base case
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        if(isSorted(arr,0) == true){
            System.out.println("Array is sorted");
        } else{
            System.out.println("Array is not sorted");
        }
    }
}