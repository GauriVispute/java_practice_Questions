package Backtracking;


public class n_queen {
    static int solution = 0;

    public static void printBoard(char board[][]){
        
        System.out.println("---------chess Board-------");
        for(int i=0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        //vertically left
        for(int i =row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] =='Q'){
                return false;
            }
        }

        //vertically right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public static void nQueen(char board[][],int row){
        if(row == board.length){
            //printBoard(board);
            solution++;
            return ;
        }
        for(int j=0;j<board[0].length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueen(board,row+1); //recursion step
                board[row][j] = 'x'; // bracktracking step
            }
        }
    }
    public static void main(String[] args) {
        int n =8;
        char board [][] = new char [n][n];
        // nQ in nRows
        // initisalization step
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'x';
            }
        }
        nQueen(board,0);
        System.out.print("Total no of solutions : "+solution);
    }
}
