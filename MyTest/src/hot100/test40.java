package hot100;

public class test40 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //如果root是空或者就是p或者q，直接返回
        if (root==null||root==p||root==q){
            return root;
        }

        //在左子树找p或者q
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        //在右子树找p或者q
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        //如果两个都能找到，说明p和q在当前节点的左右子树，所以当前节点就是最近公共祖先
        if (left!=null && right!=null){
            return root;
        }

        //如果只能找到一个，则把那个往上返回
        if (left!=null){
            return left;
        }else{
            return right;
        }
    }
}
