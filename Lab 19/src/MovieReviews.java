
import java.util.Scanner;
public class MovieReviews {
	public static void main (String[] args){

		Scanner scan = new Scanner(System.in);
		int[][] movieArray = new int[10][5];
		int i=0;
		int total = 0;
		
		
		//assignment
		for (int row = 0; row<movieArray.length; row++)
		{
			for(int col=0;col<movieArray[row].length;col++)
				movieArray[row][col] = 2;
		}

		movieArray[1][4] = 3;
		movieArray[3][0] = 1;

		//printout
		System.out.println("\t\t\tRating of 10 movies");
		System.out.print("\t     ");
		for (int row = 0; row<movieArray[0].length; row++)
			System.out.print("movie" + (row+1) + "\t" );

		System.out.println();

		for (int row = 0; row<movieArray.length; row++)
		{

			if(row<10)
				System.out.print("reviewer" + (row +1 ) + ":" + " \t");
			else
				System.out.print("reviewer" + (row +1 ) + ":" + "\t");

			for(int col=0;col<movieArray[row].length;col++){
				total += movieArray[row][col]; 
				System.out.print(movieArray[row][col] + "\t");


				if (row>9)
					System.out.println();

			}
			System.out.println();

		}

		System.out.println("The total rating for all of the reviewers is: " + total);

	}

}

