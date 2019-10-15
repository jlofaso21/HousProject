
/**
 * Represents a house
 *
 * @author (Justin Lofaso)
 * @version (9/12/2019)
 */
public class House
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class House
     */
    public House()
    {
        // Typically, the purpose of a constructor is to set the 
        // initial state of the object (give values to all of the fields)
        
        // for this example, though, we will just have the constructor 
        // draw a picture of this house
        
        // let's create an instance of the Square class
        Square frame = new Square();
        frame.makeVisible();
        frame.moveVertical(90);
        frame.moveHorizontal(25);
        frame.changeSize(120);
        
        // let's make a triangle shaped roof
        Triangle roof = new Triangle();
        roof.makeVisible();
        roof.moveVertical(100);
        roof.moveHorizontal(75);
        
        // create a moon
        Circle moon = new Circle();
        moon.makeVisible();
        moon.moveHorizontal(100);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
