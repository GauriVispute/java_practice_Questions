package Arrays.sortingAlgorithms;

public class insertion_sort_algorithm {

    public static void insertionSort(int n[]){
        for(int i=1;i<n.length-1;i++){// no .of turns :n-1 turns
            int curr = n[i];
            int prev = i-1;
            while(prev>=0 && n[prev]>curr){
                n[prev+1]=n[prev];
                prev--;
            }
           n[prev+1] =  curr;
        }
    }

    public static void printArray(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }

    public static void main(String[] args) {
        int array[] = {5,4,1,2,3};
        insertionSort(array);
        printArray(array);
     }
}
