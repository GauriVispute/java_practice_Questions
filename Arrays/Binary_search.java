package Arrays;

public class Binary_search {

    public static int binarySearch(int n[],int key){
        int start =0,end = n.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;

            if(n[mid] == key){
                return mid;
            }
            else if (n[mid]<key){ //right
               start = mid+1;
            }else { // number[mid]>key   //left
               end=mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int  number [] = {2,4,6,8,10,12,14}; 
        int key =25;
        System.out.println("Key at index " +binarySearch(number, key) );

    }
}