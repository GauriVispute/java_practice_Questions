package Arrays.Array_practice;

public class pairs_in_array {

    public static void pairsInArray(int [] n ){
        int tp = 0;
        for(int i=0;i<n.length;i++){
            int current = n[i];
            for(int j=i+1;j<n.length;j++){
                System.out.print("("+current+","+n[j]+")");
                tp+=1;
            }
            System.out.println();
        }
        System.out.println("Total pairs : "+tp);

        // tp  = n(n-1)/2
        /*
         * 1+2+3+4...n-1
        */
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        pairsInArray(numbers);
    }
}
