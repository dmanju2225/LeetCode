package stringEasyProblems;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string of (){}[] ");
		String s = scan.nextLine();
		boolean Oresult=OvalidParanthesis(s);
		System.out.println(Oresult);
		boolean result=validParanthesis(s);
		System.out.println(result);
	}

	private static boolean validParanthesis(String s)
	{
		// TODO Auto-generated method stub
		String s1=s.replace("()","").replace("{}","").replace("[]","");
		return s1.isEmpty();
	}

	private static boolean OvalidParanthesis(String s)
	{
		// TODO Auto-generated method stub
		 Stack<Character> stack=new Stack<Character>();
		 for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c=='('){
				stack.push(')');
			}
			else if(c=='{'){
				stack.push('}');
			}
			else if(c=='['){
				stack.push(']');
			}
			else if(stack.isEmpty()||stack.pop()!=c){
				return false;
			}
		 }
		 if(stack.isEmpty()){
			 return true;
		 }
		 else 
			 return false;
}
}