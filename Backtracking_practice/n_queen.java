package Backtracking_practice;

public class n_queen {
    static int count = 0;

    public static void printBoard(char board[][]){
        System.out.println("---------ChessBoard -------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][],int row,int col){
        // vertically up //col constant
        for(int i = row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // Digonally left
        
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Digonally right
        
        for(int i=row-1,j=col+1;i>=0 && j<board.length;j++,i--){
                if(board[i][j] == 'Q'){
                    return false;
                }
        }

        return true;
    }
    public static void nQueen(char board[][],int row){
        if(row == board.length){
            count++;
            printBoard(board);
            return;
        }

        for(int j=0;j<board.length;j++){ //colums o to board.length
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueen(board,row+1);   //recursion step
                board[row][j] = 'x';  //backtracking step
            }
        }
    }

    public static void main(String[] args) {
        int n = 8;
        char board[][] = new char [n][n];

        //initialization
        for(int i = 0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j] = 'x';
            }
        }

        nQueen(board,0);
        System.out.println("Toal Solutions : "+count);
    }
}