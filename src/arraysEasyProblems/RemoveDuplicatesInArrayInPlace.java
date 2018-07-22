package arraysEasyProblems;
/* remove duplicate elements in place, return the length and after the length elements can be anything*/

import java.util.Scanner;

public class RemoveDuplicatesInArrayInPlace
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
		int res=RemoveDuplicateInPlace(a);
		System.out.println(res);
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}

	private static int RemoveDuplicateInPlace(int[] a)
	{
		// TODO Auto-generated method stub
		int n=a.length;
       for(int i=0;i<n;i++){
    	   for(int j=i+1;j<n;j++){
    		   if(a[i]==a[j]){
    			   a[j]=a[n-1];
    			   n--;
    		   }
    	   }
       }
       return n;
}
}
