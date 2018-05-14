package stringEasyProblems;

import java.util.Scanner;

public class IsStringPalindrome
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = scan.nextLine();
		boolean bl = isPalindrome(s);
		System.out.println(bl);
		boolean Obl = OisPalindrome(s);
		System.out.println(Obl);
	}

	private static boolean OisPalindrome(String s)
	{
		// TODO Auto-generated method stub
		 s=s.toLowerCase();
		if(s.isEmpty()){
			return true;
		}
		int begin = 0;
		int end = s.length() - 1;
		while (end > begin)
		{
			if (!Character.isLetterOrDigit(s.charAt(begin)))
			{
				begin++;
			}
			else if (!Character.isLetterOrDigit(s.charAt(end)))
			{
				end--;
			}
			else
			{
				if (s.charAt(begin) != s.charAt(end))
				{
					return false;
				}
				begin++;
				end--;
			}
		}
		return true;
	}

	private static boolean isPalindrome(String s)
	{
		// TODO Auto-generated method stub
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();// regex can
																	// be"//W+"
																	// any non
																	// word char
		String s2 = new StringBuilder(s1).reverse().toString();
		if (s1.equals(s2))
		{
			return true;
		}
		return false;
	}

}
