package org.laxman.striver.recursion.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens51 {
    public static void main(String[] args) {
        int n=4;
        String[][] board=new String[n][n];
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                board[i][j]=".";
        }

        solve(board,0,0,n,res);
        for(String[] s:board)
            System.out.println(Arrays.toString(s));
        System.out.println(res);
    }
    static public void solve(String[][] board,int row,int col,int n,List<List<String>> res){
        if(col==n) {
            generateResult(board,res);
            return;
        }
        for(int i=row;i<n;i++){
            if(!isRestricted(board,i,col)){
                board[i][col]="Q";
                solve(board,0,col+1,n,res);
                board[i][col]=".";
            }
        }
    }

    static public boolean isRestricted(String[][] board,int row,int col){
        int r=row,c=col;
        //check for upper left diagnol
        while(r>=0 && c>=0){
            if(board[r][c]=="Q")
                return true;
            r--;c--;
        }

        r=row;c=col;
        //check for left side row
        while(r>=0 && c>=0){
            if(board[r][c]=="Q")
                return true;
            c--;
        }

        r=row;c=col;
        //check for bottom left diagnol
        while(r<board.length && c>=0){
            if(board[r][c]=="Q")
                return true;
            r++;c--;
        }
        return false;
    }
    static void generateResult(String[][] board,List<List<String>> res){
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<board.length;i++){
            sb.setLength(0);
            for(int j=0;j<board.length;j++){
                if(board[i][j]=="Q"){
                    sb.append("Q");
                }else sb.append(".");
            }
            list.add(sb.toString());
        }
        res.add(list);
    }
}


/*

public static void main(String[] args) {
        boolean[][] board=new boolean[4][4];
        for(boolean[] a:board){
            System.out.println(Arrays.toString(a));;
        }
        restrictCoOrdinates(board,1,2);
        for(boolean[] a:board){
            System.out.println(Arrays.toString(a));;
        }
    }
    static //restricting diagnols, rows and columns of a given co-ordinate
    public void restrictCoOrdinates(boolean[][] restrictedCoOrdinates,int i,int j){
        int t1=i,t2=j; // restrict Q4 diagnol
        while(i<restrictedCoOrdinates.length && j<restrictedCoOrdinates[0].length)
            restrictedCoOrdinates[i++][j++]=true;

        i=t1;j=t2;
        while(i>=0 && j>=0) // restrict Q2 diagnol
            restrictedCoOrdinates[i--][j--]=true;

        i=t1;j=t2; // restrict Q3 diagnol
        while(i<restrictedCoOrdinates.length && j>=0)
            restrictedCoOrdinates[i++][j--]=true;

        i=t1;j=t2; // restrict Q1 diagnol
        while(i>=0 && j<restrictedCoOrdinates[0].length)
            restrictedCoOrdinates[i--][j++]=true;

        i=t1;j=0; //restrict horizontal  row
        while(j<restrictedCoOrdinates[0].length)
            restrictedCoOrdinates[i][j++]=true;

        i=0;j=t2; //restric vertical column
        while(i<restrictedCoOrdinates.length)
            restrictedCoOrdinates[i++][j]=true;
    }

*/
