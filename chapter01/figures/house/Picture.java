package house;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Klling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person walker;
    private Square lawn;
    private boolean drawn;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        walker = new Person();
        lawn = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            lawn.changeColor("green");
            lawn.changeSize(525);
            lawn.moveHorizontal(-325);
            lawn.moveVertical(140);
            lawn.makeVisible();
            drawn = true;
            
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
    
    /**
     * Set this picture in motion; sunset 
     */
    public void sunset()
    {
        sun.slowMoveVertical(300);
        walker.moveHorizontal(300);
        walker.moveVertical(28);
        walker.makeVisible();
        walker.slowMoveHorizontal(-310);
        //wall and windows inputs are to make it overlap the walker
        wall.makeVisible();
        window.makeVisible();
    }
    /**
     * sunrise code
     */
    public void sunrise()
    {
        sun.moveHorizontal(-275);
        sun.slowMoveVertical(-300);
    }
    
    public void dayToNight()
    {
        sun.moveHorizontal(275);
    }
    
}
