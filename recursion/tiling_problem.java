package recursion;

public class tiling_problem {
    public static int tilingProblem(int n){
        if(n ==0 || n==1){
            return 1;
        }
        // //choice 
        // //vertical
        // int fnm1 = tilingProblem(n-1);
        // //horizontial
        // int fnm2 = tilingProblem(n-2);

        return tilingProblem(n-1)+tilingProblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}