import java.util.Scanner;

class Rectangle {
    private float area;
    private float length;
    private float breadth;
    
    Rectangle(){        //Defining Constructor without arguments
        length = 0;
        System.out.println("\tLength : " +length);
        breadth = 0;
        System.out.println("\tBreadth : " +breadth);
    }
    
    Rectangle(float l, float b){    //Defining Constructor with arguments
        this.length = l;
        System.out.println("\tLength : " +length);
        this.breadth = b;
        System.out.println("\tBreadth : " +breadth);
    }
    
    public void area(float length, float breadth){  //Methods with arguments
        area = length*breadth;
        System.out.println("\tArea of a Rectangle with dimension "+length+" * " +breadth+" is "+area);
    }
    
    public void area(){     //Method without arguments
        area = length*breadth;
        System.out.println("\tArea of a "+length+" * " +breadth+" is "+area);
    }
}



public class Rect
{
	public static void main(String[] args) 
	{
	    System.out.println("\nExample for Constructor without arguments");
		Rectangle r1  = new Rectangle();     //Constructor without arguments
        r1.area();
        System.out.println();
        
        System.out.println("Example for Constructor with arguments");
        Rectangle r2  = new Rectangle(10,20);     //Constructor with arguments
        System.out.println();
        
        System.out.println("\nExample for method with user input");
	Scanner scan = new Scanner(System.in);
        Rectangle r3  = new Rectangle();
        float l,b;
        System.out.print("\tEnter Length : ");
        l = scan.nextFloat();
        System.out.print("\tEnter Breadth : ");
        b = scan.nextFloat();
        r3.area(l,b);
	}
}
