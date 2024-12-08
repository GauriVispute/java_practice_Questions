package ArraySortingAlgoPractice;

public class insertion_sort_algo {

    public static void insertionSort(int n[]){
        for(int i=1;i<n.length;i++){
            int current = n[i];
            int prev = i-1;
            while(prev>=0 && n[prev]>current){
                n[prev+1] = n[prev];
                prev--;
            }
            n[prev+1] = current;
        }
    }

    public static void printArray(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }

    public static void main(String[] args) {
        int numbers [] = {3,6,2,1,8,7,4,5,3,1};
        insertionSort(numbers);
        printArray(numbers);
    }
}
