package hot100;

public class test34 {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    public TreeNode helper(int[] nums, int left, int right){
        if (left>right){
            return null;
        }
        //根节点为数组中间元素
        int mid=(left+right)/2;
        //创建根节点
        TreeNode root = new TreeNode(nums[mid]);
        //通过递归加入左右子树
        root.left=helper(nums,left,mid-1);
        root.right=helper(nums,mid+1,right);
        return root;
    }
}
