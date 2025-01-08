package recursion_practice;

public class selection_sort_by_recursion {

    public static void selectionSort(int arr[],int i){
        if(i == arr.length-1){
            return ;
        }
        int minPos = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minPos]>arr[j]){
                minPos=j;
            }
        }
        // swap
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;

        selectionSort(arr,i+1);
    }
    public static void main(String[] args) {
        int arr [] = {5,1,3,2,4};
        selectionSort(arr,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
