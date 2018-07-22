package mathProblems;

import java.util.Scanner;

public class IsUglyNumber
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter number");
int number=scan.nextInt();
boolean res=isUgly(number);
System.out.println(res);
	}

	private static boolean isUgly(int number)
	{
		// TODO Auto-generated method stub
		if(number==0) return false;
		while(number!=1){
			if(number%2==0){
				number=number/2;
			}
			else if(number%3==0){
				number=number/3;
			}
			else if(number%5==0){
				number=number/5;
			}
			else
				return false;
		}
		return true;
	}

}
