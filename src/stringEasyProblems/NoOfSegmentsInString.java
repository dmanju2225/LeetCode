package stringEasyProblems;

import java.util.Scanner;

public class NoOfSegmentsInString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = scan.nextLine();
		int res=countSegments(s);
		System.out.println(res);
		int Ores=OcountSegments(s);
		System.out.println(Ores);
	}  

	private static int OcountSegments(String s)
	{
		// TODO Auto-generated method stub
		int result=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '&&(i==0||s.charAt(i-1)==' ')){
				result++;
			}
		}
		return result;
	}

	private static int countSegments(String s)
	{
		// TODO Auto-generated method stub
		if(s.isEmpty()){
			return 0;
		}
		if(s.matches(" +")){
			return 0;
		}
		String[] strArr=s.trim().split(" +");
		System.out.println(strArr[0]); 
		return strArr.length;
	}

}
