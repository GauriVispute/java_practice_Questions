package Backtracking;

public class n_rooks {
    static int count = 0;
    public static void printBoard(char board[][]){
        System.out.println("---------chess board-------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        // towards up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'R'){
                return false;
            }
        }
        return true;
    }

    public static void nRooks(char board [][],int row){
       if(row == board.length){
            count++;
            printBoard(board);
            return;
       }
       
        //possiblle places solution
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'R';
                nRooks(board,row+1);
                board[row][j] = 'X';
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char [n][n];
        //initialization
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        nRooks(board , 0);
        System.out.println("Total solutions : "+count);
    }
}
