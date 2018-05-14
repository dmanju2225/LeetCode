package stringEasyProblems;
/*Initially, there is a Robot at position (0, 0). Given a sequence of its moves, 
 * judge if this robot makes a circle, which means it moves back to the original place.
The move sequence is represented by a string. And each move is represent by a character. 
The valid robot moves are R (Right), L (Left), U (Up) and D (down). 
The output should be true or false representing whether the robot makes a circle.
Ex:Input: "UD" Output: true, Input: "LL" Output: false*/

import java.util.Scanner;

public class JudgeCircle
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string as moves(U,D,L,R)");
		String moves = scan.nextLine();
		boolean bl = judgeCircle(moves);
		System.out.println(bl);

	}

	private static boolean judgeCircle(String moves)
	{
		// TODO Auto-generated method stub
		int x = 0;// original position x=0;y=0;
		int y = 0;
		char[] ch = moves.toCharArray();
		for (char move : ch)
		{
			if (move == 'R')
				x++;
			else if (move == 'L')
				x--;
			else if (move == 'U')
				y++;
			else if (move == 'D')
				y--;
		}
		if (x == 0 && y == 0)
			return true;
		else
			return false;
	}

}
