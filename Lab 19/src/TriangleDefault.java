import java.util.*;
import java.lang.*;
import java.text.*;
public class TriangleDefault {

	public static void main (String [] args)
{
	double a;
	double b;
	double c;
	double s;
	double area;
	DecimalFormat fmt = new DecimalFormat ("0.###");

	
	Scanner scnr = new Scanner(System.in);
	System.out.println("Enter the first side of the triangle: ");
	a = scnr.nextInt();
	
	System.out.println("Enter the second side of the triangle: ");
	b = scnr.nextInt();
	
	System.out.println("Enter the third side of the triangle: ");
	c = scnr.nextInt();	
	
	
	s = (a + b + c)/ 2;
	
	area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
	System.out.println("The area of the triangle is : " + fmt.format(area));
}
}
