import java.awt.Color;
import java.awt.Font;
/**
 * This class uses Canvas.
 *
 * @author (Raphael Talusan)
 * @version (9/14/23)
 */
public class Draw
{
    private Canvas myCanvas;
    private int setTemp = 70;
    /**
     * Constructor for objects of class Draw
     */
    public Draw()
    {
        myCanvas = new Canvas("Temperature Gauge", 500, 500);
        myCanvas.setVisible(true);
        myCanvas.setForegroundColor(Color.GREEN);
        myCanvas.fillRectangle(100,150,300,200);
        myCanvas.setForegroundColor(Color.RED);
        myCanvas.fillCircle(300,300,50);
        myCanvas.setForegroundColor(Color.BLUE);
        Font smallFont = new Font("Comic Sans", Font.PLAIN, 20);
        myCanvas.setFont(smallFont);
        myCanvas.drawString("I am a student at IMSA",200,295);
    }
    private void cool(){
        setTemp = setTemp - 10;
        if (setTemp > 0){
            
        }
    }
    private void heat(){
        
    }
}
