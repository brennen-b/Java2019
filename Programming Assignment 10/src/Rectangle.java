import java.util.Arrays;
public class Rectangle implements RectangleInterface, Comparable<Rectangle> {

private double width, length, perimeter;
    
    public Rectangle (double width, double length){
        this.width = width;
        this.length = length;
        perimeter = length * width;
    }
    

public double getWidth (){ 
    return width;
}
public double getLength(){
    return length;
}    
public double getPerimeter(){
    return perimeter;
}
    
public int compareTo(Rectangle temp){
  Rectangle other = (Rectangle) temp;
    
    if (getPerimeter() > other.getPerimeter()){
        return 1;
    }
    else if (getPerimeter() < other.getPerimeter()){
        return -1;
    }
    else{
            return 0;
        }
    }
    
public String toString(){
    return "Perimeter is " + perimeter;
}
}

   






