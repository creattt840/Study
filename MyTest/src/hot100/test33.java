package hot100;

import java.util.ArrayList;
import java.util.List;

public class test33 {

    public class TreeNode {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root==null){
            return lists;
        }
        levelOrderHelper(root,lists,1);
        return lists;
    }

    public static void levelOrderHelper(TreeNode root,List<List<Integer>> ans,int level){
        //先判断当前递归的节点是否为空节点
        if (root==null){
            return;
        }
        //用一个集合来收集当前level层的节点
        List<Integer> tempans=new ArrayList<>();
        //然后把这一层的节点放入总递归集合中
        if (ans.size()<level){
            ans.add(tempans);
        }
        //然后把当前节点数据加入当前层级集合中
        ans.get(level-1).add(root.val);
        //分别递归当前节点的左右子树然后加入到当前节点所在的层级集合中
        levelOrderHelper(root.left,ans,level+1);
        levelOrderHelper(root.right,ans,level+1);
    }
}
