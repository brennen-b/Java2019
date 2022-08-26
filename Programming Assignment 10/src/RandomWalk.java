import java.math.*;
public class RandomWalk {

	private int xCoord; //step 1
	private int yCoord;
	private int maxSteps;
	private int numSteps;
	private int boundary;

	public RandomWalk(int max, int edge) //step 2
	{
		xCoord = 0;
		yCoord = 0;
		maxSteps = max;
		numSteps=0;
		boundary = edge;
	}

	public RandomWalk(int max, int edge, int startX, int startY) //step 2
	{
		xCoord = startX;
		yCoord = startY;
		maxSteps = max;
		numSteps=0;
		boundary = edge;

	}
	public void walk() //step 7
	{
		while (moreSteps())
		{
			if (inBounds())
			{
				takeStep();
			}
			else
				break;
		}
	}

	public void takeStep() //step 4
	{
		int random = (int)(Math.random() * 4);

		switch(random) {
		case 0: xCoord++;
		break;
		case 1: yCoord--;
		break;
		case 2: xCoord--;
		break;
		case 3: yCoord++;
		break;
		}
		numSteps++;
	}

	private  boolean moreSteps() //step 6
	{
		if (numSteps < maxSteps)
			return true;
		else
			return false;
	}

	private boolean inBounds() //step 6
	{
		if((xCoord < boundary) && (yCoord < boundary) && (xCoord > -boundary) && (yCoord > -boundary))
			return true;
		else
			return false;
	}

	public String toString() //step 2
	{
		return "Steps: " + numSteps + " Position: (" + xCoord + ", " + yCoord + ")"; 
	}
}
