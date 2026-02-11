package org.laxman.striver.binarytrees.medium;


public class HeightOfBinaryTree {
    public static void main(String[] args) {

    }
    //my impl
    public int height(TreeNode node,int d){
        if(node==null) return d;
        return Math.max(height(node.left,d+1),height(node.right,d+1));
    }

    public int checkHeight(TreeNode node){
        if(node==null) return 0;
        int l=checkHeight(node.left);
        int r=checkHeight(node.right);
        return Math.max(l,r)+1;
    }
}
