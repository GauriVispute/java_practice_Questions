package Arrays;

public class print_subarray {
    public static void printSubarray(int n[]){
        for(int i =0;i<n.length;i++){
            int start = i;
            System.out.print("("+n[start]+")");
            for(int j =i+1;j<n.length;j++){
                int end = j;
                System.out.print("(");
                for(int k =start;k<=end;k++){
                    System.out.print(n[k]+" ");
                }System.out.print(")");
            }
            System.out.println();
        }
            
    } 
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarray(numbers);

    }
}
