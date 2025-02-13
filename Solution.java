import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x, TreeNode y, TreeNode z) {
        val = x;
        left = y;
        right = z;
    }
}

public class Solution {
    public static int KthLargest(TreeNode root, int k) {
        if (root == null)
            return -1;
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        int count = 0;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.right;
            }
            current = stack.pop();
            count++;
            if (count == k) {
                return current.val;
            }
            current = current.left;
        }
        return -1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2, null, null)),
                new TreeNode(4, null, null));
        System.out.println(KthLargest(root, 1));

        TreeNode root1 = new TreeNode(5, new TreeNode(3, new TreeNode(2, null, null), new TreeNode(4, null, null)),
                new TreeNode(6, null, null));
        System.out.println(KthLargest(root1, 3));
    }
}
