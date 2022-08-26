
import java.util.*; 
public class LabProgram {
	
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;
      int length;
    
      
      highwayNumber = scnr.nextInt();
      String highwayString = Integer.toString(highwayNumber);
      
      length = String.valueOf(highwayNumber).length();
      
      if ((highwayNumber > 0) && (highwayNumber <1000)) {
    	  if (length == 3) {
    		  if (highwayString.charAt(2) == 0 || highwayString.charAt(2) == 2 || highwayString.charAt(2) == 4 || highwayString.charAt(2) == 6 || highwayString.charAt(2) == 8) {
    			  System.out.println("The " + highwayString + " is auxillary, serving the " + (highwayString.charAt(1) + highwayString.charAt(2)) + " going east/west.");
    		  }
    		  else 
    			  System.out.println("The " + highwayString + " is auxillary, serving the " + (highwayString.charAt(1) + highwayString.charAt(2)) + " going north/south.");
    	  }
    		  
    		  
    		  
    		  
    		  
    	  else if (length == 2) {
    		  if (highwayString.charAt(1) == 0 || highwayString.charAt(1) == 2 || highwayString.charAt(1) == 4 || highwayString.charAt(1) == 6 || highwayString.charAt(1) == 8){
    			  System.out.println("The " + highwayString + " is primary, going east/west.");
    		  }
    		  else
    			  System.out.println("The " + highwayString + " is primary, going north/south.");
    		  
    	  }
    		  
    		  
    		  
    		  
    	  else {
    		  if (highwayString.charAt(0) == 0 || highwayString.charAt(0) == 2 || highwayString.charAt(0) == 4 || highwayString.charAt(0) == 6 || highwayString.charAt(0) == 8){
    			  System.out.println("The " + highwayString + " is primary, going east/west.");
    		  }
    		  else
    			  System.out.println("The " + highwayString + " is primary, going north/south.");
    		  
    	  }
    	  
      }
      
      else 
    	  System.out.println(highwayNumber + " is not a valid interstate highway number.");
   }
}
