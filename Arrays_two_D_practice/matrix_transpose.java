package Arrays_two_D_practice;

public class matrix_transpose {

    public static void printMatrix(int matrix[][]){
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void transposeMatrix(int matrix[][]){
        /* 
         matrix[0].length-1
         matrix.length-1        
         */
        int transpose[][] = new int [2][3];
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        printMatrix(transpose);
    }

    public static void main(String[] args) {
        int m1 [][] = {{1,1},
                       {2,2},
                       {3,3}};
        printMatrix(m1);
        System.out.println();
        transposeMatrix(m1);
        System.out.println("Transpose matrix : ");
    }
}
