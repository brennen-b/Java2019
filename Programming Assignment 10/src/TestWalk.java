// ************************************************************
// TestWalk.java
//
// Program to test methods in the RandomWalk class.
// ************************************************************
import java.util.Scanner;
public class TestWalk
{
	public static void main (String[] args)
	{
		int maxSteps; // maximum number of steps in a walk
		int maxCoord; // the maximum x and y coordinate
		int x, y; // starting x and y coordinates for a walk
		Scanner scan = new Scanner(System.in);

		RandomWalk walk1 = new RandomWalk(10,5,0,0);//step 3
		RandomWalk walk3 = new RandomWalk(200,10); //step 8

		System.out.println ("\nRandom Walk Test Program");
		System.out.println ();
		System.out.print ("Enter the boundary for the square: ");
		maxCoord = scan.nextInt();
		System.out.print ("Enter the maximum number of steps: ");
		maxSteps = scan.nextInt();
		System.out.print ("Enter the starting x and y coordinates with " +
				"a space between: ");
		x = scan.nextInt();
		y = scan.nextInt();

		RandomWalk walk2 = new RandomWalk(maxCoord,maxSteps,x,y); //step 3

		System.out.println ("\nWalk 1- " + walk1); //step 3
		System.out.println ("Walk 2- " + walk2); //step 3

		for (int i=0; i<5; i++) //step 5
		{
			walk1.takeStep();
			walk2.takeStep();
			System.out.println ("\nWalk 1- " + walk1);
			System.out.println ("Walk 2- " + walk2);

		}

		walk3.walk(); //step 8

		System.out.println("\nWalk 3- " + walk3);


	}
}