package arraysEasyProblems;

/*Given an array of integers and an integer k, you need to find the 
 * number of unique k-diff pairs in the array. Here a k-diff pair is defined 
 * as an integer pair (i, j), where i and j are both numbers in the array 
 * and their absolute difference is k.
 */
/*Input: [3, 1, 4, 1, 5], k = 2 Output: 2, ex;(1,3),(3,5)*/
/*Input: [1, 3, 1, 5, 4], k = 0 Output: 1,ex:(1,1)*/
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class KdiffPairs
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//int[] nums = { 5816848,4160415,7533527,2956265,4279124,9527555,436133,7438296,7634095,8439619,1933159,7843867,2971885,5415063,3597106,2010864,8471713,3381662,4712093,2474085,1984917,7099308,3199407,1601002,8907755,9272612,1141026,542064,4716676,4997745,6550152,8064816,455878,7092288,1185402,4371297,3913896,4630056,4444850,4712632,2097658,6179915,4464254,1569817,7195438,108628,9799520,2063061,4968337,8995188,7934242,3628529,8975558,7980365,2205390,9912592,1118962,2737440,7593087,3156384,9201152,5565787,63636,8598001,7426073,4337423,4777114,6669185,9735201,8795228,8033571,7430742,550906,3707482,8273694,5355242,1775183,4592861,1092929,7368565,3590314,2790299,8724408,6892832,5329303,1099586,2412630,6380624,127213,814660,919509,3816094,7103178,6548697,2481431,563006,6124270,323741,8328862,3005307};
			int[] nums={3,1,4,1,5};	 
		int k = 2;
		//int[] nums={1,3,1,5,4};	//this case does not work with O solution ..follow OO solution 
		//int k = 0;
		/*int res = findPairs(nums, k);
		System.out.println(res);
		int Ores = OfindPairs(nums, k);
		System.out.println(Ores);*/
		int OOres= OOfindPairs(nums, k);//leetcode solution that works for all cases including when k=0
		System.out.println(OOres);
	}

	private static int OOfindPairs(int[] nums, int k)
	{
		// TODO Auto-generated method stub
		if(k<0||nums.length==0){
            return 0;
        }
		int count=0;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
		}
		System.out.println(hm.entrySet());
		for(Map.Entry<Integer, Integer> entry:hm.entrySet()){//if u sysout entryset u will get all k,v hashtable
			if(k==0){
				if(entry.getValue()>=2){
					count++;
				}
			}
			else{
				if(hm.containsKey(entry.getKey()+k)){
					count++;
				}
			}
		}
		return count;
	}

	private static int OfindPairs(int[] nums, int k)
	{
		// TODO Auto-generated method stub
		int count=0;
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			hs.add(nums[i]);//hs contains 3,1,4,5..no duplicate elements
		}
		Iterator<Integer> it=hs.iterator();//iterating over hashset
		HashSet<Integer> hs2=new HashSet<Integer>();//empty hashset
		while(it.hasNext()){
			Integer intr=(Integer)it.next();
			if(hs2.contains(intr-k)||hs2.contains(intr+k)){//1) x-y=k, y is x-k;2) y-x=k, y is x+k;
				count++;         //u have to check for both , similar to sumOfPairproblem
			}
				hs2.add(intr);//first element always added , finally hs and hs2 will be equal
		}
		//the above logic does not work when k=0..becoz set does not contain duplicate values..follow leetcode solution
		return count;
	}

	private static int findPairs(int[] nums, int k)//not efficient
	{
		// TODO Auto-generated method stub
		HashSet<Integer> hs1 = new HashSet<Integer>();
		int count = 0;
		Arrays.sort(nums);//this logic works for all cases but not efficient
		int len = nums.length - 1;
		for (int i = len; i > 0; i--)
		{
			if (hs1.add(nums[i]))
			{
				HashSet<Integer> hs = new HashSet<Integer>();
				for (int j = i - 1; j >= 0; j--)
				{
					if (nums[i] - nums[j] == k)
					{
						if (hs.add(nums[j]))
						{
							count++;
						}
					}
				}

			}
		}
		return count;
	}
}
