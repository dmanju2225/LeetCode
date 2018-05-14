package stringEasyProblems;
/*Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.*/
import java.util.Scanner;

public class DetectCapitalLetterUse
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String word = scan.nextLine();
		boolean result=detectCapitalUse(word);
		System.out.println(result);
		boolean Oresult=OdetectCapitalUse(word);
		System.out.println(Oresult);
		boolean OOresult=OOdetectCapitalUse(word);
		System.out.println(OOresult);
		

	}
	private static boolean OOdetectCapitalUse(String word)
	{
		// TODO Auto-generated method stub
		return word.equals(word.toUpperCase()) || 
	               word.equals(word.toLowerCase()) ||
	               Character.isUpperCase(word.charAt(0)) && 
	               word.substring(1).equals(word.substring(1).toLowerCase());
	}

	private static boolean OdetectCapitalUse(String word)
	{
		// TODO Auto-generated method stub
		
		return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
	}

	private static boolean detectCapitalUse(String word)
	{
		// TODO Auto-generated method stub
		if(word.equals(word.toUpperCase())){
			return true;
		}
		if(word.equals(word.toLowerCase())){
			return true;
		}
		if(word.length()>1){
			if(word.charAt(0)>='A'&&word.charAt(0)<='Z'){
				String sub=word.substring(1,word.length());
				if(sub.equals(sub.toLowerCase())){
					return true;
				}	
			}
		}
		return false;
	}

}
