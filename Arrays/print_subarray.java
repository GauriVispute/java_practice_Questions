package Arrays;

public class print_subarray {
    public static void printSubarray(int n[]){
        int ts = 0;
        for(int i =0;i<n.length;i++){
            int start = i;
          //  System.out.print("("+n[start]+")");
            for(int j =i;j<n.length;j++){
                int end = j;
                System.out.print("(");
                for(int k =start;k<=end;k++){
                    System.out.print(n[k]+" ");
                }System.out.print(")");
                ts += 1;
            }
            System.out.println();
        }

        System.out.println("Total subarray = "+ts);
            
    } 
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarray(numbers);

    }
}
