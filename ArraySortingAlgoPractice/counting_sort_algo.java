package Arrays.sortingAlgorithms.sortingAlgoPractice;

public class counting_sort_algo {

    public static void countingSort(int n[]){
        int maxN= Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++)
            maxN=Math.max(maxN,n[i]);

        // counting frequencies of each no.
        int count[] = new int [maxN+1];
        for(int i=0;i<n.length;i++){
            count[n[i]]++;
        }

        int j=0;
        for(int i=0;i<n.length-1;i++){
            while(count[i]>0){
                n[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int n[]){
        for(int i=0;i<n.length;i++)
            System.out.print(n[i]+" ");
    }

    public static void main(String[] args) {
        int numbers [] = {3,6,2,1,8,7,4,5,3,1};
        countingSort(numbers);
        printArray(numbers);

    }
}
