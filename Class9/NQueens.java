package Week_1_DP5_CipherSchools.Class9;

public class NQueens {
    /*
    1. Place the queen row wise in the hope of reaching soln
    2. Do the recursive call with this change state of the board for rest of the board
    3. If we reach to soln we will print the board
       else backtrack(restore to it's original state)
     */
    public static boolean placeQueeens(int[][] board,int row){
        if(row== board.length){
            //print the board
            printTheBoard(board);
            System.out.println();
        }
        for(int currentCellIndex=0;currentCellIndex<board.length;currentCellIndex++){
            if(isSafeToPlace(board,row,currentCellIndex)){
                board[row][currentCellIndex]=1;
                boolean canplaceQueens=placeQueeens(board,row+1);
                if(canplaceQueens){
                    return true;
                }
                //backtrack
                board[row][currentCellIndex]=0;
            }

        }
        return false;
    }

    private static void printTheBoard(int[][] board) {
        for(int row=0;row< board.length;row++){
            for(int col=0;col<board[0].length;col++){
                System.out.print(board[row][col]+" ");
            }
            System.out.println();
        }
    }
    private static boolean isSafeToPlace(int[][] board, int CurrentRow, int currentCellIndex) {
        for(int row=0;row<CurrentRow;row++){
            if(board[row][currentCellIndex]==1){
                return false;
            }
        }
        int x=CurrentRow;
        int y=currentCellIndex;
        //above left diagonal
        while (x>=0 && y>=0){
            if(board[x][y]==1){
                return false;
            }
            x--;
            y--;
        }
        x=CurrentRow;
        y=currentCellIndex;
        while (x>=0 && y< board.length){
            if(board[x][y]==1){
                return false;
            }
            x--;
            y++;
        }
        return true;
    }

    public static void main(String[] args) {
        int n=4;
        int[][] board=new int[4][4];
        placeQueeens(board,0);
    }
}
