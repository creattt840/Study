package hot100;

import java.util.ArrayList;
import java.util.List;

public class test14 {
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         TreeNode() {
         }

         TreeNode(int val) {
             this.val = val;
         }

         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

    public List<Integer> inorderTraversal(TreeNode root) {
        //中序遍历：左,中,右
        //创建一个数组存放遍历节点
        List<Integer> list=new ArrayList<>();
        inorder(list,root);
        return list;
    }
    public static void inorder(List<Integer> list,TreeNode root){
         if (root==null){
             return;
         }
         inorder(list,root.left);
         list.add(root.val);
         inorder(list,root.right);
    }
}
