package stringEasyProblems;

import java.util.Scanner;
/*Give a string s, count the number of non-empty (contiguous) substrings that have 
 * the same number of 0's and 1's, and all the 0's and all the 1's in these 
 * substrings are grouped consecutively.
 Substrings that occur multiple times are counted the number of times they occur.*/
/*"00110011" Output: 6
Explanation: There are 6 substrings that have equal number of 
consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".*/

public class CountBinarySubStrings
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String s = scan.nextLine();
		int res = countBinarySubString(s);
		System.out.println(res);
		int Ores = OcountBinarySubString(s);
		System.out.println(Ores);
	}

	private static int OcountBinarySubString(String s)
	{
		// TODO Auto-generated method stub
		int[] groups=new int[s.length()];
		groups[0]=1;
		int t=0;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i-1)!=s.charAt(i)){//For example, if s = "110001111000000", then groups = [2, 3, 4, 6].
				groups[++t]=1;//creating new group whenever there is change in charbit
			}
			else{
				groups[t]++;//Incrementing value of already created group
			}
		}
		int res=0;
		for(int i=1;i<=t;i++){//t is groups array size-1
			res=res+Math.min(groups[i-1],groups[i]);
		}
		return res;
	}

	private static int countBinarySubString(String s)
	{
		// TODO Auto-generated method stub
		int len = s.length();
		int flag = 0;
		int count = 0;
		int l=0;
		for (int i = 0; i < len - 1; i++)
		{
			
			char ch = s.charAt(i);
			for (int j = i + 1; j <= len; j++)
			{	
				if ((j - i) % 2 == 0)
				{
					//System.out.println("i is "+i+" j is "+j);
					int k = i;
					l=i+(j-i)/2;
					while (k <i+(j-i)/2 && l<j)
					{
						flag = 0;
						//System.out.println("k is "+k+" l is "+l);
						if (s.charAt(k) == ch&&s.charAt(l) != ch)
						{
							flag = 1;
							//System.out.println("flag is "+flag);
						}
						else
						{
							break;
						}
						k++;
						l++;
					}
					if(flag==1){
					count++;
					//System.out.println("count is "+count);
					}
				}
			}
		}
		return count;
	}
}
