public class Solution375 {
    /**
     * @param root: The root of binary tree
     * @return root of new tree
     */
    public TreeNode cloneTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode newroot = new TreeNode(root.val);
        createTreeNode(newroot, root.left, root.right);

        return newroot;
    }

    void createTreeNode(TreeNode newroot, TreeNode oldleft, TreeNode oldright) {
        if (oldleft != null) {
            TreeNode newleft = new TreeNode(oldleft.val);
            newroot.left = newleft;
            createTreeNode(newleft, oldleft.left, oldleft.right);
        }
        if (oldright != null) {
            TreeNode newright = new TreeNode(oldright.val);
            newroot.right = newright;
            createTreeNode(newright, oldright.left, oldright.right);
        }
    }
}