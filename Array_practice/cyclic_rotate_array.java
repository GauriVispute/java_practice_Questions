package Arrays.Array_practice;

public class cyclic_rotate_array {

    
    public static void cyclicRotate(int n []){
        int temp = n[0];
        for(int i=0;i<n.length-1;i++){
            n[i] = n[i+1];
        }
        n[n.length-1] = temp;
    }

    public static void main(String [] args){
        int numbers [] = {1,2,3,4,5}; 
        for(int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
        
        cyclicRotate(numbers);
        
        System.out.println();
        for(int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
    }
}
