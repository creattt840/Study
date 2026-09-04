package hot100;

import java.util.ArrayList;
import java.util.List;

public class test38 {
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

    public void flatten(TreeNode root) {
        //先排除特殊情况
        if (root==null){
            return;
        }
        //创建一个集合用来收集先序遍历后的节点
        List<Integer> Val = new ArrayList<>();
        VLR(root,Val);
        //此时把当前二叉树左子树变为空
        root.left=null;
        //然后给右子树赋值
        //不包括根节点从第二个元素开始赋值
        rightList(root,1,Val);
    }

    /**
     * 二叉树先序遍历获得一个遍历后的集合
     * @param root
     */
    public void VLR(TreeNode root, List<Integer> Val){
        if (root==null){
            return;
        }
        //把当前节点的数据放入集合
        Val.add(root.val);
        //先遍历左边子树
        VLR(root.left,Val);
        //再遍历右侧子树
        VLR(root.right,Val);
    }

    /**
     * 递归给右子树赋值
     * @param root index Val
     */
    public void rightList(TreeNode root,int index,List<Integer> Val){
        if (index >= Val.size()){
            //到集合终点，停止递归
            return;
        }
        //给当前节点的右节点赋值
        root.right=new TreeNode(Val.get(index));
        //索引往后，根节点变为当前节点的右节点，递归
        rightList(root.right,index+1,Val);
    }
}
