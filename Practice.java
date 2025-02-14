import java.util.Stack;
class TreeNode {
int val; 
TreeNode left; 
TreeNode right; 
TreeNode(int x) {
val =x;
}
}
public class Practice {
public static int KthLargest(TreeNode root, int k){
if(root == null ) return 0;
Stack<TreeNode> stack = new Stack<>();
TreeNode current = root;
int count =0;
while(current!=null || !stack.isEmpty()) {
while(current != null ) {
stack.push(current);
current = current.right;
}
current = stack.pop();
count++;
if(count == k) return current.val;
current =current.left; 
}

return -1;
}
}

