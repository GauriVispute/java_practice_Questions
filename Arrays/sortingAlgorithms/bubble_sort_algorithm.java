package Arrays.sortingAlgorithms;

public class bubble_sort_algorithm {
    public static void bubbleSort(int n[]){
        /*NOTE : (both are same) but written in differnt way
         * for(turns = 0 to n-2 ) n-2 is included [0,n-2]
         * for(int turns = 0;turns<=n.length-2;turns++)
         * for(j = 0 to n-2-turns) is includes
         * 
         * OR you can write:
         * for(turns = 0 to n-1) n-1 is not included (0,n-1) 
         * values will be  0,1,2,3
         */

        int swaps = 0;
        for(int turns = 0;turns<n.length-1;turns++){
           // int swaps = 0;
            for(int j = 0;j<n.length-1-turns;j++){
                if(n[j]>n[j+1]){
                    int temp = n[j]; // big value
                    n[j] = n[j+1];
                    n[j+1] = temp;

                    swaps++;
                }
            }
            if(swaps == 0){
                System.out.println("array is sorted!!");
                break;
            }
        }
        System.out.println("No.of swaps : "+swaps);
    }

    public static void printArray(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }

    public static void main(String [] args){
        int array [] = {5,4,1,2,3};
        bubbleSort(array);
        printArray(array);
    }
}
