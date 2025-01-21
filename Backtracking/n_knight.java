package Backtracking;

public class n_knight {

    static int k;
    static int h;
    public static void printBoard(char board[][]){
        System.out.println("--------Chess Board--------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][],int row,int col){
        //left to up
         k=0;
         h=0;
        while(k<2){
            h = col--;
            k++;
        }
        if(board[row-1][h] == 'K'){
            return false;
        }
        
        //up left and up right
         k=0;
        h=0;
        while(k<2){
            h=row--;
            k++;
        }
        if(board[h][col-1] == 'K'){
            return false;
        } if(board[h][col+1] == 'K'){
            return false;
        }
      
        //right up
        k=0;
        h=0;
        while(k<2){
            h = col++;
            k++;
        }
        if(board[row-1][h] == 'K'){
            return false;
        }
    
        return true;
    }

    public static void nKnight(char board[][],int row){
        if(row == board.length){
            printBoard(board);
            return;
        }

        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='K';
                nKnight(board,row+1);
                board[row][j]='X';
            }
        }
    }

    public static void main(String[] args) {
        int n=3;
        char board [][] = new char [n][n];
        //initialization
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }

        nKnight(board,0);
    }
}