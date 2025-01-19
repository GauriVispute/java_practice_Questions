package Backtracking;

public class grid {
    public static int gridProblem(int i,int j,int n,int m){
        //base case
        if(i == n-1 && j==m-1){
            return 1;
        } else if(i==n || j==m){
            return 0;
        }

        // choice 
        // right 
        int w1 = gridProblem(i,j+1,n,m);
        // down
        int w2 = gridProblem(i+1,j,n,m);
        return w1+w2;
    }

    public static void main(String[] args) {
        int n=3, m=3;
        //int grid[][] = new int [n][m];
    
        System.out.println("Total ways : "+gridProblem(0,0,n,m));
    }
}
