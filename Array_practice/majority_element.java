package Arrays.Array_practice;

public class majority_element {

    public static int majorityElement(int n[]){
        int number = 0;
        for(int i =0;i<n.length;i++){
            int count = 0;
            for(int j=i;j<n.length;j++){
                if(n[i] == n[j]){
                    number=n[j];
                    count+=1;
                }
            }
            if(count>n.length/2){
                System.out.print("Majority Element = "+number+" Repeates = "+count+" times");
                return 0;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        int numbers [] = {3, 3, 4, 2, 4, 4, 2, 4};
        if(majorityElement(numbers) == -1){
            System.out.print("No majority Element !!");
        }
    }
}
