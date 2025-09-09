package animation;

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
    private Rect floor;
    private Rect outlinetop;
    private Rect outlinemid;
    private Rect outlinemid1;
    private Rect outlinelong;
    private Rect freethrow;
    private Rect backboard;
    private Rect backboardline;
    private Rect pole;
    private Circle ball1;
    private Circle hoop;
    private Person shooter;
    private Person defense;
    private boolean drawn;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        floor = new Rect();
        outlinetop = new Rect();
        outlinemid = new Rect();
        outlinemid1 = new Rect();
        outlinelong = new Rect();
        freethrow = new Rect();
        backboard = new Rect();
        backboardline = new Rect();
        pole = new Rect();
        hoop = new Circle();  
        ball1 = new Circle();
        shooter = new Person();
        defense = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            floor.moveHorizontal(-350);
            floor.moveVertical(110);
            floor.changeSize1(600);
            floor.changeSize2(120);
            floor.changeColor("darktan");
            floor.makeVisible();
            
            shooter.changeSize(85,39);
            shooter.moveHorizontal(-185);
            shooter.moveVertical(-19);
            shooter.makeVisible();
    
            ball1.changeSize(25);
            ball1.moveHorizontal(-123);
            ball1.moveVertical(95);
            ball1.changeColor("orange");
            ball1.makeVisible();
    
            defense.moveHorizontal(-100);
            defense.moveVertical(-12);
            defense.changeSize(75,45);
            defense.changeColor("red");
            defense.makeVisible();
            
            pole.changeColor("black");
            pole.changeSize1(12);
            pole.changeSize2(160);
            pole.moveHorizontal(130);
            pole.moveVertical(-50);
            pole.makeVisible();
            
            backboard.changeColor("black");
            backboard.changeSize1(105);
            backboard.changeSize2(62);
            backboard.moveHorizontal(82);
            backboard.moveVertical(-112);
            backboard.makeVisible();
            
            backboardline.changeColor("red");
            backboardline.changeSize1(40);
            backboardline.changeSize2(10);
            backboardline.moveHorizontal(116);
            backboardline.moveVertical(-73);
            backboardline.makeVisible();
            
            outlinetop.changeColor("blue");
            outlinetop.changeSize1(12);
            outlinetop.changeSize2(28);
            outlinetop.moveHorizontal(-180);
            outlinetop.moveVertical(110);
            outlinetop.makeVisible();
            
            outlinemid.changeColor("blue");
            outlinemid.changeSize1(12);
            outlinemid.changeSize2(12);
            outlinemid.moveHorizontal(-168);
            outlinemid.moveVertical(138);
            outlinemid.makeVisible();
            
            outlinemid1.changeColor("blue");
            outlinemid1.changeSize1(12);
            outlinemid1.changeSize2(12);
            outlinemid1.moveHorizontal(-156);
            outlinemid1.moveVertical(150);
            outlinemid1.makeVisible();
            
            outlinelong.changeColor("blue");
            outlinelong.changeSize1(335);
            outlinelong.changeSize2(12);
            outlinelong.moveHorizontal(-144);
            outlinelong.moveVertical(162);
            outlinelong.makeVisible();
            
            freethrow.changeColor("blue");
            freethrow.changeSize1(12);
            freethrow.changeSize2(52);
            freethrow.moveHorizontal(-90);
            freethrow.moveVertical(110);
            freethrow.makeVisible();
            drawn = true;
            
        }
    }
    public void dribble()
    {
        ball1.slowMoveVertical(25);
        ball1.slowMoveVertical(-25);
        ball1.slowMoveVertical(25);
        ball1.slowMoveVertical(-25);
    }
    public void jumpshot()
    {
        //ball wind up animations starts here
        ball1.slowMoveVertical(-22);
        ball1.slowMoveHorizontal(-3);
        ball1.slowMoveVertical(-3);
        ball1.slowMoveHorizontal(-3);
        ball1.slowMoveVertical(-3);
        ball1.slowMoveHorizontal(-3);
        ball1.slowMoveVertical(-3);
        ball1.slowMoveHorizontal(-3);
        ball1.slowMoveVertical(-3);
        ball1.slowMoveHorizontal(-3);
        ball1.slowMoveVertical(-3);
        
        //jump animation starts here
        shooter.slowMoveVertical(-3);
        ball1.slowMoveVertical(-3);
        shooter.slowMoveVertical(-3);
        ball1.slowMoveVertical(-3);
        shooter.slowMoveVertical(-3);
        ball1.slowMoveVertical(-3);
        shooter.slowMoveVertical(-3);
        ball1.slowMoveVertical(-3);
        shooter.slowMoveVertical(-3);
        ball1.slowMoveVertical(-3);
        shooter.slowMoveVertical(-3);
        ball1.slowMoveVertical(-3);
        shooter.slowMoveVertical(-3);
        ball1.slowMoveVertical(-3);
        shooter.slowMoveVertical(-3);
        ball1.slowMoveVertical(-3);
        shooter.slowMoveVertical(-3);
        ball1.slowMoveVertical(-3);
        
        //starting of the animation where ball is released
        defense.moveVertical(-3);
        ball1.slowMoveVertical(-2); 
        ball1.moveVertical(-3);
        shooter.slowMoveVertical(2); 
        shooter.moveVertical(3);  //guideline per copy paste
        defense.slowMoveHorizontal(-1);
        ball1.slowMoveHorizontal(4);
        defense.moveVertical(-3);
        ball1.slowMoveVertical(-2); 
        ball1.moveVertical(-3);
        shooter.slowMoveVertical(2); 
        shooter.moveVertical(3);
        defense.slowMoveHorizontal(-1);
        ball1.slowMoveHorizontal(4);
        defense.moveVertical(-3);
        ball1.slowMoveVertical(-2);
        ball1.moveVertical(-3);
        shooter.slowMoveVertical(2); 
        shooter.moveVertical(3);
        defense.slowMoveHorizontal(-1);
        ball1.slowMoveHorizontal(4);
        defense.moveVertical(-3);
        ball1.slowMoveVertical(-2); 
        ball1.moveVertical(-3);
        shooter.slowMoveVertical(2); 
        shooter.moveVertical(3);
        defense.slowMoveHorizontal(-1);
        ball1.slowMoveHorizontal(4);
        defense.moveVertical(-3);
        ball1.slowMoveVertical(-2); 
        ball1.moveVertical(-3);
        shooter.slowMoveVertical(3); 
        defense.slowMoveHorizontal(-1);
        ball1.slowMoveHorizontal(4);
        defense.moveVertical(-3);
        ball1.slowMoveVertical(-2); 
        ball1.moveVertical(-3);
        shooter.slowMoveVertical(2); 
        shooter.moveVertical(3);  //this is when the shooter stops moving
        defense.slowMoveHorizontal(-1);
        ball1.slowMoveHorizontal(4);
        defense.moveVertical(-3);
        ball1.slowMoveVertical(-2); 
        ball1.moveVertical(-3);  
        defense.slowMoveHorizontal(-1); //animation becomes smoother
        ball1.slowMoveHorizontal(4);    //because of less moving objects
        defense.moveVertical(-3);
        ball1.slowMoveVertical(-2); 
        ball1.moveVertical(-3); 
        defense.slowMoveHorizontal(-1); 
        ball1.slowMoveHorizontal(4);
        //now the defender begins to fall, ball still traveling upward
        ball1.slowMoveVertical(-7);
        defense.slowMoveVertical(3);
        ball1.slowMoveHorizontal(5);
        defense.slowMoveHorizontal(-1);
        defense.moveVertical(2);
        ball1.slowMoveVertical(-7);
        defense.slowMoveVertical(3);
        ball1.slowMoveHorizontal(5);
        defense.slowMoveHorizontal(-1);
        defense.moveVertical(2);
        ball1.slowMoveVertical(-7);
        defense.slowMoveVertical(3);
        ball1.slowMoveHorizontal(5);
        defense.slowMoveHorizontal(-1);
        defense.moveVertical(2);
        ball1.slowMoveVertical(-7);
        defense.slowMoveVertical(3);
        ball1.slowMoveHorizontal(5);
        defense.slowMoveHorizontal(-1);
        ball1.slowMoveVertical(-7);
        defense.slowMoveVertical(3);
        ball1.slowMoveHorizontal(5);
        defense.slowMoveHorizontal(-1);
        defense.moveVertical(1);
        ball1.slowMoveVertical(-7);
        defense.slowMoveVertical(3);
        ball1.slowMoveHorizontal(5);
        defense.slowMoveHorizontal(-1);
        //defense will stop moving; it has reached the ground
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(-2);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(-2);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(-2);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(-2);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(-2);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(-2);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(-2);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(-2);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(-2);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(-2);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(-2);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(-2);
        ball1.slowMoveHorizontal(3);
        //ball's arc is flattening out
        ball1.moveVertical(-2);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(2);
        ball1.moveVertical(-1);
        ball1.moveHorizontal(3);
        ball1.moveVertical(-1);
        ball1.slowMoveHorizontal(8);
        ball1.moveVertical(-4);
        ball1.slowMoveHorizontal(8);
        ball1.moveVertical(-3);
        ball1.slowMoveHorizontal(8);
        ball1.moveVertical(-2);
        ball1.slowMoveHorizontal(8);
        ball1.moveVertical(-1);
        ball1.slowMoveHorizontal(9);
        ball1.moveVertical(-1);
        ball1.slowMoveHorizontal(9);
        ball1.slowMoveHorizontal(11);
        ball1.moveVertical(-1);
        ball1.slowMoveHorizontal(15);
        ball1.moveVertical(-1);
        ball1.slowMoveHorizontal(11);
        ball1.moveVertical(-1);
        ball1.slowMoveHorizontal(8);
        ball1.moveVertical(-1);
        ball1.slowMoveHorizontal(10);
        ball1.moveVertical(1);
        ball1.slowMoveHorizontal(8);
        ball1.moveVertical(1);
        ball1.slowMoveHorizontal(8);
        ball1.moveVertical(3);
        ball1.slowMoveHorizontal(7);
        ball1.moveVertical(3);
        ball1.slowMoveHorizontal(7);
        ball1.moveVertical(3);
        ball1.slowMoveHorizontal(6);
        ball1.moveVertical(3);
        ball1.slowMoveHorizontal(6);
        ball1.moveVertical(2);
        ball1.slowMoveHorizontal(7);
        ball1.moveVertical(3);
        ball1.slowMoveHorizontal(6);
        ball1.moveVertical(4);
        ball1.slowMoveHorizontal(7);
        ball1.moveVertical(4);
        ball1.slowMoveHorizontal(7);
        ball1.moveVertical(3);
        ball1.slowMoveHorizontal(7);
        ball1.moveVertical(3);
        ball1.slowMoveHorizontal(7);
        ball1.moveVertical(3);
        ball1.slowMoveHorizontal(7);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(1);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(1);
        ball1.slowMoveHorizontal(3);
        ball1.moveVertical(1);
        //ball enters the rim and begins to rotate around the rim
        backboardline.makeVisible();
        ball1.slowMoveHorizontal(3);
        backboardline.makeVisible();
        ball1.moveVertical(3);
        backboardline.makeVisible();
        ball1.slowMoveHorizontal(2);
        backboardline.makeVisible();
        ball1.slowMoveVertical(1);
        backboardline.makeVisible();
        ball1.slowMoveVertical(1);
        backboardline.makeVisible();
        ball1.slowMoveVertical(1);
        backboardline.makeVisible();
        ball1.slowMoveVertical(1);
        backboardline.makeVisible();
        ball1.slowMoveVertical(1);
        backboardline.makeVisible();
        ball1.slowMoveHorizontal(-3);
        backboardline.makeVisible();
        ball1.slowMoveVertical(3);
        backboardline.makeVisible();
        ball1.slowMoveHorizontal(-5);
        backboardline.makeVisible();
        ball1.slowMoveHorizontal(6);
        backboardline.makeVisible();
        ball1.slowMoveHorizontal(-1);
        backboardline.makeVisible();
        ball1.moveVertical(3);
        backboardline.makeVisible();
        ball1.moveHorizontal(1);
        backboardline.makeVisible();
        ball1.slowMoveVertical(5);
        backboardline.makeVisible();
        ball1.slowMoveVertical(170);
        ball1.slowMoveVertical(-14);
        ball1.slowMoveVertical(14);
        ball1.slowMoveVertical(-5);
        ball1.slowMoveVertical(5);
    }
   
    
}
