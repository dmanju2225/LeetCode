package stringEasyProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountAndSay
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter an integer to get sequence");
		int n=scan.nextInt();
		//CountAndSay c1=new CountAndSay();
		//String res=c1.sequence(n);
		String res=sequence(n);
		System.out.println(res);
	}

	private static  String sequence(int n)
	{
		// TODO Auto-generated method stub
		List<String> ls=new ArrayList<String>();
		
		ls.add("");
		ls.add("1");
		ls.add("11");
		
		for(int i=3;i<=n;i++){
			StringBuilder sb=new StringBuilder();
			String s=ls.get(i-1);
			int len=s.length()-1;
			int count=1;
			int j=0;
			for( j=0;j<len;j++){
				if(s.charAt(j)==s.charAt(j+1)){
					count++;
					continue;
				}
				else{
					sb.append(""+count+""+s.charAt(j));
					count=1;
			}
			}
			sb.append(""+count+""+s.charAt(j));
			ls.add(sb.toString());
		}
		return ls.get(n);
	}

}
