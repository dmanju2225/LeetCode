package arraysEasyProblems;

public class MergeTwoSortedArrays
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[] = new int[7];
		a[0] = 1;
		a[1] = 3;
		a[2] = 5;
		a[3] = 6;
		int b[] = { 0, 2, 6 };
		int n = b.length;
		int m = a.length - n;
		mergeSorted(a, b, m, n);
		for (int i = 0; i < m + n; i++)
		{
			System.out.println(a[i]);
		}
	}

	private static void mergeSorted(int[] a, int[] b, int m, int n)
	{
		// TODO Auto-generated method stub	
		int end1 = m - 1;
		int end2 = n - 1;
		int end = m + n - 1;
		while (end1 >=0 && end2>=0)
		{	
			if (a[end1] > b[end2])
			{
				a[end] = a[end1];
				end1--;
				end--;	
			}
			else
			{
				a[end] = b[end2];
				end2--;
				end--;
			}
		}
		while (end2>=0)
		{
			a[end] = b[end2];
			end2--;
			end--;
		}
		while (end1>=0)
		{
			a[end] = a[end1];
			end1--;
			end--;
		}
	}
}
