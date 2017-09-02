import java.util.ArrayList;
import java.util.LinkedList;

public class Solution69 {
    /**
     * @param root: The root of binary tree.
     * @return: Level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (root == null) {
            return null;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int width = queue.size();
            ArrayList<Integer> raw = new ArrayList<>(width);
            for (int i = 0; i < width; i++) {
                TreeNode treeNode = queue.poll();
                raw.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            result.add(raw);
        }

        return result;
    }
}