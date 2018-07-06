package arraysEasyProblems;

import java.util.HashSet;

public class ThirdMaxRepeat
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a={5,2,4,1,3,6,0};
int result = thirdMax(a);
System.out.println(result);

	}
	public static int thirdMax(int[] nums) {
		HashSet<Integer> hs=new HashSet();
        int len=nums.length;
        int Max=Integer.MIN_VALUE;
        int Second_Max=Integer.MIN_VALUE;
        int Third_Max=Integer.MIN_VALUE;
        
        for (int i=0;i<len;i++){
        	if(hs.add(nums[i])){
            if(nums[i]>=Max){
                Third_Max=Second_Max;
                Second_Max=Max;
                Max=nums[i];
            }
            else if(nums[i]>=Second_Max){
                Third_Max=Second_Max;
                Second_Max=nums[i];
            }
            else if(nums[i]>=Third_Max){
                Third_Max=nums[i];
            }
        	}
        }
        System.out.println("Max is "+Max);
        System.out.println("TMax is "+Third_Max);
        if(hs.size()==2||hs.size()==1)
            return Max;
            return Third_Max;
    }
}
