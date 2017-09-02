public class Solution155 {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int minleft = minDepth(root.left);
        int minright = minDepth(root.right);
        if (minleft == 0 && minright != 0) {
            return minright + 1;
        } else if (minright == 0) {
            return minleft + 1;
        } else {
            return Math.min(minleft, minright) + 1;
        }
    }
}