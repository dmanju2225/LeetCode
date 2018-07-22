package arraysEasyProblems;

public class LeastDistanceForRepeated
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] ar = { 1, 2, 3 , 2, 0, 4, 4 };
		int[] result = LeastDist(ar);
		System.out.println(result[0] + " " + result[1]);

	}

	private static int[] LeastDist(int[] ar)
	{
		// TODO Auto-generated method stub
		int[] a = new int[2];
		//int finalMin = Integer.MAX_VALUE;
		int dist = 0;
		int element = 0;
		int minDist = Integer.MAX_VALUE;
		int n = ar.length;
		int j = 0;
		for (int i = 0; i < n; i++)
		{
		//	int minDist = Integer.MAX_VALUE;
			for (j = i+1; j < n; j++)
			{
			//	if(j-i>minDist)
				//	break;
				if (ar[i] == ar[j])
				{
					dist = j - i;
					element = ar[j];
					/*if (dist == 1)
					{
						a[0] = dist;
						a[1] = element;
						return a;
					}*/
					if (dist<minDist)
					{
						 minDist=dist;
						 a[0] = dist;
						 a[1] = element;
						 break;
					}
					
				}
			}
		/*	if (minDist < finalMin)
			{
				finalMin=minDist;
				System.out.println(finalMin + " " + element);
				a[0] = finalMin;
				a[1] = element;
			}*/
		}
		
		return a;
	}
}
