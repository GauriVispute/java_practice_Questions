package recursion;

public class last_occurrance_in_array {
    public static int lastOccurance(int arr [] , int i,int key){
        //base case
        if(i == -1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurance(arr,i-1,key);
    }

    public static void main(String[] args) {
        int arr [] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurance(arr,arr.length-1,5));
    }
}