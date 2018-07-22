package arraysEasyProblems;

import java.util.HashSet;

public class IsAnArrayContinuousSeq
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int[] a={3,1,5,2,4};
boolean res=isArrayContinuous(a);
System.out.println(res);
	}

	private static boolean isArrayContinuous(int[] a)
	{
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			if(!hs.add(a[i]))
				return false;
			hs.add(a[i]);
			if(a[i]<min){
				min=a[i];
			}
		}
		for(int i=1;i<hs.size();i++){
			if(!hs.contains(min+i)){
				return false;
			}
		}
		return true;
	}

}
