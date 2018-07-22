package arraysEasyProblems;
/*Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
(i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time 
(i.e., you must sell the stock before you buy again).*/
/*Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.*/
public class BuySellStockMaxProfitManyTXS
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int[] a={7,1,5,3,6,4};
int maxProfit=OmaxProfit(a);
System.out.println(maxProfit);
	}

	private static int OmaxProfit(int[] a)
	{
		// TODO Auto-generated method stub
		int maxProfit=0;
		int n=a.length;
		for(int i=1;i<n;i++){
			if(a[i]-a[i-1]>0){//taking only upward or peak graph and adding
				maxProfit=maxProfit+(a[i]-a[i-1]);
			}
		}
		return maxProfit;
	}

}
