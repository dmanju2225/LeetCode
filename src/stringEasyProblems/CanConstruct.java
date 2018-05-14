package stringEasyProblems;
/*Given an arbitrary ransom note string and another string containing letters
 *  from all the magazines, write a function that will return true if the ransom note 
 *  can be constructed from the magazines ; otherwise, it will return false.
 Each letter in the magazine string can only be used once in your ransom note.*/
/*canConstruct("a", "b") -> false canConstruct("aa", "ab") -> false canConstruct("aa", "aab") -> true*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CanConstruct
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter a string ");
		String ransomNote = scan1.nextLine();
		System.out.println("enter a string ");
		String magazine = scan1.nextLine();
		boolean bl=canConstruct(ransomNote,magazine);
		System.out.println(bl);
		boolean Obl=OcanConstruct(ransomNote,magazine);
		System.out.println(Obl);
		}

	private static boolean OcanConstruct(String ransomNote, String magazine)
	{
		// TODO Auto-generated method stub
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<magazine.length();i++){       //magazine charcount
			if(hm.get(magazine.charAt(i))==null){
				hm.put(magazine.charAt(i),1);
			}
			else{
				hm.put(magazine.charAt(i),hm.get(magazine.charAt(i))+1);
			}
		}
		for(int i=0;i<ransomNote.length();i++){
			if(hm.get(ransomNote.charAt(i))==null||hm.get(ransomNote.charAt(i))==0){
				return false;
			}
			else{
				hm.put(ransomNote.charAt(i),hm.get(ransomNote.charAt(i))-1);//hm will be replaced with this count
			}
		}
		return true;
		
	}

	private static boolean canConstruct(String ransomNote, String magazine)
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		int n=ransomNote.length();
		int m=magazine.length();
		if(ransomNote.equals(magazine)){
			return true;
		}
		if(n>m){
			return false;
		}
		else{
			char[] Nch=ransomNote.toCharArray();
		    char[] mch=magazine.toCharArray();
		    for(int i=0;i<Nch.length;i++){
		    	int flag=0;
		    	for(int j=0;j<magazine.length();j++){
		    		if(al.contains(j)){
		    			continue;
		    		}
		    		if(Nch[i]==mch[j]){
		    			flag=1;
		    		    al.add(j);
		    			break;
		    		}
		    	}
		    	if(flag==0){
		    		return false;
		    	}	
		    }
		   return true; 
		}
	}
}
