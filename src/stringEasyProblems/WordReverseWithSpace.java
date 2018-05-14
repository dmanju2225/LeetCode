package stringEasyProblems;

import java.util.Scanner;

public class WordReverseWithSpace
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string ");
		String str = scan.nextLine();
        String result=reverseWords(str);
        System.out.println(result);
	}

	private static String reverseWords(String str)
	{
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		String[] strArr=str.split(" ");
		int count=0;
		for(String st:strArr){
			count++;
			char[] ch=st.toCharArray();
			for(int i=st.length()-1;i>=0;i--){
				sb.append(ch[i]);
			}
			if(count!=strArr.length)
			{
			sb.append(' ');
			}
		}
		return sb.toString();
	}

}
