public class Solution245 {
    /*
     * @param T1: The roots of binary tree T1.
     * @param T2: The roots of binary tree T2.
     * @return: True if T2 is a subtree of T1, or false.
     */

    public boolean isSubtree(TreeNode T1, TreeNode T2) {
        if (T2 == null) {
            return true;
        }
        if (T1 == null) {
            return false;
        }
        if (isEqual(T1, T2)) {
            return true;
        }
        return isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
    }

    boolean isEqual(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return t1 == t2;
        }
        return t1.val == t2.val && isEqual(t1.left, t2.left) && isEqual(t1.right, t2.right);
    }

}