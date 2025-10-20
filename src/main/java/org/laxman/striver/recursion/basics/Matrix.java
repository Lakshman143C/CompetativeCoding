package org.laxman.striver.recursion.basics;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        print(matrix,0,0);
    }
    public static void print(int[][] matrix,int row,int col){
        if(col==matrix[row].length){
            row++;
            col=0;
            System.out.println();
        }
        if(row==matrix.length)
            return;
        System.out.print(matrix[row][col]+" ");
        print(matrix,row,col+1);
    }
}
