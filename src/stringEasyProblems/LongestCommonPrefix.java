package stringEasyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String[] s = { "aaaaaa", "aaaa","aaaa"};
		String res = longestCommonPrefix(s);
		System.out.println(res);
	}

	private static String longestCommonPrefix(String[] strs)
	{
		// TODO Auto-generated method stub
		Arrays.sort(strs);//to take minimum length string as first one
		String s2 = null;
		if(strs.length==0){
			return "";
		}
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 1; i <= strs[0].length(); i++)
		{
			al.add(strs[0].substring(0, i));
			for (int j = 1; j < strs.length; j++)
			{
				if(strs[j]==""){
					return "";
				}
				if (i <= strs[j].length())
				{
					if (al.contains(strs[j].substring(0, i)))
					{
						s2=strs[j].substring(0,i);
						continue;
					}
					else
					{
						if (i == 1)
						{
							return "";
						}
						return strs[0].substring(0, i - 1);
					}
				}
			}
		}
		return s2;
	}
}
