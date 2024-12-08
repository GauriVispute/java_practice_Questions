package Array_practice;

public class cyclic_rotate_and_target_element {

    public static int  cyclicRotateAndTarget(int n []){
        for(int i=0;i<3;i++){// no.of rotations
            int temp = n[0];
            for(int j=0;j<n.length-1;j++){
                n[j] = n[j+1];
            }
            n[n.length-1]=temp;
        }

        System.out.print("Rotated array after 3 shifts : ");

        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }

        System.out.println();
        int target = 2;
        for(int i=0;i<n.length;i++){
            if(target == n[i]){
                return i;
            }
        }

        return -1;
    }

    public static void main(String [] args){
        int numbers [] ={1,2,3,4,5};
        System.out.println("Target element index : "+cyclicRotateAndTarget(numbers));
    }
}
