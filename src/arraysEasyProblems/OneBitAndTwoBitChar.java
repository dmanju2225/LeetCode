package arraysEasyProblems;
/*We have two special characters. The first character can be represented by one bit 0. 
 * The second character can be represented by two bits (10 or 11).Now given a string represented
 *  by several bits. Return whether the last character must be a one-bit character or not. 
 *  The given string will always end with a zero.*/
public class OneBitAndTwoBitChar
{

	public static void main(String[] args)
	{
	int[] bits={1,0,0};
	boolean result=method(bits);
System.out.println(result);
boolean Oresult=Omethod(bits);
System.out.println(Oresult);
	}

	private static boolean Omethod(int[] bits)
	{
		// TODO Auto-generated method stub
		int i = 0;
		int n=bits.length;
		while(i<n-1){
			if(bits[i]==0){
				i++;
			}
			else{
				i=i+2;
			}
		}
		return i==n-1;
	}

	private static boolean method(int[] bits)
	{
		// TODO Auto-generated method stub
		int len=bits.length;
		for(int i=0;i<len;i++){
			if(bits[i]==0){
				if(i==len-1){
					return true;
				}
				continue;
			}
			else {
				i=i+1;
			}
		}
		return false;
	}

}

