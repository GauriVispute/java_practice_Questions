package Arrays.Array_practice;

public class printSubarray {
    public static void print_subarray(int n[]){
        int ts = 0;
        for(int i =0;i<n.length;i++){
            int start = i;
            for(int j=i;j<n.length;j++){
                int end  = j;
                System.out.print("(");
                for(int k =start ;k<=end ; k++){
                    System.out.print(" "+n[k]);
                }
                ts +=1;
                System.out.print(" )");
            }
            System.out.println();
        }
        System.out.println("Total Subarry : "+ts);
        
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        print_subarray(numbers);
    }
}
