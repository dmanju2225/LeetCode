package stringEasyProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanStringToInteger
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String s= scan.nextLine();
		int res=romanToInt(s);
		System.out.println(res);
	}

	private static int romanToInt(String s)
	{
		// TODO Auto-generated method stub
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int result=0;
		for(int i=0;i<s.length()-1;i++){
			if(map.get(s.charAt(i+1))>map.get(s.charAt(i))){
				result=result-map.get(s.charAt(i));
			}
			else{
				result=result+map.get(s.charAt(i));
			}
		}
		result=result+map.get(s.charAt(s.length()-1));
		return result;
	}
}
