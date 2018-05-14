package stringEasyProblems;
/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string.
 If the last word does not exist, return 0.
Note: A word is defined as a character sequence consists of non-space characters only.*/
import java.util.Scanner;

public class LegthOfLastWord
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = scan.nextLine();
		int result = lengthOfLastWord(s);
		System.out.println(result);
		int Oresult = OlengthOfLastWord(s);
		System.out.println(Oresult);
	}

	private static int OlengthOfLastWord(String s)
	{
		// TODO Auto-generated method stub
		String st=s.trim();
		int li=st.lastIndexOf(" ");
		if(li==-1){
			return st.length();
		}
		
		return st.substring(li+1,st.length()).length();
	}

	private static int lengthOfLastWord(String s)
	{
		// TODO Auto-generated method stub

		String[] str = s.split(" +");	
		if (str.length == 0)
		{
			return 0;
		}
		return str[str.length - 1].length();
	}

}
