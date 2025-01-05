package Arrays_two_D_practice;

public class maximum_countNo_row {

    public static void maximumCountNoRow(int matrix[][],int target){
        int maxCount = Integer.MIN_VALUE;
        int row = 0;

        for(int i=0;i<matrix.length;i++){
            int count = 0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    count++;
                }
            }
            int prevMax = maxCount;
            maxCount = Math.max(maxCount, count);
            if(maxCount<=matrix.length && prevMax!= maxCount){
                row = i;
            }
        }
        System.out.print("Maximum count of "+target+" is "+maxCount+" in row "+row);
    } 

    public static void main(String[] args) {
        int matrix [][] = {//{0,0,1},
                           {0,1,1},
                           {1,2,1},
                           {1,1,1}};
                           //{1,1,1}
                        
        maximumCountNoRow(matrix,1);
    }
}