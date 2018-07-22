package arraysEasyProblems;
/*Given an array nums, write a function to move all 0's to the end of it while maintaining
 *  the relative order of the non-zero elements.
 */
public class MoveZerosToRightKeepingOrder
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a={0,1,0,3,12};
		moveZeroToRight(a);
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
		}

	}

	private static void moveZeroToRight(int[] a)
	{
		// TODO Auto-generated method stub
		int n=a.length;
		int start1=0;
		int start2=0;
		while(start2<n){
			if(a[start1]!=0){ //if a[start1] is non zero its in right position
				start1++;
				}
			else if(a[start2]!=0){//if a[start1] =0 and a[start2] is number
				a[start1]=a[start2];
				a[start2]=0;
				start1++;
			}
			start2++;//if both a[start1] and a[start2]=0, and always start2 move forward
		}	
	}
	}


