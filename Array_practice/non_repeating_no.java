package Arrays.Array_practice;

public class non_repeating_no {

    public static int nonRepeatingNo(int n[]){
        int number=0;
        for(int i=0;i<n.length;i++){
            number=n[i];
            int count = 1;
            for(int j=0;j<n.length;j++){
                if(i!=j && n[i]==n[j]){
                    count++;
                }
            }
            if(count==1){
                return number;                
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers [] = {-1, 2, -1, 3, 0}; 
        System.out.println("first Non_repeating no. : "+nonRepeatingNo(numbers));
    }    
}
