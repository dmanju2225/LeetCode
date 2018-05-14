package arraysEasyProblems;
/*Given a binary array, find the maximum number of consecutive 1s in this array.*/
/*Input: [1,1,0,1,1,1] Output: 3*/
import java.util.Arrays;

public class FindMaxConsecutive1s
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int[] bin={1,1,1,1,1,1,1,1,1,1,1,1};
int res=maxConsecutive1s(bin);
System.out.println(res);
int Ores=OmaxConsecutive1s(bin);
System.out.println(Ores);
	}

	private static int OmaxConsecutive1s(int[] bin)
	{
		// TODO Auto-generated method stub
		int max=0;int sum=0;
		for(int i=0;i<bin.length;i++){
			sum=sum+bin[i];
			if(bin[i]==0){
				sum=0;
			}
			max=Math.max(max,sum);
		}
		return max;
	}

	private static int maxConsecutive1s(int[] bin)
	{
		// TODO Auto-generated method stub
		
		int count=0;
		int arrSize=bin.length;
		int[] arr=new int[arrSize];
		int flag=0;
		int t=0;
		int i=0;
		while(i<arrSize){
			if(bin[i]==1){
				flag=0;
				count++;
				i++;
				continue;
			}
			else if(i>=1&&bin[i]==0&&bin[i-1]==1){
				flag=1;
				arr[t]=count;
				count=0;
				++t;
				i++;
				continue;
			}
			i++;
		}
		if(arr.length==0&&count>1){
			return count;
		}
		if(flag==0){
			arr[t]=count;
		}
		int max=Integer.MIN_VALUE;
		for(int j=0;j<=t;j++){
			if(arr[j]>max){
				max=arr[j];
			}
		}
		return max;
	}

}
