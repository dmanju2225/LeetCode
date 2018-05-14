package arraysEasyProblems;
/*Given an array of integers where 1<= a[i] <= n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.*/
/*Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class NumDisappearedInArray
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
List<Integer> result=findDisappearedNums(a,n);
for(int i=0;i<result.size();i++){
	System.out.println(result.get(i));
}
	}

	private static List<Integer> findDisappearedNums(int[] a,int n)
	{
		// TODO Auto-generated method stub
		
		List<Integer> nums=new ArrayList<Integer>();
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<n;i++){
			hs.add(a[i]);
		}
		for(int i=1;i<=n;i++){
			if(!hs.contains(i)){
				nums.add(i);
			}
		}
		return nums;
	}

}
