package recursion_practice;
public class bubble_sort {

    // public static void swap(int n1,int n2){
    //     int temp = n1;
    //     n1 = n2;
    //     n2 = temp;
    // }

    public static void bubbleSort(int arr[],int i){
        if(i == arr.length-1){
            return ;
        }
        for(int j = 0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        bubbleSort(arr,i+1);
    }

    public static void main(String[] args) {
        int arr [] = {5,3,1,2,4}; 
        bubbleSort(arr,0);
        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}