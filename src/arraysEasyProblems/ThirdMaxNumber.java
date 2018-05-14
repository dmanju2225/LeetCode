package arraysEasyProblems;

import java.util.HashSet;

/*Given a non-empty array of integers, return the third maximum number in this array.
 *  If it does not exist, return the maximum number. The time complexity must be in O(n).
 */
public class ThirdMaxNumber
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] nums = {1, 1, 2};//1,2 or 2,2,2,2 
		int thirdMax = thirdMax(nums);
		System.out.println(thirdMax);
		int OthirdMax = OthirdMax(nums);
		System.out.println(OthirdMax);
	}

	private static int OthirdMax(int[] nums)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	private static int thirdMax(int[] nums)
	{
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		int third_max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++)
		{
			if (hs.add(nums[i]))
			{
				if (nums[i] > max)
				{
					third_max = second_max;
					second_max = max;
					max = nums[i];
				}
				else if (nums[i] > second_max)
				{
					third_max = second_max;
					second_max = nums[i];
				}
				else if (nums[i] > third_max)
				{
					third_max = nums[i];
				}
			}
		}
		if (hs.size() == 2||hs.size() == 1)
			return max;
		return third_max;
	}

}
