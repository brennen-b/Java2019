import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		int smallest = 0;
		int secondSmallest = 0;
		int size = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of integers: ");
		size = scan.nextInt();

		int[] lists = new int[size];

		for (int i=0; i< lists.length; i++ )
		{
			System.out.println("Enter next number: ");
			lists[i] = scan.nextInt();

			if (i==0)
				smallest = lists[i];
			
			if(i==1 && lists[i] >= smallest)
				secondSmallest = lists[i];

			if (lists[i] < smallest)
			{
				int temp = smallest;
				smallest = lists[i];
				secondSmallest= temp;
			}
		

		}
		System.out.println("Smallest is: " + smallest);
		
		System.out.println("Second smallest is: " + secondSmallest);


	}
}
