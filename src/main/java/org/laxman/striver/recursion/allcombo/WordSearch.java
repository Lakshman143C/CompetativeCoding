package org.laxman.striver.recursion.allcombo;

import java.util.HashSet;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        char[][] a={{'a','a'}};
        char[][] matrix = {
                {'C', 'A', 'A'},
                {'A', 'A', 'A'},
                {'B', 'C', 'D'}
        };

        String word="AAB";
        exist(matrix,word);
    }
    public static boolean exist(char[][] board, String word) {
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        HashSet<String> set=new HashSet<>();
        boolean[][] visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0)){
                   visited[i][j]=true;
                    if(check(board,i,j,word,delRow,delCol,0,visited))
                        return true;
                    visited[i][j]=false;
                }
            }
        }
        return false;
    }

    static public boolean check(char[][] board,int row,int col,String word,int[] delRow,int[] delCol,int ind,boolean[][] visited){
        if(ind+1 ==word.length()){
            return true;
        }
        int m=board.length, n=board[0].length;

        for(int i=0;i<4;i++){
            int nRow=row+delRow[i];
            int nCol=col+delCol[i];
            String s=String.valueOf(nRow+""+nCol);
            if(nRow>=0 && nRow<m && nCol>=0 && nCol<n &&
                    board[nRow][nCol]==word.charAt(ind+1) && !visited[nRow][nCol]){
                visited[nRow][nCol]=true;
                if(check(board,nRow,nCol,word,delRow,delCol,ind+1,visited))
                    return true;
                visited[nRow][nCol]=false;

            }
        }
        return false;
    }

}
