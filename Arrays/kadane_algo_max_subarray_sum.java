package Arrays;

public class kadance_algo_max_subarray_sum {
public static void  kadaneAlgo(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    
    System.out.println("cs  ms");
    for(int i =0 ;i<numbers.length;i++){
        cs = cs + numbers[i];
        if(cs<0){
            cs = 0;
        }
        
        ms = Math.max(cs,ms);
        System.out.println(cs+"   "+ms);

    }
    System.out.println("Maximum sum : "+ms);
    
  }

    public static void main(String[] args){
        int numbers [] = {-2,-1,4,-1,-2,1,5,-3};
        kadaneAlgo(numbers);
    }
}
