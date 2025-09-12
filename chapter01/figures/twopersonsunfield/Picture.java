package twopersonsunfield;


/**
 * Write a description of class Picture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Picture
{
    // instance variables - replace the example below with your own
    private Circle land;
    private Person tall;
    private Person small;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // initialise instance variables
        small = new Person();
        tall = new Person();
        land = new Circle();  
        sun = new Circle();
        drawn = false;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void draw()
    {
        if(!drawn) {
            land.changeColor("green");
            land.moveVertical(140);
            land.moveHorizontal(-600);
            land.changeSize(1250);
            land.makeVisible();
            
            small.changeColor("black");
            small.moveHorizontal(-20);
            small.moveVertical(13);
            small.changeSize(40,20);
            small.makeVisible();
    
            tall.moveHorizontal(-50);
            tall.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(55);
            sun.changeSize(35);
            sun.makeVisible();
            drawn = true;
            
        }
    }
}
