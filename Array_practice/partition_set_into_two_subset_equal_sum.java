package Array_practice;

public class partition_set_into_two_subset_equal_sum {

    public static boolean partitionSetIntoTwoSubset(int n[],int sum){
        int count = 0;
        for(int i = 0 ;i<n.length;i++){
            if(n[i]==sum){
                System.out.println("["+n[i]+"]");
                count++;
            } else{
                for(int j = i+1;j<n.length;j++){
                    if(n[i]+n[j] == sum){
                        System.out.print("["+n[i]+","+n[j]+"]\n");
                        count++;
                    } else{
                        for(int k = j+1;k<n.length;k++){
                            if(i!=j && j!=k && k!=i &&(n[i]+n[j]+n[k] == sum )){
                                System.out.println("["+n[i]+","+n[j]+","+n[k]+"]");
                                count++;
                            }
                        }
                    }                
                }
            }
        }

        if(count==2){
            return true;
        }
        return false ;
    }

    public static void main(String[] args) {
        int numbers [] = {1,5,11,5,1};
       System.out.println("Partition is possible : "+partitionSetIntoTwoSubset(numbers,12));
    }
}
