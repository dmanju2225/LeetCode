package stringEasyProblems;

import java.util.Scanner;
/*Implement strStr().
Returns the index of the first occurrence of needle in haystack,
 or -1 if needle is not part of haystack.*/

public class FirstOccuranceOfString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string A");
		String A = scan.nextLine();
		System.out.println("enter string B");
		String B = scan.nextLine();
		int indexOfOccurance = strStr(A, B);
		System.out.println(indexOfOccurance);

	}

	private static int strStr(String a, String b)
	{
		// TODO Auto-generated method stub
		int aL=a.length();
		int bL=b.length();
		if(a.equals(b)){
			return 0;
		}
		for(int i=0;i<aL;i++){
			int j=i+bL;
			if(j<=aL){
				String subStr=a.substring(i, j);
				if(subStr.equals(b)){
					return i;
				}
			}
		}
		return -1;
	}

}
