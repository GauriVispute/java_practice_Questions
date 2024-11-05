package Arrays.Array_practice;

public class Second_largest_element_in_array {

    public static int secondLargestNumber(int [] n){
        int  max = n[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i =0;i<n.length;i++){
            if(max<n[i]){
                //max = n[i];
                secondMax = max;
                max = n[i];
                if(max<secondMax){
                    break;
                }
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int number [] = {23,1,8,7,66};
        System.out.println(secondLargestNumber(number));
    }
}
