package org.laxman.striver.binarySearch.twoDArrays;

public class SearchIn2dArray {
    public static void main(String[] args) {

    }
    static public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==1 && matrix[0].length==1 && matrix[0][0]==target) return true;
        if(matrix.length==1 && matrix[0].length==1 && matrix[0][0]!=target) return false;
        if(matrix.length==1)
            return search(matrix[0],target);
        int row=getRow(matrix,target);
        return row==-1?false:search(matrix[row],target);
    }

    static public int getRow(int[][] matrix,int target){
        int rowLen=matrix[0].length-1,l=0,r=matrix.length,m=0;
        while(l<=r){
            m=(l+r)>>1;
            rowLen=matrix[m].length-1;
            if(matrix[m][0]<target && matrix[m][rowLen]>target)
                return m;
            else if(matrix[m][0]>target){
                r=m-1;
            }else l=m+1;
        }
        return -1;
    }

    static public boolean search(int[] row,int target){
        int l=0,r=row.length-1,m=0;
        while(l<=r){
            m=(l+r)>>1;
            if(row[m]==target)
                return true;
            else if(row[m]<target){
                l=m+1;
            }else r=m-1;
        }
        return false;
    }
}
