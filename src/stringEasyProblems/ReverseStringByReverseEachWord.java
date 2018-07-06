package stringEasyProblems;

import java.util.Scanner;

public class ReverseStringByReverseEachWord
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter input string");
		String ip=scan.nextLine();
		String res=method(ip);
		System.out.println(res);
	}

	private static String method(String ip)
	{
		// TODO Auto-generated method stub
		int n=ip.length();
        String reverse="";
        for(int j=n-1;j>=0;j--)
        {
        	reverse=reverse+ip.charAt(j);
        }
        System.out.println(reverse);
        String[] str=reverse.split("\\s");
        int k=str.length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++)
        {
        	String s=str[i];
        	int len=str[i].length();
        	String reverseWord="";
        	
        	for(int j=len-1;j>=0;j--)
        	{
        	reverseWord=reverseWord+s.charAt(j);
        	}
        	sb.append(reverseWord+" ");
        }
		return sb.toString();
	}

}
