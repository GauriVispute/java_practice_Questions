package Arrays.Array_practice;

public class missing_number {

    public static int  missingNumber(int n[]){

        for(int i =1;i<=n.length;i++){
             int count = 0;
            for(int j=0;j<n.length;j++){
                if(i == n[j]){
                    count+=1;
                    break;
                }
            }
            if(count == 0){
                return i;
            }
        }
        return -1;
    }

    /*
        the ith loop is running 
        from [1 to n.length] 
        so i think the ith value 1 to n
        as appeared at least once in jth (actual verifying the number in array)
        so the count will be 0 to change 1

        if count ! change to 1 so it indicates that the number not present in array
        then return the number
        
    */ 

    public static void main(String[] args) {
        int numbers [] = {1, 2, 4, 5};
        System.out.println("Missing Number : "+missingNumber(numbers));
    }
}
// T.C = o(n^2);

/*
 * can optimize to o(n)
 * n =arry.length+1 for including missing
 * by using formula n*(n+1)/2
 * calculate sum of array 
 * Return  expected-sum 
 */