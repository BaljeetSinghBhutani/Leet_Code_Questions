package com.codewithLeetCode;



public class Unique_Paths {
//Method -  3 Dynamic Programing
//public static int uniquePaths(int m, int n) {
//
//int dp [][] = new int[m][n];
//for(int i =0; i<m; i++){
//    for(int j =0; j<n; j++){
//        dp[i][j] = -1;
//    }
//}
//return countpaths(0, 0, m, n, dp);


//}
//Time Complexity  = 0(n * m)
//    Space Complexity =  0( n  + m)
//    private static int  countpaths(int i, int j, int m, int n, int dp[][] ) {
//
//    if(i==n-1 && j == m-1){
//
//        return 1;
//    }
//    if(i<0 || i>=m || j<0 || j>=n){
//        return 0;
//    }
//    if(dp[i][j]!=-1){
//        return dp[i][j];
//    }
//    else
//
//        return  dp[i][j] = countpaths(i + 1, j, m, n, dp) + countpaths(i, j + 1, m, n, dp);
//
//
//    }
//    public static int uniquePaths(int m, int n) {

//    Method -2
// int N  = m +  n - 2;
// int r  = n-1;
// double ans  = 1;
//
// for(int i = 1; i<=r; i++){
//     ans  =  ans * ( N- r +i) /i;
// }
// return (int)  ans;
//
//}



//    Method  -1
//static int count;
//    public int uniquePaths(int m, int n) {
//
//ArrayList<Integer> list = new ArrayList<>();
//        int maze[][] = new int [m][n];
//        int path[][] = new int [m][n];
//
//
//         solvemaze(maze, 0, 0, path);
//
//int temp  = count;
//count = 0;
//return temp;
//
//
//    }
//
//    private  void solvemaze(int[][] maze, int i, int j, int[][] path) {
//
//
//        if(i<0 ||  j<0 || i>= maze.length || j>=maze[0].length ||  path[i][j]==1){
//            return ;
//        }
//        path[i][j] = 1;
//
//        if(i== maze.length-1 && j== maze[0].length-1)
//        {
//
//
//        count++;
//            path[i][j]=0;
//            return;
//
//        }
//
////        down
//        solvemaze(maze, i+1, j, path);
////        right
//        solvemaze(maze, i, j+1, path);
//
//        path[i][j] = 0;
//
//    }



    public static void main(String[] args) {
//int a  = uniquePaths(3, 2);
//        System.out.println(a);

    }
}
