package arraysEasyProblems;

public class LongestContinuousIncreasingSubSeq
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int[] a={1,3,5,6, 7,8,4,6,7,8,9};
int res=longestLength(a);
System.out.println(res);
	}

	private static int longestLength(int[] a)
	{
		// TODO Auto-generated method stub
		if(a.length==0) return 0;
		int maxCount=1; //if {2,2,2,2} op= 1;
		int count=1;
		for(int i=0;i<a.length-1;i++){
			if(a[i]<a[i+1]){
				count++;
				if(count>maxCount){
					maxCount=count;
				}
			}
			else{
				count=1;
			}
			
		}
		return maxCount;
	}

}
