package recursion;

public class last_occurance {
    public static int lastOccurance(int arr [],int i,int key){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr,i+1,key);
        if(isFound == -1 && arr [i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr [] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurance(arr,0,5));
    }
}