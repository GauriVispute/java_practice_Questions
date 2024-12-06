package Arrays.Array_practice;

public class check_if_array_is_subset_of_another_array {

    public static boolean checkArraySubsetInAnotherArray(int [] arr1,int [] arr2){
        int count = 0;
        for(int i=0;i<arr2.length;i++){
            int current = arr2[i];
            for(int j=0;j<arr1.length;j++){
                if(current == arr1[j]){
                    count+=1;
                    break; 
                    /*
                     it 's only used to break the inner j loop not the outer loop
                    */
                    }
            }
        }
        if(count == arr2.length){
            return true;
        }
        return false;
    }

    public static void main(String [] args){
        int arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} ;
        //int arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3}  ;
        if(checkArraySubsetInAnotherArray(arr1,arr2)==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
