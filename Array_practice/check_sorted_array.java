package Array_practice;

public class check_sorted_array {

    public static boolean sorted_array(int [] n){
        boolean flag = true;
        for(int i = 0;i<n.length-1;i++){
            if(n[i]>n[i+1]){
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int numbers [] = {1,4,5,8,2,7};
        if(sorted_array(numbers) != true){
            System.out.println("Array is not sorted");
        }else{
            System.out.println("Array is sorted");
        }
    }
}
