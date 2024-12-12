package Arrays_two_D_practice;

public class maximum_countNo_row {

    public static void maximumCountNoRow(int matrix[][],int target){
        int maxCount = Integer.MIN_VALUE;
        int index = 0;

        for(int i=0;i<matrix.length;i++){
            int count = 0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
            index = i;
        }
        System.out.print("Maximum count of 1 is "+maxCount+" in row "+index);
    } 

    public static void main(String[] args) {
        int matrix [][] = {{1,0,1},
                           {1,2,1},
                           {1,1,1}};
        maximumCountNoRow(matrix,1);
    }
}