package stringEasyProblems;

import java.util.Scanner;

public class ThirdMaxInArray
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array length n");
		int n = scan.nextInt();
		System.out.println("enter integers of size " + n);
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = scan.nextInt();
		}
		int third = thirdMax(arr);
		System.out.println(third);
	}

	private static int thirdMax(int[] arr)
	{
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int secondmax = 0;
		int thirdmax = 0;
		int fourthmax=0;
		// int thirdmax=0;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > max)
			{
				fourthmax=thirdmax;
				thirdmax = secondmax;
				secondmax = max;
				max = arr[i];
				System.out.println("max is " + max + " second max is " + secondmax);
			}
			else if (arr[i] > secondmax)
			{
				fourthmax=thirdmax;
				thirdmax = secondmax;
				secondmax = arr[i];
				System.out.println("final second max is " + secondmax + " third max is " + thirdmax);
			}
			else if ( arr[i] > thirdmax)
			{
				fourthmax=thirdmax;
				thirdmax = arr[i];
				System.out.println("final third max is " + thirdmax);
			}
			else if ( arr[i] > fourthmax)
			{
				fourthmax = arr[i];
				System.out.println("final third max is " + thirdmax);
			}
		}
		return fourthmax;
	}
}
