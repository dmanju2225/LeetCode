package stringEasyProblems;
/*Given a non-empty string s, you may delete at most one character. Judge whether 
 * you can make it a palindrome. Input: "aba" Output: True, Input: "abca" Output: True
Explanation: You could delete the character 'c'.
 */
import java.util.Scanner;

public class ValidPalindromeII
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = scan.nextLine();
		boolean bl = validPalindromeII(s);
		System.out.println(bl);
		boolean Obl = OvalidPalindromeII(s);
		System.out.println(Obl);
		boolean bl3 = isPalindrome3(s,0,s.length()-1,false);
		System.out.println(bl3);
	}

	private static boolean OvalidPalindromeII(String s)
	{
		// TODO Auto-generated method stub
		int begin=0;
		int end=s.length()-1;
		while(end>begin){
			if(s.charAt(begin)==s.charAt(end)){
				begin++;
				end--;
			}
			else
				break;
		}
		if(end<=begin){
			return true;
		}
		if(isPalindromeO(s,begin+1,end)||isPalindromeO(s,begin,end-1)){//skipping either begin or end
			return true;
		}
		return false;
	}
	private static boolean isPalindromeO(String s, int begin, int end){
		while(end>begin){
			if(s.charAt(begin)==s.charAt(end)){
				begin++;
				end--;
			}
			else 
				return false;
		}
		return true;
	}

	private static boolean isPalindrome3(String s, int begin, int end, boolean skipped){
		while(end>begin){
			if(s.charAt(begin)==s.charAt(end)){
				begin++;
				end--;
			}
			else
			{
				if(skipped == true)
					return false;
				if(isPalindrome3(s,begin+1,end,true)||isPalindrome3(s,begin,end-1,true)){//skipping either begin or end
					return true;
				}
			}
		}
		return true;
	}
	private static boolean validPalindromeII(String s)
	{
		// TODO Auto-generated method stub
		char[] ch = s.toCharArray();
		char temp;
		int count = 0;
		int begin = 0;
		int end = s.length() - 1;
		while (end > begin)
		{
			if (ch[begin] != ch[end])
			{
				count++;
				temp = ch[begin];
				ch[begin] = ' ';
				String s1 = new String(ch).trim().replace(" ", "");
				String s2 = new StringBuilder(s1).reverse().toString();
				if (s1.equals(s2))
				{
					return true;
				}
				ch[begin] = temp;
				temp = ch[end];
				ch[end] = ' ';
				String s3 = new String(ch).trim().replace(" ", "");
				String s4 = new StringBuilder(s3).reverse().toString();
				if (s3.equals(s4))
				{
					return true;
				}
				ch[end] = temp;
			}
			begin++;
			end--;
		}
		if (count == 0)
		{
			return true;
		}
		return false;
	}
}