
public class ItemToPurchase {
	private String itemName;
	private int itemPrice;
	private int itemQuantity;
	private int itemTotal;
	
	public ItemToPurchase(){
		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;
		itemTotal = 0;
	}

	public void setName(String newName) 
	{
		itemName = newName;
	}
	
	public String getName() 
	{
		return itemName;
	}	
	
	public void setPrice(int newPrice) 
	{
		itemPrice = newPrice;
	}
	
	public int getPrice() 
	{
		return itemPrice;
	}
	
	public void setQuantity(int newQuantity) 
	{
		itemQuantity = newQuantity;
	}	
	
	public int getQuantity() 
	{
		return itemQuantity;
	}
	
	public int calcTotal() {
		itemTotal = itemPrice * itemQuantity;
		return itemTotal;
	}
	public int getTotal() {
		return itemTotal;
	}
	public String toString() {
		
		return itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + itemTotal;
	}
}
