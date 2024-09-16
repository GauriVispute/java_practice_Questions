package Arrays;



public class largest_smallest_no {
    public static void largestSmallestNo(int n[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n.length;i++){
            if(n[i]>max)
                max = n[i];
            if(n[i]<min)
                min = n[i];
        }

        System.out.println("largest number = "+max);
        System.out.println("Smallest number = "+min);
    }
    public static void main(String[] args) {
        int number[] = {23,45,7,3,1,90,22};

        largestSmallestNo(number);
    }
}
