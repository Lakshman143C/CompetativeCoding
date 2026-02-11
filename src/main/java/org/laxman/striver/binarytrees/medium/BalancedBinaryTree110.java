package org.laxman.striver.binarytrees.medium;

public class BalancedBinaryTree110 {
    public static boolean isBalanced=true;
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        //boolean b = check(root) == -1 ? false : true;
        isBalancedCheck(root,0);
    }

    public static  int isBalancedCheck(TreeNode root,int d){
        if(root==null) return d;
        int l=0,r=0;
        if(isBalanced) l=isBalancedCheck(root.left,d+1);
        if(isBalanced) r=isBalancedCheck(root.right,d+1);
        if(Math.max(l,r)-Math.min(l,r)>1) isBalanced=false;
        return Math.max(l,r);
    }
    public static int check(TreeNode node){
        if(node==null) return 0;

        int l=check(node.left);
        if(l==-1) return -1;
        int r=check(node.right);
        if(r==-1) return -1;
        if(Math.abs(l-r)>1) return -1;
        return Math.max(l,r)+1;

    }
}
