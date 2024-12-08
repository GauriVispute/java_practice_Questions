package Array_practice;

public class distinct_elements {

    public static boolean distinctElements(int n []){
        boolean isDistinct = false;
        for(int i=0;i<n.length;i++){
            int current = n[i];
            for(int j = i+1;j<n.length;j++){
                if(current == n[j]){
                    isDistinct = true;
                    break;
                }
            }
        }
        return isDistinct;
    }
    public static void main(String [] args){
        int numbers [] = {1,2,3,1};
        System.out.println(distinctElements(numbers));
    }
}
