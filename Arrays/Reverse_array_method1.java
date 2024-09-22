package Arrays;

public class Reverse_array_method1 {

    public static void reverseArray(int num[]){
        int n=num.length-1;
        for(int i =0 ;i<n/2;i++){
            //swap
            int temp = num[i];
            num[i] = num[n-i];
            num[n-i] = temp;
        }
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        reverseArray(numbers);
        for (int i = 0; i <numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
