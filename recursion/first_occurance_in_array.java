package recursion;

public class first_occurance_in_array {
    public static int firstOccurance(int arr [],int i,int key){
        //Base case
        if(i == arr.length){
            return -1;
        }        
        if(arr[i] == key){
            return i;
        } 
        return firstOccurance(arr,i+1,key);
    }
    
    public static void main(String[] args) {
        int arr [] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurance(arr, 0, 3));
    }
}
