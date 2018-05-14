package arraysEasyProblems;
/*Given an array of integers and an integer k, find out whether there are two distinct indices 
 * i and j in the array such that nums[i] = nums[j] and 
 * the absolute difference between i and j is at most k.
 */
/*input [1,0,1,1] k=1 output true*/
import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicateII
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter length of array");
		int n=scan.nextInt();
		System.out.println("enter difference of indices");
		int k=scan.nextInt();
		int[] a =new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		boolean result=containsDuplicate(a,n,k);
		System.out.println(result);
	}

	private static boolean containsDuplicate(int[] a, int n, int k)
	{
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int i;
		for(i=0;i<n;i++){
			if(hm.containsKey(a[i])){
				if(i-(hm.get(a[i]))<=k){
					return true;
				}
			}
			hm.put(a[i],i);
	}
		return false;
	}
}
