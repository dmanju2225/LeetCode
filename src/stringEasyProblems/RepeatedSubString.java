package stringEasyProblems;

import java.util.Scanner;
/*Given a non-empty string check if it can be constructed by taking a
 *  substring of it and appending multiple copies of the substring together. 
 *  You may assume the given string consists of lowercase English letters only and 
 *  its length will not exceed 10000.
 */
/*Input: "abab" Output: True Explanation: It's the substring "ab" twice.*/

public class RepeatedSubString
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String A = scan.nextLine();
		// boolean bl = constructStringBySubString(A);
		// System.out.println(bl);
		boolean bl2 = OconstructStringBySubString(A);
		System.out.println(bl2);
	}

	private static boolean OconstructStringBySubString(String a)
	{
		// TODO Auto-generated method stub
		int length = a.length();
		// find out divisors of length and divisors can start from 1 to length/2
		// only
		for (int i = length / 2; i >= 1; i--)
		{
			if (length % i == 0)
			{
				int divisor = length / i;
				String subStr = a.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < divisor; j++)
				{// for substr 3 input lenght 27 then 9 times append
					sb.append(subStr);
				}
				if (sb.toString().equals(a))
				{
					return true;
				}
			}
		}
		return false;
	}

	private static boolean constructStringBySubString(String a)
	{
		// TODO Auto-generated method stub
		int n = a.length();
		for (int j = 0; j < n; j++)
		{
			for (int k = j + 1; k <= n; k++)
			{
				if (n % k != 0)// for length 9 only check 1,3 length substrings
				{
					continue;
				}
				StringBuilder sb = new StringBuilder();
				String s = a.substring(j, k);

				while (sb.length() < a.length())
				{
					sb.append(s);

				}
				if (sb.toString().equals(a))
				{
					return true;
				}
			}
		}
		return false;
	}
}
