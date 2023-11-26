package hellowrld;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class levlorder {
	
		
		public static void main(String[] args) {
	        // Create a sample tree for testing
	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);

	        // Create an instance of the Solution class
	        levlorder lv =new levlorder();

	        // Call the levelOrder method and print the result
	        List<List<Integer>> result = lv.levelOrder(root);
	        System.out.println("Level Order Traversal: " + result);
	    }
		
		 public List<Integer> levelOrder(TreeNode root) {
		        
		        Queue<TreeNode> queue = new LinkedList<TreeNode>();
		        List<Integer> wrapList = new ArrayList<Integer>();
		        
		        if(root == null) return wrapList;
		        
		        queue.offer(root);
		        while(!queue.isEmpty()){
		            
		            if(queue.peek().left != null) 
		                queue.offer(queue.peek().left);
		                
		            if(queue.peek().right != null) 
		                queue.offer(queue.peek().right);
		                
		            wrapList.add(queue.poll().val);
		        }
		        return wrapList;
		    } }


