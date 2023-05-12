package com.codewithLeetCode;

public class Soduko_Solver {
    public void solveSudoku(char[][] board) {

solve(board);

    }

    private boolean solve(char[][] board) {

        for(int i = 0 ; i<board.length; i++)
        {
            for(int j = 0; j<board.length; j++)
            {
                if(board[i][j]=='.')
                {
                    for(char i1 = '1'; i<='9'; i++)
                    {
                        if(isvalid(board, i, j, i1)){
                            board[i][j] =  i1;

                            if(solve(board))
                            {
                                return true;
                            }
                            else{
                                board[i][j] = '.';
                            }

                        }
                        return false;
                    }

                }
            }
        }
        return true;
    }

    private boolean isvalid(char[][] board, int row, int col, char val) {
        for(int i=0; i<9; i++)
        {
            if(board[row][i]==val)
            {
                return false;
            }
            if(board[i][col]==val)
            {
                return false;
            }
            if(board[3*(row/3) + i/3][3 * (col/3) + i%3]==val)
            {
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args) {

    }
}
