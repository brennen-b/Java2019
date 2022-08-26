import java.util.*;
public class ShoppingCartPrinter {
	public static void main (String[] args) 
	{
		ItemToPurchase item1 = new ItemToPurchase();
		ItemToPurchase item2 = new ItemToPurchase();
		
		Scanner scnr = new Scanner(System.in);

		System.out.println("Item 1\n" + "Enter the item name:");
		item1.setName(scnr.nextLine());
		

		System.out.println("Enter the item price:");
		item1.setPrice(scnr.nextInt());
		
		
		System.out.println("Enter the item quantity:");
		item1.setQuantity(scnr.nextInt());
		item1.calcTotal();
	
		
		System.out.println("\nItem 2\n" + "Enter the item name:");
		scnr.nextLine();
		item2.setName(scnr.nextLine());
		
		System.out.println("Enter the item price:");
		item2.setPrice(scnr.nextInt());
		
		
		System.out.println("Enter the item quantity:");
		item2.setQuantity(scnr.nextInt());
		item2.calcTotal();
		System.out.println();
		
		System.out.println("TOTAL COST");
		System.out.println(item1.toString());
		System.out.println(item2.toString());
		
		System.out.println("\nTotal: $" + (item1.getTotal() + item2.getTotal()));
		

		
	}

}
