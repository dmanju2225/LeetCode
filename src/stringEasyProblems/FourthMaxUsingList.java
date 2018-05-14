package stringEasyProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FourthMaxUsingList
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array length n");
		int n = scan.nextInt();
		System.out.println("enter highest max position: lth highest");
		int l = scan.nextInt();
		System.out.println("enter integers of size " + n);
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = scan.nextInt();
		}
		int fourth = fourthMax(arr, l);
		System.out.println(fourth);
	}

	private static int fourthMax(int[] arr, int l)
	{
		int i = 0;
		int j = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int k = 0; k < l; k++)
		{
			list.add(0);
		}
		for (i = 0; i < arr.length; i++)
		{
			for (j = 0; j < list.size() - 2; j++)
			{
				if (arr[i] > list.get(j))
				{
					list.set(j + 2, list.get(j + 1));
					list.set(j + 1, list.get(j));
					list.set(j, arr[i]);
				}
				else if (arr[i] < list.get(j) && arr[i] > list.get(j + 1))
				{
					list.set(j + 2, list.get(j + 1));
					list.set(j + 1, arr[i]);
				}
				else if (arr[i] < list.get(j+1) && arr[i] > list.get(j + 2))
				{
					list.set(j + 2, arr[i]);
				}
			}	
		}
		return list.get(list.size() - 1);
	}
}
