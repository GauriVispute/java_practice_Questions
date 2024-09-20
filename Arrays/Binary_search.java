package Arrays;

public class Binary_search {
    public static int binarySearch(int number [],int key){
        int start =0,end = number.length;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid]<key){
                mid = start+1;
            }else { // number[mid]>key
                mid = end-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int  number [] = {2,4,6,8,10,12,14}; 
        int key =10;

        System.out.println("key at index "+binarySearch(number,key));
    }
}
