import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution376 {
    /**
     * @param root   the root of binary tree
     * @param target an integer
     * @return all valid paths
     */
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Integer> stack = new Stack<>();
        binaryTreePathSum(result, stack, 0, target, root);
        return result;
    }

    void binaryTreePathSum(List<List<Integer>> result, Stack<Integer> stack, int sum, int target, TreeNode root) {
        sum += root.val;
        stack.push(root.val);
        if (sum == target && root.left == null && root.right == null) {
            List<Integer> raw = new ArrayList<>(stack);
            result.add(raw);
            stack.pop();
        } else {
            if (root.left != null) {
                binaryTreePathSum(result, stack, sum, target, root.left);
            }
            if (root.right != null) {
                binaryTreePathSum(result, stack, sum, target, root.right);
            }
            stack.pop();
        }
    }
}