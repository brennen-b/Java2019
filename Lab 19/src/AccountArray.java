import java.util.*;
public class AccountArray {
	public static void main (String[] args){
		int max = 0;
		double total = 0;
		int initBal;
		
		Account[] accounts = new Account[] {
							 new Account(100, "Steve", 1),
				             new Account(200, "John", 2),
				             new Account(300, "Bill", 3),
				             new Account(400, "Kurt", 4),
				             new Account(500, "Mark", 5)};
		for (int i=0; i<accounts.length; i++ ) {
			total = accounts[i](initBal);
		}

	}
}

