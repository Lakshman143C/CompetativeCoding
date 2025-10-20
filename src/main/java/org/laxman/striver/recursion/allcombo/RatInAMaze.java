package org.laxman.striver.recursion.allcombo;

import java.util.ArrayList;
import java.util.HashSet;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};
        ArrayList<String> res=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        solveMaze(arr,0,0,4,res,new StringBuilder(),set);
        System.out.println(res);
    }
    static public void solveMaze(int[][] maze, int row, int col, int n, ArrayList<String> res, StringBuilder sb, HashSet<String> set){
        if(row==n-1 && col==n-1){
            res.add(sb.toString());
            return;
        }
        if(row<n && col<n-1 && maze[row][col+1]==1 && !set.contains(row+""+(col+1))){
            sb.append("R");
            set.add(row+""+(col+1));
            solveMaze(maze,row,col+1,n,res,sb,set);
            set.remove(row+""+(col+1));
            sb.deleteCharAt(sb.length()-1);
        }
        if(row<n-1 && col<n && maze[row+1][col]==1 && !set.contains((row+1)+""+col)){
            set.add((row+1)+""+col);
            sb.append("D");
            solveMaze(maze,row+1,col,n,res,sb,set);
            set.remove((row+1)+""+col);
            sb.deleteCharAt(sb.length()-1);
        }
        if(row>0 && col>0 && maze[row-1][col]==1 && !set.contains((row-1)+""+col)){
            sb.append("U");
            set.add((row-1)+""+col);
            solveMaze(maze,row-1,col,n,res,sb,set);
            set.remove((row-1)+""+col);
            sb.deleteCharAt(sb.length()-1);
        }
        if(row>=0 && col>0 && maze[row][col-1]==1 && !set.contains(row+""+(col-1))){
            sb.append("L");
            set.add(row+""+(col-1));
            solveMaze(maze,row,col-1,n,res,sb,set);
            set.remove(row+""+(col-1));
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
