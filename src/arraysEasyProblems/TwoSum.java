package arraysEasyProblems;

import java.util.HashMap;

public class TwoSum
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] nums = { 2, 2, 2, 15 };
		int target = 4;
		//int[] res = twosum(nums, target);
		//for (int i = 0; i < res.length; i++)
		//{
			//System.out.println(res[i]);
		//}
		try
		{
			int[] Ores = Otwosum(nums, target);
			for (int i = 0; i < Ores.length; i++)
			{
				System.out.println(Ores[i]);
			}
		}
		catch (Exception e)
		{
			System.out.println("no two sum solution");
		}

	}

	private static int[] Otwosum(int[] nums, int target)
	{
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++)
		{
			hm.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++)
		{
			int complement = target - nums[i];
			if (hm.containsKey(complement) && hm.get(complement) != i)
			{// for ex: target 4, nums[0]=2
				return new int[] { i, hm.get(complement) };
			}
			
		}
		throw new IllegalArgumentException("no two sum solution");
	}

	private static int[] twosum(int[] nums, int target)
	{
		// TODO Auto-generated method stub
		int[] arr = new int[2];
		for (int i = 0; i < nums.length - 1; i++)
		{
			for (int j = i + 1; j < nums.length; j++)
			{
				if (nums[j] == target - nums[i])
				{
					arr[0] = i;
					arr[1] = j;
				}
			}
		}
		return arr;
	}

}
