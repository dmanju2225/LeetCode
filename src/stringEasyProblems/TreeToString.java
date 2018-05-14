package stringEasyProblems;
/*You need to construct a string consists of parenthesis and integers 
 * from a binary tree with the preorder traversing way.
 The null node needs to be represented by empty parenthesis pair "()".
  And you need to omit all the empty parenthesis pairs that don't affect the
   one-to-one mapping relationship between the string and the original binary tree.*/
/*Input: Binary tree: [1,2,3,4]  
       1
     /   \
    2     3
   /    
  4     

Output: "1(2(4))(3)"

Explanation: Originallay it needs to be "1(2(4)())(3()())", 
but you need to omit all the unnecessary empty parenthesis pairs. 
And it will be "1(2(4))(3)".
Input: Binary tree: [1,2,3,null,4]
       1
     /   \
    2     3
     \  
      4 

Output: "1(2()(4))(3)"*/

public class TreeToString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		String res = treeToString(root);
		System.out.println(res);

	}

	private static String treeToString(TreeNode root)
	{
		// TODO Auto-generated method stub
		if (root == null)
			return "";
		String result = root.val + "";
		String left = treeToString(root.left);
		String right = treeToString(root.right);
		if (root.left == null && root.right == null)
		{
			return result;
		}
		if (root.left == null)
		{
			return result + "()" + "(" + right + ")";
		}
		if (root.right == null)
		{
			return result + "(" + left + ")";
		}
		return result + "(" + left + ")" + "(" + right + ")";
	}

}
