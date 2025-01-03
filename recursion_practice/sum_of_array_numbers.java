package recursion_practice;

public class sum_of_array_numbers {
    public static int sum(int arr [],int i){
        if(i == arr.length){
            return 0;
        }
        return arr[i]+sum(arr,i+1);
    }

    public static void main(String[] args) {
        int arr [] = {3,7,1,4,1};
        System.out.println(sum(arr,0));
    }
}