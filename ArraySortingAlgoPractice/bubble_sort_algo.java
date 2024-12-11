package ArraySortingAlgoPractice;

public class bubble_sort_algo {

    public static void bubbleSort(int n[]){
       // Time complexity := O(n^2)
        int swaps = 0;
        for(int i=0;i<n.length-1;i++){ // no. of turns
            for(int j=0;j<n.length-1-i;j++){
                if(n[j]>n[j+1]){
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                    swaps+=1;
                }
            }
            //edge case t.c:= O(n) if array is sorted
            if(swaps==0){
                System.out.println("Array is sorted!!");
                break;
            }
        }
    }

    public static void printArray(int n []){
        for(int i=0;i<n.length;i++)
            System.out.print(n[i]+" ");
    }

    public static void main(String[] args) {
       //int numbers [] = {3,6,2,1,8,7,4,5,3,1};
        int numbers [] = {5,4,1,3,2};
        bubbleSort(numbers);
        printArray(numbers);
    }
}
