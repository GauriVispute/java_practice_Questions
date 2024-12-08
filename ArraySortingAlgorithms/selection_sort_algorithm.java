package ArraySortingAlgorithms;

public class Selection_sort_algorithm{

    public static void selectionSort(int n[]){     
        for(int i =0;i<n.length-1;i++){ // no. of turn 
            int minPos = i;
            for(int j=i+1;j<n.length;j++){
                if(n[minPos]<n[j]){
                    minPos = j;
                }
            }
            //swaps
            int temp = n[minPos];
             n[minPos]= n[i];
             n[i]=temp; 
        }

        /*
         * time complexity  = O(n^2)
         * it is differnt from bubble sort because 
         * we are avoiding the number of unneccessary swaps 
         */
    }

    public static void printArray(int n []){
        for(int i = 0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }

    public static void main(String [] args){
        int array [] = {5,4,1,2,3};
        selectionSort(array);
        printArray(array);
    }
}