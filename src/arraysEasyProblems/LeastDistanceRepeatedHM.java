package arraysEasyProblems;

import java.util.HashMap;

public class LeastDistanceRepeatedHM
{
        
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] ar = { 1, 2, 4, 0, 5, 4 };
		int[] result = LeastDist(ar);
		System.out.println(result[0] + " " + result[1]);

	}

	private static int[] LeastDist(int[] ar)
	{
		// TODO Auto-generated method stub
		int minDist=Integer.MAX_VALUE;
		int n=ar.length;
		int[] a=new int[2];
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			if(hm.containsKey(ar[i])){
				int j=hm.get(ar[i]);
				int dist=i-j;
				if(dist<minDist){
					minDist=dist;
					a[0]=j;
					a[1]=i;
				}
			}
			hm.put(ar[i],i);
		}
		return a;
	}

}
