package Arrays.Array_practice;

public class count_pairs_with_sum___twoSum{

    public static int pairsWithSum(int n[],int sum){
       
      int count=0;
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i]+n[j] == sum){
                    System.out.print("("+n[i]+","+n[j]+")"+" ");
                    count+=1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int numbers [] = {10, 12, 10, 15, -1};
        System.out.println("Number of pairs : "+pairsWithSum(numbers,20));
    }
}