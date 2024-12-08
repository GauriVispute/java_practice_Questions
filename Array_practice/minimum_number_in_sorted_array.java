package Array_practice;

public class minimum_number_in_sorted_array {

    public static int minimumNoInSortedArray(int n[]){
        // for(int i=0;i<2;i++){
        //     int temp = n[i];
        //     for(int j=0;j<n.length-1;j++){
        //         n[j]=n[j+1];
        //     }
        //     n[n.length-1]=temp;
        // }

        int min=Integer.MAX_VALUE;
        for(int i = 0;i<n.length;i++){
            min = Math.min(min,n[i]);
        }
        return min;
    }

    public static void printArray(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }

    public static void main(String[] args) {
        int numbers [] = {5, 6, 1, 2, 3, 4};
        printArray(numbers);
       System.out.println("\nMinimum value : "+minimumNoInSortedArray(numbers));
    }
}
