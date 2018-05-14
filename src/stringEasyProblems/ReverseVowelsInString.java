package stringEasyProblems;

import java.util.Scanner;

public class ReverseVowelsInString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = scan.nextLine();
		String result = reverseVowels(s);
		System.out.println(result);
	}

	private static String reverseVowels(String s)
	{
		// TODO Auto-generated method stub
		int begin = 0;
		int end = s.length() - 1;
		int flag1 = 1;
		int flag2 = 1;
		int index1 = 0;
		int index2 = 0;
		char[] ch = s.toCharArray();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u','A','E','I','O','U' };
		while (end > begin)
		{
			flag1 = 0;
			flag2 = 0;
			while (end > begin)
			{

				for (int i = 0; i < vowels.length; i++)
				{
					if (ch[begin] == vowels[i])
					{
						index1 = begin;
						flag1 = 1;
						break;
					}
				}

				if (flag1 == 1)
				{
					break;
				}
				begin++;
			}
			while (end > begin)
			{

				for (int i = 0; i < vowels.length; i++)
				{
					if (ch[end] == vowels[i])
					{
						index2 = end;
						flag2 = 1;
						break;
					}
				}

				if (flag2 == 1)
				{
					break;
				}
				end--;
			}

			if (flag1 == 1 && flag2 == 1)
			{
				swap(ch, index1, index2);
				begin++;
				end--;
			}
		}

		return new String(ch);

	}

	private static void swap(char[] ch, int index1, int index2)
	{
		// TODO Auto-generated method stub
		char temp = ch[index1];
		ch[index1] = ch[index2];
		ch[index2] = temp;
	}

}