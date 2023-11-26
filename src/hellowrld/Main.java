package hellowrld;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


public class Main {
	public static List<Integer> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> wrapList = new LinkedList<>();

        if (root == null) return wrapList;

        queue.offer(root);
        while (!queue.isEmpty()) {
            if (queue.peek().left != null)
                queue.offer(queue.peek().left);

            if (queue.peek().right != null)
                queue.offer(queue.peek().right);

            wrapList.add(queue.poll().val);
        }
        return wrapList;
}  
	
	 public static void main(String[] args) {
	        // Creating a sample binary tree
	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
	        root.right.left = new TreeNode(6);
	        root.right.right = new TreeNode(7);

	        // Testing the levelOrder function
	        List<Integer> result = levelOrder(root);

	        // Printing the result
	        System.out.println("Level Order Traversal: " + result);
	    }
	}