package stringEasyProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*Given two strings A and B, find the minimum number of times A has to be repeated 
 * such that B is a substring of it. If no such solution, return -1.
For example, with A = "abcd" and B = "cdabcdab".
Return 3, because by repeating A three times (“abcdabcdabcd”), 
B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").
*/
public class RepeatedStringPattern
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("enter string A");
		String A = scan.nextLine();
		System.out.println("enter string B");
		String B = scan.nextLine();
		int numOfTimes = repeatedStringMatch(A, B);
		System.out.println(numOfTimes);

	}

	private static int repeatedStringMatch(String a, String b)
	{
		// TODO Auto-generated method stub
		int count = 1;
		int flag = 1;
		for (int i = 0; i < b.length(); i++)
		{
			if (a.indexOf(b.charAt(i)) == -1)
			{
				return -1;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		System.out.println(sb.toString());
		while (sb.length() < b.length())
		{
			sb.append(a);
			System.out.println(sb.toString());
			count++;
		}
		while (flag == 1)
		{
			String s = sb.toString();
			if (s.contains(b))
			{
				System.out.println(sb.toString());
				return count;
			}
			if (count > 1 && sb.length() > 2 * b.length())
			{
				return -1;
			}
			sb.append(a);
			count++;
		}
		return -1;
	}

}
