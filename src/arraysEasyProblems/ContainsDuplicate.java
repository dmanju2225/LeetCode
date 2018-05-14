package arraysEasyProblems;
/*Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 */


import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter length of array");
		int n=scan.nextInt();
		int[] a =new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		boolean result=containsDuplicate(a,n);
		System.out.println(result);
	}

	private static boolean containsDuplicate(int[] a,int n)
	{
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<n;i++){
			if(!hs.add(a[i])){
				return true;
			}
		}
		return false;
	}

}
