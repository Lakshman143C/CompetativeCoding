package org.laxman.striver.recursion;

import java.util.Arrays;

public class FloodFillAlgo {
    public static void main(String[] args) {
        int[][] mat = {
                {0, 1, 1, 0, 0, 0, 1, 1, 1},
                {1, 0, 1, 0, 1, 0, 0, 0, 1},
                {0, 1, 1, 0, 0, 0, 0, 1, 0},
                {1, 1, 0, 1, 0, 1, 1, 1, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 1},
                {1, 0, 1, 0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 1, 0, 1, 1},
                {0, 0, 0, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 1, 1, 0, 1, 1, 1}
        };

        int[] delRow={1,0,-1,0};
        int[] delCol={0,1,0,-1};
        //floodFill(mat,0,);

        for(int[] a:mat){
            System.out.println(Arrays.toString(a));
        }

    }

    //striver
    public static void floodFill(int[][] image,int row,int col,int newColor,int oldColor,int[] delRow,int[] delCol){
        image[row][col]=newColor;
        int m=image.length,n=image[0].length;
        for (int i=0;i<4;i++){
            int nRow=row+delRow[i];
            int nCol=col+delCol[i];
            if(nRow>=0 && nRow<m && nCol>=0 && nCol<n &&
                    image[nRow][nCol]==oldColor && image[nRow][nCol]!=newColor)
                floodFill(image,nRow,nCol,newColor,oldColor,delRow,delCol);
        }
    }








    //laxman
    public static void fill(int[][] mat,int row,int col,int newColor,int oldColor,int m,int n){
        if(row>m && col>n) return;
        mat[row][col]=newColor;
        if(col<n && mat[row][col+1]==oldColor)
            fill(mat,row,col+1,newColor,oldColor,m,n);

        if(row<m && mat[row+1][col]==oldColor)
            fill(mat,row+1,col,newColor,oldColor,m,n);

        if(col>0 && mat[row][col-1]==oldColor)
            fill(mat,row,col-1,newColor,oldColor,m,n);

        if(row>0 && mat[row-1][col]==oldColor)
            fill(mat,row-1,col,newColor,oldColor,m,n);
    }
}
