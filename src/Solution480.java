import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution480 {
    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Integer> stack = new Stack<>();
        binaryTreePathSum(result, stack, root);
        return result;
    }

    void binaryTreePathSum(List<String> result, Stack<Integer> stack, TreeNode root) {
        stack.push(root.val);
        if (root.left == null && root.right == null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Integer num : stack) {
                stringBuilder.append(num);
                stringBuilder.append("->");
            }
            String raw = stringBuilder.substring(0, stringBuilder.length() - 2);
            result.add(raw);
            stack.pop();
        } else {
            if (root.left != null) {
                binaryTreePathSum(result, stack, root.left);
            }
            if (root.right != null) {
                binaryTreePathSum(result, stack, root.right);
            }
            stack.pop();
        }
    }
}