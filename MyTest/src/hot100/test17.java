package hot100;

public class test17 {
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

    public boolean isSymmetric(TreeNode root) {
        return isEqual(root.left,root.right);
    }

    public static boolean isEqual(TreeNode root1,TreeNode root2){
        if (root1==null&&root2==null){
            return true;
        }
        if (root1==null||root2==null){
            return false;
        }
        return root1.val==root2.val&&isEqual(root1.left,root2.right)&&isEqual(root1.right,root2.left);
    }
}
