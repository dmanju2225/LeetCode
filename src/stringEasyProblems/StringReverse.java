package stringEasyProblems;

import java.util.Scanner;

public class StringReverse
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = scan.nextLine();
		String result=reverseString(s);
		System.out.println(result);
		String Oresult=OreverseString(s);
		System.out.println(Oresult);

	}
	private static String OreverseString(String s)
	{
		int begin=0;
		int end=s.length()-1;
		char[] ch=s.toCharArray();
		while(end>begin){
			char temp=ch[begin];
			ch[begin]=ch[end];
			ch[end]=temp;
			begin++;
			end--;
		}
		
		return new String(ch);
	}
	public static  String reverseString(String s) {
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
		return reverse;
}
}
