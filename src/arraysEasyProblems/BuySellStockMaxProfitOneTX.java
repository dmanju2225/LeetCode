package arraysEasyProblems;
/*Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell 
one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.*/
/*Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.*/

public class BuySellStockMaxProfitOneTX
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a={7,1,3,5,4};
		int maxProfit=maxProfit(a);
		int maxProfit1=OmaxProfit(a);
		System.out.println(maxProfit);
		System.out.println(maxProfit1);
	}

	private static int OmaxProfit(int[] a)
	{
		// TODO Auto-generated method stub
		int minPrice=Integer.MAX_VALUE;
		int maxProfit=0;
		int n=a.length;
		for(int i=0;i<n;i++){
			if(a[i]<minPrice){
				minPrice=a[i];//taking valley point or min point on the graph 
			}
			else if(a[i]-minPrice>maxProfit){//after min point calculating peak or profit
				maxProfit=a[i]-minPrice;
			}
		}
		return maxProfit;
	}

	private static int maxProfit(int[] a)
	{
		// TODO Auto-generated method stub
		int maxProfit=0;
		int n=a.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if((a[j]-a[i])>maxProfit){
					maxProfit=a[j]-a[i];
				}
			}
		}
		return maxProfit;
	}

}
