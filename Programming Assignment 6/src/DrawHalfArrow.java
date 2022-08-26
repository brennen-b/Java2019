import java.util.Scanner; 

public class DrawHalfArrow {
	public static void main(String[] args) {

		int arrowBaseHeight;
		int arrowBaseWidth;
		int arrowHeadWidth;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter arrow base height:");
		arrowBaseHeight = scan.nextInt();

		System.out.println("Enter arrow base width:");
		arrowBaseWidth = scan.nextInt();

		System.out.println("Enter arrow head width:");
		arrowHeadWidth = scan.nextInt();

		while (arrowHeadWidth <= arrowBaseWidth)
		{
			System.out.println("Please enter an arrow head width that is larger than the base width:");
			arrowHeadWidth = scan.nextInt();
		}

		System.out.println();
		for (int h = 0; h < arrowBaseHeight; h++)
		{
			for (int w=0; w<arrowBaseWidth; w++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int row = arrowHeadWidth; row > 0; row--)
		{
			for (int star = 1; star <= row; star++)
				System.out.print ("*");

			System.out.println();

		}
	}
}