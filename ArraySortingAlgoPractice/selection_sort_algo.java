package ArraySortingAlgoPractice;

public class selection_sort_algo {

    public static void selectionSort(int n[]){
        for(int i=0;i<n.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<n.length;j++){
                if(n[minPos]>n[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = n[minPos];
            n[minPos] = n[i];
            n[i]=temp;
        }
    }

    public static void printArray(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }

    public static void main(String[] args) {
        int numbers[] = {3,6,2,1,8,7,4,5,3,1};
        selectionSort(numbers);
        printArray(numbers);
    }
}
