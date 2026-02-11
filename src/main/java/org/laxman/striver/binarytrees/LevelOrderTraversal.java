package org.laxman.striver.binarytrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new ArrayDeque<>();
        Queue<TreeNode> tq;
        q.add(root);
        List<List<Integer>> res=new ArrayList<>();
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            tq=new ArrayDeque<>();
            while(!q.isEmpty()){
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left!=null) tq.add(node.left);
                if(node.right!=null) tq.add(node.right);

            }
            res.add(list);
            q=tq;
        }
        return res;

    }
}



   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
