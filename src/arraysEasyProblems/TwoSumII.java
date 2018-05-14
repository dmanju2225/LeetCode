package arraysEasyProblems;
/*Given an array of integers that is already sorted in ascending order, find two numbers such that 
they add up to a specific target number.The function twoSum should return indices of the two numbers
such that they add up to the target, where index1 must be less than index2.
 Please note that your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and
 you may not use the same element twice.*/
import java.util.HashMap;
import java.util.Map;

public class TwoSumII
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//int[] numbers={1};
		//int target=1;
		int[] numbers = { 1,2, 2, 11, 15 };
		int target = 4;
		//int[] numbers={2,7,11,15};
		//int target=9;
		//int[] numbers = null;
		//int target=0;
		int[] res = twosum(numbers, target);
		for (int i = 0; i < res.length; i++)
		{
			System.out.println(res[i]);
		}
	}

	private static int[] twosum(int[] numbers, int target)//this solution works only for sorted array
	{
		// TODO Auto-generated method stub
		int[] index=new int[2];
		if(numbers==null||numbers.length<2) return index;
		int start=0;
		int end=numbers.length-1;
		int value;
		while(start<end){
			value=numbers[start]+numbers[end];
			if(value==target){
				index[0]=start+1;//need to return without zero based..index starts from 1
				index[1]=end+1;
				break;
			}
			else if(value>target){//u have to reduce value and values in ascending order so
				end--;
			}
			else{//u have to increase value
				start++;
			}
		}
         return index;
}
}