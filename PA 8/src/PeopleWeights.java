import java.util.Scanner;
import java.text.*;

public class PeopleWeights {
	public static void main(String[] args) {
		double[] peopleWeights = new double[5];
		Scanner scan = new Scanner(System.in);
		double totalWeight=0;
		double averageWeight=0;
		double maxWeight=0;
		DecimalFormat decimal = new DecimalFormat("0.##");

		for (int i = 0; i<5; i++)
		{
			System.out.println("Enter weight " + (i+1) + ":");
			peopleWeights[i] = scan.nextDouble();
			totalWeight += peopleWeights[i];

			if (peopleWeights[i] > maxWeight) {
				maxWeight = peopleWeights[i];
			}

		}

		System.out.print("You entered: ");

		for (int i = 0; i<5; i++)
		{
			System.out.print(peopleWeights[i] + " ");

		}
		averageWeight = totalWeight / 5;

		System.out.println("\n\nTotal weight: " + totalWeight);
		System.out.println("Average weight: " + decimal.format(averageWeight));
		System.out.println("Max weight: " + maxWeight);

	}
}