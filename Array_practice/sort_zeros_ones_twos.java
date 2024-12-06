package Arrays.Array_practice;

public class sort_zeros_ones_twos {

    public static void printArray(int n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }

    public static void sortZerosOnesTwos(int n[]){
       for(int i=0;i<n.length-1;i++){
            for(int j=0;j<n.length-1-i;j++){
                if(n[j]>n[j+1]){
                    //swap
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] =temp;
                }
            }   
       }
    }

    public static void main(String [] args) {
        int numbers [] = {0, 1, 2, 0, 1, 2};
        sortZerosOnesTwos(numbers);
        printArray(numbers);
    }
}
