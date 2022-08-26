import java.util.Arrays;
public class RectangleTester {

public static void main(String[] args){


Rectangle a = new Rectangle (10,10);
Rectangle b = new Rectangle (10,10);

System.out.println(a.compareTo(b));

    Rectangle[] rectangles = new Rectangle[5];
    
        rectangles[0] = new Rectangle(4,2);
        rectangles[1] = new Rectangle(2,2);
        rectangles[2] = new Rectangle(8,2);
        rectangles[3] = new Rectangle(10,2);
        rectangles[4] = new Rectangle(12,2);
    

    for (Rectangle p : rectangles){
        System.out.println(p.toString());
    }
    
   Arrays.sort(rectangles);
    
        for (Rectangle p : rectangles){
        System.out.println(p.toString());
    }
    
   // System.out.println(GenericMethods.linearSearch(rectangles[], 20));
    
    
    
}





}