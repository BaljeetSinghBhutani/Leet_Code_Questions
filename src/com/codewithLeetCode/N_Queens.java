package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Input: n = 4
//        Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
public class N_Queens {
    public List<List<String>> solveNQueens(int n) {

char chess[][] = new char[n][n];
List<List<String>> str = new ArrayList<>();

for(int i =0; i<chess.length; i++)
{
    for(int j = 0; j<chess.length; j++)
    {
        chess[i][j] = '.';
    }
}
NQueens(chess, 0,  str);
       return str;
    }

    public  void NQueens(char chess[][], int row, List<List<String>> str)
    {
        if(row==chess.length)
        {
str.add(contruct(chess));
          return;
        }

        for(int col =0; col< chess.length; col++){

            if(isvalid(chess, row, col))
            {
                chess[row][col] =  'Q';
                NQueens(chess, row+1, str);
                chess[row][col] = '.';

            }

        }



    }

    private List<String> contruct(char[][] chess) {
        List<String> str = new ArrayList<>();
//        String ans = "";
        for (int i = 0; i < chess.length; i++) {
          String ans = new String(chess[i]);
            str.add(ans);
        }

        return str;
    }

    private boolean isvalid(char[][] chess, int row, int col) {
        for(int i = row-1; i>=0; i--)
        {
            if(chess[row][col]=='Q'){
                return false;
            }
        }


        for(int i = row-1 ,j=col-1; i>=0 && j>=0; i--, j--)
        {
            if(chess[row][col]=='Q'){
                return false;
            }
        }

        for(int i = row-1, j =col+1; i>=0 &&  j<chess.length; i--, j++)
        {
            if(chess[row][col]=='Q'){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {

    }
}
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] board=new char[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                board[i][j]='.';
            }
        }
        place(0,board,res);
        return res;
    }
    void place(int col, char[][] board, List<List<String>> res) {
        if (col==board.length){
            res.add(construct(board));
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (validateDup(board,row,col)){
                board[row][col]='Q';
                place(col+1,board,res);
                board[row][col]='.';
            }
        }
    }

    static boolean validateDup(char[][] board, int row, int col) {
        int dupRow=row;
        int dupCol=col;
        while (row>=0&&col>=0){
            if (board[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        row=dupRow;
        col=dupCol;
        while (col>=0){
            if (board[row][col]=='Q'){
                return false;
            }
            col--;
        }
        row=dupRow;
        col=dupCol;
        while (col>=0 && row< board.length){
            if (board[row][col]=='Q'){
                return false;
            }
            col--;
            row++;
        }
        return true;
    }

    private static List<String> construct(char[][] board) {
        List < String > res = new ArrayList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}