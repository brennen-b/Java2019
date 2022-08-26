import java.util.Scanner;

public class TextMsgExpander {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput;



		do {

			System.out.println("Enter text (enter quit to quit):");
			userInput = scnr.nextLine();

			while (!userInput.contentEquals("quit"))
			{
				System.out.println("You entered: " + userInput);
				System.out.println();

				if (userInput.contains("BFF"))
				{
					userInput = userInput.replace("BFF", "best friend forever");
					System.out.println("Replaced \"BFF\" with \"best friend forever\".");
				}

				if(userInput.contains("IDK"))
				{
					userInput = userInput.replace("IDK", "I don't know");
					System.out.println("Replaced \"IDK\" with \"I don't know\".");
				}

				if(userInput.contains("JK"))
				{
					userInput = userInput.replace("JK", "just kidding");
					System.out.println("Replaced \"JK\" with \"just kidding\".");
				}

				if(userInput.contains("TMI"))
				{
					userInput = userInput.replace("TMI", "too much information");
					System.out.println("Replaced \"TMI\" with \"too much information\".");
				}

				if(userInput.contains("TTYL"))
				{
					userInput = userInput.replace("TTYL", "talk to you later");
					System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
				}

				System.out.println("\nExpanded: " + userInput);
				System.out.println();
				System.out.println();
				break;
			}
		}

		while (!userInput.contentEquals("quit"));
		

		System.out.println("This is the end of the program.");

	}
}
