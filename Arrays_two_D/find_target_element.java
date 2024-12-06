package Arrays_two_D;
import java.util.Scanner;
public class find_target_element {
    
    public static boolean search(int matrix[][],int number){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == number){
                    System.out.println(" Number found = ("+i+","+j+")");
                    return  true;
                }
            }
        } 
        System.out.println("number not found!!");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix : ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
       search(matrix,8);
    }
}