class Solution {
    public static boolean check(char[][] board,int row,int col,int num){
        for(int i=0;i<9;i++){
            if(board[row][i]==num) return false;
            if(board[i][col]==num) return false;
            int brow=3*(row/3)+(i/3);
            int bcol=3*(col/3)+(i%3);
            if(board[brow][bcol]==num) return false;
        }
        return true;
    }
    public static boolean solve(char[][] board){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    for(char num='1';num<='9';num++){
                        if(check(board,row,col,num)){
                            board[row][col]=num;
                        if(solve(board)){
                            return true;
                        }
                        board[row][col]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}