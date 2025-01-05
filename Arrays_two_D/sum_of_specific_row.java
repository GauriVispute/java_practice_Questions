package Arrays_two_D;

public class sum_of_specific_row {

    public static int  sumofSpecificRow(int matrix[][],int row){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==row){
                    sum+=matrix[i][j];
                }
                if(i>row){
                    break;
                }
            }
        }
        return sum ;
    }

    public static void main(String[] args) {
        int matrix [][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(sumofSpecificRow(matrix, 1));
    }
}
