
public class Test {
public static void main (String[] args){
	if (args.length != 0){
		
	
		System.out.println(args.length);
	
	for(String s:args)
		System.out.println(s);
	
	}
	else
		System.out.println("No command-line arguments.");
	
	
}
}
