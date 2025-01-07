package recursion_practice;
public class binary_search_by_recursion {
    public static  int binarySearch(int arr [],int low,int high,int key){
        if( low>high){
            return -1;
        }
        
        int mid = low+(high-low)/2;
        if(arr[mid] == key){
            return mid;
        } else if(key>arr[mid]){
            return binarySearch(arr,mid+1,high,key);
        } else{//key<arr[i]
            return binarySearch(arr,low,mid-1,key);
        }
    }

    public static void main(String[] args) {
        //only for sorted unique array
        int arr[]= {23,30,47,85,90};
        System.out.println(binarySearch(arr,0,arr.length-1,90));
    }
}