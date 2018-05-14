package arraysEasyProblems;
/*Given an integer array, find three numbers whose product is maximum and output the maximum product*/
/* ip:[9,1,5,6,7,2] op : 378;
 * ip: [-4,-3,-2,-1,60] op: 720;
 */
import java.util.Scanner;
/* ip:-4,-3,-2,-1,60 op:720*/
public class MaximumProductOfThreeNums
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter length of array");
		int n=scan.nextInt();
		int[] a =new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int result1=maximumProductOfThreeNums(a);
		System.out.println(result1);
		int result2=OmaximumProductOfThreeNums(a);
		System.out.println(result2);
	}

	private static int OmaximumProductOfThreeNums(int[] a)
	{
		// TODO Auto-generated method stub
		int prod1;
		int prod2;
		int n=a.length;
		int first_max=Integer.MIN_VALUE;
		int second_max=Integer.MIN_VALUE;
		int third_max=Integer.MIN_VALUE;
		int first_min=Integer.MAX_VALUE;
		int second_min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(a[i]>first_max){
				third_max=second_max;
				second_max=first_max;
				first_max=a[i];
			}
			else if(a[i]>second_max){
				third_max=second_max;
				second_max=a[i];
			}
			else if(a[i]>third_max) {
				third_max=a[i];
		}
		}
		prod1=first_max*second_max*third_max;
		System.out.println("prod1 is "+prod1);
		for(int i=0;i<n;i++){
			if(a[i]<first_min){
				second_min=first_min;
				first_min=a[i];
			}
			else if(a[i]<second_min){
				second_min=a[i];
			}
		}
		prod2=first_min*second_min*first_max;
		System.out.println("prod2 is "+prod2);
		if(prod1>prod2)
		return prod1;
		 return prod2;
	}

	private static int maximumProductOfThreeNums(int[] a)
	{
		// TODO Auto-generated method stub
		int n=a.length;
		int maxProd=Integer.MIN_VALUE;
		int prod;
		for(int i=0;i<n-2;i++){
			for(int j=i+1;j<n-1;j++){
				for(int k=j+1;k<n;k++){
				 prod=a[i]*a[j]*a[k];
				 if(prod>maxProd){
					 maxProd=prod;
				 }
				}
			}
		}
		return maxProd;
	}
}
