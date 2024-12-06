package Arrays.Array_practice;

public class triplets_sum_zero {

    public static void triplesSumZero(int n []){
        System.out.print("[");
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length-1;j++){
                int k = j+1;
                if(i!=j && j!=k && k!=i && (n[i]+n[j]+n[k] == 0)){
                    //if(n[i]+n[j]+n[k] == 0){
                        System.out.print("["+n[i]+","+n[j]+","+n[k]+"] ");
                    //}
                }
            }
        }
        System.out.print("\b]");
    }

    public static void main(String [] args){
        int numbers [] = {-1, 0, 1, 2, -1, -4};
        triplesSumZero(numbers);
    }
}
