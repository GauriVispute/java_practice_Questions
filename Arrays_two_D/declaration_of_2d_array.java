package Arrays_two_D;
import java.util.Scanner;
public class declaration_of_2d_array {
    public static void main(String[] args) {
        int matrix [][] = new int [3][3];
        int m = matrix.length,n=matrix[0].length;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter martix numbers : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Final matrix : ");
        //Traverse
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
