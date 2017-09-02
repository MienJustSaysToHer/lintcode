public class Solution177 {
    /**
     * @param A: an integer array
     * @return: a tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {
        return helper(A, 0, A.length - 1);
    }

    TreeNode helper(int[] A, int l, int h) {
        if (l <= h) {
            int mid = l + (h - l) / 2;
            TreeNode root = new TreeNode(A[mid]);
            root.left = helper(A, l, mid - 1);
            root.right = helper(A, mid + 1, h);
            return root;
        }
        return null;
    }
}