package ArraySortingAlgorithms;

public class counting_sort {

    public static void countingSort(int n[]){
        
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n.length;i++){
            max = Math.max(max,n[i]);
        }

        // find frquency of each number
        int count [] = new int [max+1];// Because starts from 0//
        for(int i = 0;i<n.length;i++){
            count[n[i]]++;
        }
        //sorting
        int j =0;
        for(int i=0;i<n.length-1;i++){
            while(count[i]>0){
                n[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int n[]){
        for(int i =0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    } 

    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
       //int arr[]  =  {3,6,2,1,8,7,4,5,3,1};
       countingSort(arr);
        printArray(arr);
    }
}
