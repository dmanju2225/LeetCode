package arraysEasyProblems;
/*Given an array and a value, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.*/
/* ip:[2,2,3] , 2 op: 2 [3,3,3] 
 * ip:[2,3,4,3,1,3] , 3 op:[2,4,1,3,3,3]
 */
import java.util.Scanner;

public class RemoveElement
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter length of array");
		int n = scan.nextInt();
		System.out.println("enter element to remove");
		int k = scan.nextInt();
		int[] a = new int[n];
		System.out.println("enter array elements");
		for (int i = 0; i < n; i++)
		{
			a[i] = scan.nextInt();
		}
		//int result = removeElement(a, n, k);
		//System.out.println("result is " + result);
		//int Oresult = twoPointerremoveElement(a, n, k);
		//System.out.println("result is " + Oresult);
		int OOresult = rareRemoveElementNoOrder(a, n, k);
		System.out.println("result is " + OOresult);
		
	}

	private static int rareRemoveElementNoOrder(int[] a, int n, int k)
	{
		// TODO Auto-generated method stub
		int i=0;
		while(i<n){
			
			if(a[i]==k){
				a[i]=a[n-1]; //ip: 4,1,2,3,5 k=4 op: 5,1,2,3,5 : no order 1,2,3,5,4	
				n--;
			}
			else{
				i++;
			}
		}
		return n;
	}

	private static int twoPointerremoveElement(int[] a, int n, int k)
	{
		// TODO Auto-generated method stub
		int i=0;
		for(int j=0;j<n;j++){
			if(a[j]!=k){  //moving not to remove element to left
				a[i]=a[j]; //4,1,2,3,4 k=4 op: 1,2,3,3,4 : look at first 3 lements
				i++;
			}
		}
		return i;
	}

	private static int removeElement(int[] a, int n, int k)
	{
		// TODO Auto-generated method stub

		int finalCount = 0;
		int s = 0;
		int flag = 0;

		for (int l = 0; l < n; l++)
		{
			if (a[l] == k)
			{
				finalCount++;
			}
		}
		while (s < finalCount)
		{
			int i = 0;
			while (i < n)
			{
				if (a[i] == k)
				{
					flag = 1;
					break;
				}
				i++;
			}

			int j = i;

			while (flag == 1 && j < n - 1)
			{
				a[j] = a[j + 1];
				j++;

			}

			s++;
		}

		return n - finalCount;
	}
}
