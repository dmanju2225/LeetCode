package stringEasyProblems;
/*Given n pairs of parentheses, write a function to generate all combinations
 *  of well-formed parentheses.
 */

/*For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParanthesis
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter integer of open braces");
		int n=scan.nextInt();
		List<String> res=generateParanthesis(n);
		System.out.println(res);

	}

	private static List<String> generateParanthesis(int n)
	{
		// TODO Auto-generated method stub
		List<String> res=new ArrayList<String>();
		generate(res,"",0,0,n);//(0,0,2) calling (1,0,2) becoz 0<2, {(()),()()}, then (0<0) so nothing
		return res;
	}

	private static void generate(List<String> res, String curr, int left, int right, int n)
	{
		// TODO Auto-generated method stub
		if(curr.length()==n*2){//for n=2 open braces, curr can be =(()) or ()() so length =4
			res.add(curr);
			return;
		}
		if(left<n){
			generate(res,curr+"(",left+1,right,n);//(1,0,2) calling first (2,0,2),  (()), then (1,1,2) , ()()
		}
		if(right<left){
			generate(res,curr+")",left,right+1,n);
		}
	}

}
