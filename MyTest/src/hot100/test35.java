package hot100;

public class test35 {
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

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root,long lower,long upper){
        if (root==null){
            return true;
        }
        //如果当前节点是左节点则右边最大值则是中间节点，如果大于中间节点则false
        //如果当前节点是右节点则左边最小值则是中间节点，如果小于中间节点则false
        if (root.val<=lower||root.val>=upper){
            return false;
        }
        //此时再递归让左右子树节点为中间节点
        //传入左子树节点，左子树节点小于中间节点所以最大值为root节点
        //传入右子树节点，右子树节点大于中间节点所以最小值为root节点
        return isValidBST(root.left,lower,root.val)&&isValidBST(root.right,root.val,upper);
    }
}
