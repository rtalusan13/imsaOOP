import java.util.*;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

/**
 * Two cars race at random speeds.
 *
 * @author (Raphael Talusan)
 * @version (9/26/23)
 */
public class Race
{
    // instance variables - replace the example below with your own
    private Canvas RT;
    int x1 = 50;
    int x2 = 50;
    int car1Wins;
    int car2Wins;
    int totalRaces;
    String car1String;
    String car2String;
    String totalString;
    Font bigFont = new Font("Times New Roman", Font.BOLD, 40);
    Font finalFont = new Font("Times New Roman", Font.BOLD, 25);
    private boolean raceStatus;
    private boolean raceStatusx1;
    private boolean raceStatusx2;
    /**
     * Constructor for objects of class Objects_Race
     */
    public Race()
    {
        //Rect(xPosition,yPosition,width,height);
        //Circle(xPosition,yPosition,radius);
        JFrame frame = new JFrame("Input Dialog Example #1");
        String s = JOptionPane.showInputDialog(frame,"How many races?");
        int i = Integer.parseInt(s);
        RT = new Canvas("Object Race", 500, 400);
        RT.setForegroundColor(Color.YELLOW);
        RT.fillRectangle(0,0,500,500);
        RT.setForegroundColor(Color.BLACK);
        RT.fillRectangle(450,0,20,500);
        RT.setForegroundColor(Color.BLUE);
        RT.fillRectangle(x1,100,50,25);
        RT.setForegroundColor(Color.BLACK);
        RT.fillCircle(x1-5,120,17);
        RT.fillCircle(x1+38,120,17);
        RT.setForegroundColor(Color.RED);
        RT.fillRectangle(x2,225,50,25);
        RT.setForegroundColor(Color.BLACK);
        RT.fillCircle(x2-5,245,17);
        RT.fillCircle(x2+38,245,17);
        //beginning of the multiple races
        int car1Wins = 0;
        int car2Wins = 0;
        int totalRaces = 0;
        //System.out.println("User input is --> "+i);
        //start of public void MultipleRaces(){}
        //a previous method
        for (i = i; i > 0; i--){
            int x1 = 50;
            int x2 = 50;
            raceStatus = true;
            Random random = new Random();
        //start of public void IndependentRace(){}
        //a previous method
        while(raceStatus){
            RT.setForegroundColor(Color.YELLOW);
            RT.fillRectangle(0,0,500,400);
            RT.setForegroundColor(Color.BLACK);
            RT.fillRectangle(450,0,20,400);
            x1 = random.nextInt(10)+1+x1;
            x2 = random.nextInt(10)+1+x2;
            //x1 and x2 are providing different numbers
            //System.out.println("x1 = "+x1+", x2 = "+x2);
            RT.setForegroundColor(Color.BLUE);
            RT.fillRectangle(x1,100,50,25);
            RT.setForegroundColor(Color.BLACK);
            RT.fillCircle(x1-5,120,17);
            RT.fillCircle(x1+38,120,17);
            RT.setForegroundColor(Color.RED);
            RT.fillRectangle(x2,225,50,25);
            RT.setForegroundColor(Color.BLACK);
            RT.fillCircle(x2-5,245,17);
            RT.fillCircle(x2+38,245,17);
            if(x1 > 220){
                raceStatus = false;
                raceStatusx1 = true;
                if(x2 > x1){
                raceStatusx1 = false;
                raceStatusx2 = true;
                }
            }
            if(x2 > 220){
                raceStatus = false;
                raceStatusx2 = true;
                if(x1 > x2){
                raceStatusx2 = false;
                raceStatusx1 = true;
                }
            }
            try
            {
                TimeUnit.MILLISECONDS.sleep(45);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        while(raceStatusx1){
            RT.setForegroundColor(Color.YELLOW);
            RT.fillRectangle(0,0,500,400);
            RT.setForegroundColor(Color.BLACK);
            RT.fillRectangle(450,0,20,400);
            x1 = random.nextInt(10)+1+x1;
            //System.out.println("x1 = "+x1);
            RT.setForegroundColor(Color.BLUE);
            RT.fillRectangle(x1,100,50,25);
            RT.setForegroundColor(Color.BLACK);
            RT.fillCircle(x1-4,120,17);
            RT.fillCircle(x1+38,120,17);
            RT.setForegroundColor(Color.RED);
            RT.fillRectangle(x2,225,50,25);
            RT.setForegroundColor(Color.BLACK);
            RT.fillCircle(x2-5,245,17);
            RT.fillCircle(x2+38,245,17);
            if(x1 > 420){
                raceStatusx1 = false;
                raceStatusx2 = false;
                RT.setForegroundColor(Color.BLUE);
                RT.setFont(bigFont);
                RT.drawString("Car 1 has won!",190,190);
                car1Wins = car1Wins + 1;
                break;
            }
            try
            {
                TimeUnit.MILLISECONDS.sleep(40);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        while(raceStatusx2){
            RT.setForegroundColor(Color.YELLOW);
            RT.fillRectangle(0,0,500,400);
            RT.setForegroundColor(Color.BLACK);
            RT.fillRectangle(450,0,20,400);
            x2 = random.nextInt(10)+1+x2;
            //System.out.println("x2 = "+x2);
            RT.setForegroundColor(Color.BLUE);
            RT.fillRectangle(x1,100,50,25);
            RT.setForegroundColor(Color.BLACK);
            RT.fillCircle(x1-4,120,17);
            RT.fillCircle(x1+38,120,17);
            RT.setForegroundColor(Color.RED);
            RT.fillRectangle(x2,225,50,25);
            RT.setForegroundColor(Color.BLACK);
            RT.fillCircle(x2-5,245,17);
            RT.fillCircle(x2+38,245,17);
            if(x2 > 420){
                raceStatusx1 = false;
                raceStatusx2 = false;
                RT.setForegroundColor(Color.BLUE);
                RT.setFont(bigFont);
                RT.drawString("Car 2 has won!",190,190);
                car2Wins = car2Wins + 1;
                break;
            }
            try
            {
                TimeUnit.MILLISECONDS.sleep(40);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        //end of IndividualRace(){}
        try
        {
            TimeUnit.MILLISECONDS.sleep(1250);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
        totalRaces = totalRaces + 1;
        }
        RT.setForegroundColor(Color.YELLOW);
        RT.fillRectangle(0,0,500,500);
        RT.setForegroundColor(Color.BLACK);
        RT.fillRectangle(450,0,20,500);
        RT.setFont(finalFont);
        RT.drawString("Total Races:",160,150);
        RT.drawString("Car 1 Wins:",160,180);
        RT.drawString("Car 2 Wins:",160,210);
        car1String = Integer.toString(car1Wins);
        car2String = Integer.toString(car2Wins);
        totalString = Integer.toString(totalRaces);
        RT.drawString(totalString,290,150);
        RT.drawString(car1String,290,180);
        RT.drawString(car2String,290,210);
    }
}
