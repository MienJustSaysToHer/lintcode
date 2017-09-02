public class Solution453 {

    TreeNode lastNode;

    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        if (lastNode != null) {
            lastNode.right = root;
            lastNode.left = null;
        }
        lastNode = root;
        TreeNode right = root.right;
        flatten(root.left);
        flatten(right);
    }
}