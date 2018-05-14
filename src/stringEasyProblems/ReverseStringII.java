package stringEasyProblems;

/*Given a string and an integer k, you need to reverse the first k characters 
 * for every 2k characters counting from the start of the string. If there are 
 * less than k characters left, reverse all of them. If there are less than 2k 
 * but greater than or equal to k characters, then reverse the first k characters 
 * and left the other as original.
 */
/*Input: s = "abcdefg", k = 2 Output: "bacdfeg",input:abcdefgh,k=3, output:cbadefhg*/
import java.util.Scanner;

public class ReverseStringII
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = scan.nextLine();
		System.out.println("enter an integer ");
		int k = scan.nextInt();
		String result = reverseStr(s, k);
		System.out.println(result);
		
	}

	private static String reverseStr(String s, int k)
	{
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int i = 0;
		int j = 0;
		while (i < s.length())
		{
			j = i + k;
			if (j <= s.length())
			{
				j = i + k;
			}
			else
			{
				j = s.length();
			}
			sb.append(new StringBuilder(s.substring(i, j)).reverse().toString());
			if (j >= s.length())
			{
				break;
			}
			i = j;
			j = i + k;
			if (j <= s.length())
			{
				j = i + k;
			}
			else
			{
				j = s.length();
			}
			sb.append(s.substring(i, j));
			i = j;
		}
		return sb.toString();

	}
}
