package stringEasyProblems;

import java.util.Scanner;

public class AddTwoBinaryStrings
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a binary string ");
		String a = scan.nextLine();
		System.out.println("enter a binary string ");
		String b = scan.nextLine();
		String res = addBinary(a, b);
		System.out.println(res);
		scan.close();
	}

	private static String addBinary(String a, String b)
	{
		// TODO Auto-generated method stub
		String result = "";
		int sum;
		int carryOn = 0;
		if (a.length() < b.length())
		{
			String temp = b; // making sure a is always greater by swapping two
								// strings
			b = a;
			a = temp;
		}
		int al = a.length() - 1;
		int bl = b.length() - 1;
		char x = 0;
		char y = 0;
		int bit = 0;
		for (int k = al; k >= 0; k--)
		{
			x = a.charAt(k);
			if (bl >= 0)
			{
				y = b.charAt(bl);
				bl--;
			}
			else
			{
				y = '0';
			}

			int m = x - '0';
			int n = y - '0';
			sum = m + n + carryOn;
			carryOn = sum / 2;  //for decimal system /10
			bit = sum % 2;
			result = result + bit;
		}
		if (carryOn == 1)
		{
			result = result + carryOn;
		}
		return new StringBuilder(result).reverse().toString();
	}
}
