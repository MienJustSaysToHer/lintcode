import java.util.ArrayList;
import java.util.LinkedList;

public class Solution67 {
    /**
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            TreeNode node = stack.pop();
            result.add(node.val);
            current = node.right;
        }
        return result;
    }
}