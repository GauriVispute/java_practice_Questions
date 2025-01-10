package Divide_and_Conquer_practice;

public class binary_search {


    public static int binarySearch(int arr[],int si,int ei,int target){
        //base case
        if(si>ei){
            return -1;
        }
        
        int mid = si+(ei-si)/2;

        if(arr[mid] == target){
            return mid;
        } else if(arr[mid]<target){
            //right
            return binarySearch(arr,mid+1,ei,target);
        } else{
            // left
            return binarySearch(arr,si,mid-1,target);
        }
    }
    public static void main(String[] args) {
        int arr [] = { 1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(binarySearch(arr,0,arr.length-1,target));
    }
}
