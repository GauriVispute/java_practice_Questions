package Arrays_two_D_practice;
import java.util.Scanner;

public class maximum_element_in_every_row {
    public static void maximumElementInEveryRow(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            int maxNo = Integer.MIN_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                maxNo = Math.max(maxNo, matrix[i][j]);
            }
            System.out.print(maxNo+" ");
        }
    }

    public static void main(String[] args) {
        int matrix [][] = {{1,2,3},
                           {1,4,9},
                           {76,34,21}};

    maximumElementInEveryRow(matrix);
    }
}
