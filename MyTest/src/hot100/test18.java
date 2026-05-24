package hot100;

public class test18 {
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

    int maxDept=0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDept;
    }

    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        maxDept=Math.max(maxDept,left+right);
        return Math.max(left,right)+1;
    }
}
