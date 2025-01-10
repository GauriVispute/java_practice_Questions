package Divide_and_Conquer;

public class search_pivoted_rotated_array {
    public static int search(int arr [],int si,int ei,int target){
        if(si>ei){
            return -1;
        }

        int mid = si+(ei-si)/2;

        if(arr[mid] == target){
            return mid;
        }

       //case Four
       
        if(arr[si]<=arr[mid]){
            //arr[si]<=tar<=arr[mid]
            //left
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr,si,mid-1,target);
            }else{
                //right
                return search(arr,mid+1,ei,target);
            }
        } 
        // on line 2
        else{ // arr[si]>=arr[mid]
            // left
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr,si,mid-1,target);
            }else{
                //right
                return search(arr,mid+1,ei,target);
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {4,5,6,7,0,1,2};
        int target = 6 ;
        int tarIdx = search(arr,0,arr.length-1,target);
        System.out.println(tarIdx);
    }
}