/*****************************************
File Name: RaymondStickFigureOnStairs.java
Coder Name: Raymond Luu
Assignment: 2
*****************************************/
public class RaymondStickFigureOnStairs
{
	public static final int height = 6;
	
	public static void main (String[] args)
	{
		drawStickFigureOnStairs();
	}
	/***********************************
	Here I have one method that includes
	all of the nested for loops inside
	***********************************/
	public static void drawStickFigureOnStairs()
	{
		/****************************************
		This first for loop draws out the figure.
		The height is the class constant.
		I didn't want to mess with the variables
		because I didn't want it to be any bit
		confusing.
		****************************************/
		for(int i = 1; i <= height; i++)
		{
			//space before figure line 1
			for(int j = 1; j <= 30 - i * 5; j++)
			{
				System.out.print(" ");
			}
			System.out.print("  0  ******");
			/***********************************
			space after figure line 1
			(first line of the 
			figure is different than the second 
			and third line.
			***********************************/
			for(int j = 1; j <= 5 * i - 5; j++)
			{
					System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
			//space before figure line 2
			for(int j = 1; j <= 30 - i * 5; j++)
			{
				System.out.print(" ");
			}
			System.out.print(" /|\\ *");
			//space after figure line 2
			for(int j = 1; j <= 5 * i; j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
			//space before figure line 3
			for(int j = 1; j <= 30 - i * 5; j++)
			{
				System.out.print(" ");
			}
			System.out.print(" / \\ *");
			//space after figure line 3
			for(int j = 1; j <= 5 * i; j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		/**************************************
		The second for loop is for the floor.
		It creates the spacing needed to move
		the floor into its proper position when
		having different amount of steps.
		**************************************/
		for(int i = 1; i <= 30 - height * 5; i++)
		{
			System.out.print(" ");
		}
		/************************************
		The last for loop provides the floor.
		It creates a longer or shorter floor 
		depending on the height.
		************************************/
		for(int i = 1; i <= 5 * height + 6; i++)
		{
			System.out.print("*");
		}
		System.out.print("*");
	}
}