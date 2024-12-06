package Arrays_two_D;

public class staircase_search {
    public static boolean stairCaseSearch(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        // bottom ,left
        while(row<=matrix.length-1 && col>=0){
            if(matrix[row][col] == key){
                System.out.println("Key found in ("+row+","+col+")");
                return true;
            } else if(key <matrix[row][col]){
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
    public static boolean stairCase_search(int matrix[][],int key){
        int row = matrix.length-1;
        int col = 0;
        // top , right
        while(row>=0 && col<=matrix.length){
            if(matrix[row][col] == key){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            } else if(key>matrix[row][col]){
                col++;
            } else{
                row--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix [][] = {{10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                           {32,33,39,50}};
        
        //stairCaseSearch(matrix, 27);
        stairCase_search(matrix,45);
    }
}
