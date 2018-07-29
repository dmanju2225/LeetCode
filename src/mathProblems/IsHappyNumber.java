package mathProblems;

import java.util.HashSet;

/*Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: 
Starting with any positive integer, replace the number by the sum of the squares of its digits, 
and repeat the process until the number equals 1 (where it will stay), 
or it loops endlessly in a cycle which does not include 1. 
Those numbers for which this process ends in 1 are happy numbers.*/
/*Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1*/

public class IsHappyNumber
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		boolean res=isHappy(8);

	}
	public static boolean isHappy(int n) {
        int digit=0;
        int sum=0;
        HashSet<Integer> hs=new HashSet<Integer>();
        if(n==1) return true;
        while(true){
            
            digit=n%10;
            n=n/10;
            sum=sum+(digit*digit);
            if(n==0){
                if(sum==1) return true;
                  n=sum;
                  if(!hs.contains(n)) {
                      hs.add(n);
                          sum=0;
                  }
                else
                    return false;                        
                }
                
            }
        }
        

}
