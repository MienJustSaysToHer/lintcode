public class Solution661 {

    int sum = 0;

    /**
     * @param root the root of binary tree
     * @return the new root
     */
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        helper(root);
        return root;
    }

    void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.right);
        sum += root.val;
        root.val = sum;
        helper(root.left);
    }
}