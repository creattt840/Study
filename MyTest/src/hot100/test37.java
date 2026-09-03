package hot100;

import java.util.ArrayList;
import java.util.List;

public class test37 {
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

    public List<Integer> rightSideView(TreeNode root) {
        if (root==null){
            return new ArrayList<>();
        }
        //用一个集合来收集每一层的数据
        List<List<Integer>> levelVal = new ArrayList<>();
        //获取每一层的数据
        level(root,levelVal,1);
        //右侧视图集合
        List<Integer> rightList = new ArrayList<>();
        //根据遍历层级获得最右边的数据放入到有侧视图集合
        for (int i = 0; i < levelVal.size(); i++) {
            //获得当前层级的集合
            List<Integer> levelList=levelVal.get(i);
            //获得当前层级集合的最右侧元素及最后加入的元素
            int right=levelList.get(levelList.size()-1);
            rightList.add(right);
        }
        return rightList;
    }

    public void level(TreeNode root,List<List<Integer>> levelVal,int level){
        //判断空节点
        if (root==null){
            return;
        }
        //创建当前层级的集合
        List<Integer> tempans = new ArrayList<>();
        //把这一层的集合放到递归总层集合中
        if (levelVal.size()< level){
            levelVal.add(tempans);
        }
        //然后把这一层的节点放入
        levelVal.get(level-1).add(root.val);
        //然后分别递归左右子树把不同层数的节点放入
        level(root.left,levelVal,level+1);
        level(root.right,levelVal,level+1);
    }
}
