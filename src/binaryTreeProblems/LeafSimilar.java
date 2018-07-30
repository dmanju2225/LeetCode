package binaryTreeProblems;

import java.util.ArrayList;
import java.util.List;

/*Consider all the leaves of a binary tree.  From left to right order, 
 //the values of those leaves form a leaf value sequence.
 For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 
Two binary trees are considered leaf-similar if their leaf value sequence is the same.
Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.*/

public class LeafSimilar{
	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> L1=new ArrayList<Integer>();
        List<Integer> L2=new ArrayList<Integer>();
        findLeaves(root1,L1);
        findLeaves(root2,L2);
        if(L1.size()==L2.size()){
            for(int i=0;i<L1.size();i++){
                if(L1.get(i)!=L2.get(i)) return false;
            }
            return true;
        }
        return false;
	}
    public static void findLeaves(TreeNode root, List<Integer> L){
        if(root==null) return;
        if(root.left==null&&root.right==null){
            L.add(root.val);
            return;
        }
        findLeaves(root.left,L);
        findLeaves(root.right,L);     
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeNode root1=new TreeNode(4);
		root1.left=new TreeNode(5);
		root1.right=new TreeNode(1);
		root1.left.right=new TreeNode(6);
		TreeNode root2=new TreeNode(2);
		root2.left=new TreeNode(3);
		root2.right=new TreeNode(7);
		root2.right.left=new TreeNode(1);
		root2.left.left=new TreeNode(6);
boolean res= leafSimilar(root1,root2);
System.out.println(res);
	}

}
