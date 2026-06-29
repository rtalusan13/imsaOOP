import java.awt.Color;
import java.awt.Font;
/**
 * This is a heater that shows temperature and can be used.
 *
 * @author (Raphael Talusan)
 * @version (9/15/2023)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private Canvas Heater;
    private int setTemp = 70;
    private int redYposition;
    private int redLength;
    Font bigFont = new Font("Times New Roman", Font.BOLD, 30);
    Font errorFont = new Font("Times New Roman", Font.BOLD, 12);
    String setTempString;
    public Heater()
    {
       Heater  = new Canvas("My Heater", 600, 600);
    /**}
    public void draw(){*/
        setTemp = 70;
        Heater.setForegroundColor(Color.GRAY);
        Heater.fillRectangle(50,100,475,285);
        Heater.fillRectangle(430,50,123,400);
        Heater.setForegroundColor(Color.GREEN);
        Heater.fillRectangle(100,150,310,185);
        Heater.setForegroundColor(Color.WHITE);
        Heater.fillRectangle(470,75,45,330);
        Heater.fillCircle(454,360,76);
        Heater.setForegroundColor(Color.RED);
        //Heater.fillRectangle(480,85,26,290);
        //full rectangle size
        Heater.fillCircle(465,370,55);
        Heater.setForegroundColor(Color.BLACK);
        Heater.setFont(bigFont);
        Heater.drawString("Temperature Gauge",130, 190);
        Heater.drawString("70",223,240);
        Heater.drawString("F", 280,240);
        Heater.drawString("o", 265,230);
        Heater.fillRectangle(150,260,100,55);
        Heater.fillRectangle(270,260,100,55);
        Heater.setForegroundColor(Color.WHITE);
        Heater.drawString("UP",180,300);
        Heater.drawString("DOWN",273,300);
        Heater.setForegroundColor(Color.RED);
        Heater.fillRectangle(480,165,26,210);
    }
    public void cool(){
        setTemp = setTemp - 10;
        redYposition = 375 - (setTemp*3);
        redLength = 375 - redYposition;
        Heater.setForegroundColor(Color.WHITE);
        Heater.fillRectangle(470,75,45,300);
        if(setTemp >= 0){
            Heater.setForegroundColor(Color.GREEN);
            Heater.fillRectangle(215,220,51,35);
            Heater.fillRectangle(150,195,200,15);
            Heater.setForegroundColor(Color.BLACK);
            Heater.setFont(bigFont);
            Heater.drawString("Temperature Gauge",130, 190);
            setTempString = Integer.toString(setTemp);
            Heater.drawString(setTempString,223,240);
        }
        if(setTemp < 0){
            Heater.setForegroundColor(Color.BLACK);
            Heater.setFont(errorFont);
            Heater.drawString("TOO COLD! CANNOT GO DOWN",160,205);
            Heater.setFont(bigFont);
            Heater.drawString("Temperature Gauge",130, 190);
            Heater.drawString("0",223,240);
            setTemp = 0;
        }
        //draw white rectangle to reset, cover with red rectangle for temp
        Heater.setForegroundColor(Color.RED);
        Heater.fillRectangle(480,redYposition,26,redLength);
        //Heater.fillRectangle(480,85,26,290);
        //full rectangle size
        Heater.setForegroundColor(Color.WHITE);
        Heater.fillRectangle(480,0,26,50);
        Heater.setForegroundColor(Color.GRAY);
        Heater.fillRectangle(480,50,26,25);
    }
    public void warm(){
        setTemp = setTemp + 10;
        redYposition = 375 - (setTemp*3);
        redLength = 375 - redYposition;
        if(setTemp <= 100){
            Heater.setForegroundColor(Color.GREEN);
            Heater.fillRectangle(215,220,51,35);
            Heater.fillRectangle(150,195,200,15);
            Heater.setForegroundColor(Color.BLACK);
            Heater.setFont(bigFont);
            Heater.drawString("Temperature Gauge",130, 190);
            setTempString = Integer.toString(setTemp);
            Heater.drawString(setTempString,223,240);
        }
        if(setTemp > 100){
            Heater.setForegroundColor(Color.BLACK);
            Heater.setFont(errorFont);
            Heater.drawString("TOO HOT! CANNOT GO UP.",175,205);
            Heater.setFont(bigFont);
            Heater.drawString("Temperature Gauge",130, 190);
            Heater.drawString("100",223,240);
            setTemp = 100;
        }
        Heater.setForegroundColor(Color.RED);
        Heater.fillRectangle(480,redYposition,26,redLength);
        Heater.setForegroundColor(Color.WHITE);
        Heater.fillRectangle(480,0,26,50);
        Heater.setForegroundColor(Color.GRAY);
        Heater.fillRectangle(480,50,26,25);
}
}
