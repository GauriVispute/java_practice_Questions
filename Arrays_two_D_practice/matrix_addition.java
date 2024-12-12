package Arrays_two_D_practice;

public class matrix_addition {

    public static void printMatrix(int matrix[][]){
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void matrixAddition(int m1[][],int m2[][]){

        int matrix[][] = new int [m1.length][m2[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               // unsolved
            }
        }
        
        printMatrix(matrix);
    }

    public static void main(String[] args) {
        int m1 [][] = {{1,1,1},
                        {2,2,2},
                        {3,3,3}};

        int m2 [][] = {{1,1,1},
                        {2,2,2},
                        {3,3,3}};

        // m-> mmatrix
        matrixAddition(m1,m2);
    }
}