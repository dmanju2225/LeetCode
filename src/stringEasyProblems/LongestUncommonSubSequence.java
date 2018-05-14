package stringEasyProblems;
/*a=b. If both the strings are identical, it is obvious that no subsequence will be uncommon.
  Hence, return -1.
length(a)=length(b)a≠b. Example: abcabc and abdabd. In this case we can consider any string 
i.e. abcabc or abdabd as a required subsequence, as out of these two strings
 one string will never be a subsequence of other string. Hence, return length(a)or length(b)
length(a)≠length(b). Example abcdabcd and abcabc. In this case we can consider bigger string 
as a required subsequence because bigger string can't be a subsequence of smaller string. 
Hence, return max(length(a),length(b)).*/
/*Given a group of two strings, you need to find the longest uncommon subsequence*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LongestUncommonSubSequence
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String a = scan.nextLine();
		System.out.println("enter a string ");
		String b = scan.nextLine();
		int result = findLUSlength(a, b);
		System.out.println(result);
		int Oresult = OfindLUSlength(a, b);
		System.out.println(Oresult);
	}

	private static int OfindLUSlength(String a, String b)
	{
		// TODO Auto-generated method stub
		if(a.equals(b)){
			return -1;
		}
		return Math.max(a.length(),b.length());
	}

	private static int findLUSlength(String a, String b)
	{
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < a.length(); i++)
		{
			for (int j = i + 1; j <= a.length(); j++)
			{
				String sub = a.substring(i, j);
				if (!hm.containsKey(sub))
				{
					hm.put(sub, sub.length());
				}
			}
		}
		for (int i = 0; i < b.length(); i++)
		{
			for (int j = i + 1; j <= b.length(); j++)
			{
				String sub = b.substring(i, j);
				if (!hm.containsKey(sub))
				{
					hm.put(sub, sub.length());
				}
			}
		}
		Set<String> set=hm.keySet();
		Iterator<String> it=set.iterator();
		int max=Integer.MIN_VALUE;
		while(it.hasNext()){
			String sb=(String)it.next();
			if(sb.length()>max){
				max=sb.length();
			}
		}
		return max;
	}

}
