package Arrays_two_D;

public class sum_of_digonals {

    public static int sumOfDiagonals(int matrix [][]){
        int sum=0;
        /* 
        * Time complexity :=O(n^2)

        for(int i =0;i<matrix.length;i++){           
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum +=matrix[i][j];
                }
                if(i+j == matrix[0].length-1 && !(i==j)){
                    sum+= matrix[i][j];
                }
            }
        }
        */

        // T.C:= O(n)
        
        for(int i=0;i<matrix.length;i++){
            //primary diagonal
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){// edge condition
                //secondary diagonal
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // int matrix[][] = {{1,2,3,4},
        //                   {5,6,7,8},
        //                   {9,10,11,12},
        //                   {13,14,15,16}};
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        
        System.out.println("Sum of Digonals = "+sumOfDiagonals(matrix));
    }
}
