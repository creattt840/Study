package hot100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test36 {
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

    public int kthSmallest(TreeNode root, int k) {
        //用一个集合来接收所有的节点数据
        List<Integer> list = new ArrayList<>();
        AllTree(root,list);
        Collections.sort(list);
        return list.get(k-1);
    }

    public void AllTree(TreeNode root,List<Integer> list){
        //判断是否递归到空节点
        if (root==null){
            return;
        }
        //将当前节点放入集合
        list.add(root.val);
        //分别递归左右子树放入集合中
        AllTree(root.left,list);
        AllTree(root.right,list);
    }
}
