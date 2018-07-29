package mathProblems;
/*Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.*/
/*Input: 6
Output: true
Explanation: 6 = 2 × 3*/
/*Input: 14
Output: false 
Explanation: 14 is not ugly since it includes another prime factor 7.*/
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
