package arraysEasyProblems;
/*Find the contiguous subarray within an array (containing at least one number)
 *  which has the largest sum.For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6. need to return max sum of subarray*/
public class MaximunSubArray
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] nums = { 1, -7, 6,0};
		int maxSum = maxSub(nums);
		System.out.println(maxSum);
		int OmaxSum = OmaxSub(nums);
		System.out.println(OmaxSum);
	}

	private static int OmaxSub(int[] nums)
	{
		int n=nums.length;
		int maxEndingHere=0;
		int maxSoFar=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			maxEndingHere=maxEndingHere+nums[i];
			if(maxSoFar<maxEndingHere){
				maxSoFar=maxEndingHere;
			}
			if(maxEndingHere<0){
				maxEndingHere=0;
			}
		}
		return maxSoFar;
	}

	private static int maxSub(int[] nums)
	{
		// TODO Auto-generated method stub
		int maxSum = nums[0];
		int n = nums.length;
		int curSum = 0;
		for (int i = 0; i < n; i++)
		{
			curSum = 0;
			for (int j = i; j < n; j++)
			{
				curSum = curSum + nums[j];
				if (curSum > maxSum)
				{
					maxSum = curSum;
				}

			}
		}
		return maxSum;
	}
}
