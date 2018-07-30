package binaryTreeProblems;
/*Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the 
//root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
   return its depth = 3 */
import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthOrHeightOfBinaryTree
{
	public static int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        int count=0;
        q.add(root);
        int cur=1;
        int next=0;
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            cur--;
            if(temp.left!=null){
                q.add(temp.left);
                next++;
            }
            if(temp.right!=null){
                q.add(temp.right);
                next++;
            }
            if(cur==0){
                count++;
                cur=next;
                next=0;
            }
            
        }
        return count;  
    }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeNode root1=new TreeNode(4);
		root1.left=new TreeNode(5);
		root1.right=new TreeNode(1);
		root1.left.right=new TreeNode(6);
		int height=maxDepth(root1);
		System.out.println(height);
	}

}
