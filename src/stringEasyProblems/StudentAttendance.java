package stringEasyProblems;
/*You are given a string representing an attendance record for a student. 
 * The record only contains the following three characters:
'A' : Absent. 'L' : Late. 'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) 
or more than two continuous 'L' (late).
You need to return whether the student could be rewarded according to his attendance record.*/
/*Input: "PPALLP" Output: True Input: "PPALLL" Output: False*/
import java.util.Scanner;

public class StudentAttendance
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = scan.nextLine();
		 boolean result=checkRecord(s);
		 System.out.println(result);
		 boolean Oresult=OcheckRecord(s);
		 System.out.println(Oresult);
	}

	private static boolean OcheckRecord(String s)
	{
		// TODO Auto-generated method stub
		if(s.indexOf('A')!=s.lastIndexOf('A')||s.contains("LLL"))
			return false;
		return true;
	}

	private static boolean checkRecord(String s)
	{
		// TODO Auto-generated method stub
		
		int Acount=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='A'){
				Acount++;
				if(Acount>1){
					return false;
				}
			}
			if(ch[i]=='L'&&i>=2){
				if(ch[i-1]=='L'&&ch[i-2]=='L'){
					return false;
				}
			}
		}
		
		return true;
		
	}

}
