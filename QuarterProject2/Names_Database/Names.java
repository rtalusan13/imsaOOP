import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.ArrayList;
import java.util.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 * Write a description of class NameRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Names extends JFrame
{
    SimpleCanvas RT;
    public void popularNames()throws FileNotFoundException{ //names getting more popular
        System.out.println("");
        System.out.println("1: Increasingly Popular Names");
        NamesRecord bs = new NamesRecord();
        bs.record1();
    }
    public void singleName(String s)  throws FileNotFoundException{ //one name, rank among all decades
        System.out.println("");
        System.out.println("Chosen name: "+s);
        NamesRecord bs = new NamesRecord();
        bs.record2(s);
    }
    public void singleDecade()  throws FileNotFoundException{ //one decade, all ranked names
        System.out.println("");
        System.out.println("3: Names only in one decade");
        NamesRecord bs = new NamesRecord();
        bs.record3();
    }
    public void allNamesDecades() throws FileNotFoundException{
        NamesRecord bs = new NamesRecord();
        bs.record4();
    }
    public void singleRank(int s) throws FileNotFoundException{
        System.out.println("");
        System.out.println("Names with a rank "+s+":");
        NamesRecord bs = new NamesRecord();
        bs.record5(s);
    }
    public void drawing(String s) throws FileNotFoundException{
        Font bigFont = new Font("Arial", Font.BOLD, 25);
        Font textFont = new Font("Arial", Font.BOLD, 12);
        RT = new SimpleCanvas("6: A graph for a name", 710, 560);
        RT.setForegroundColor(Color.RED);
        RT.setFont(bigFont);
        RT.drawString("Here is the name '"+s+"' through the decades:",80,27);
        RT.setFont(textFont);
        
        /**
         * These following loops and lines are for the structure of the graph
         */
        RT.fillRectangle(0,30,710,3);
        RT.fillRectangle(0,532,710,3);
        for(int i=0;i<11;i++){ //graph vertical line loop
            int xTemp = (i*60)+50;
            RT.fillRectangle(xTemp,33,3,499);
        }
        for(int i=0;i<11;i++){ //axis labels
            RT.drawString(Integer.toString(i*100),22,(i*50)+30);
            RT.drawString(Integer.toString(1900+(i*10)),(i*60)+38,547);
        }
        
        File text = new File("names.txt");
        Scanner scanner = new Scanner(text);
        while(scanner.hasNextLine()){
            String t =" "+scanner.next()+" ";
            if (t.contains(" "+s+" ")){
                ArrayList<Integer> a = new ArrayList<>();
                for(int i = 0; i < 11; i++){
                    a.add(scanner.nextInt());
                }
                /**System.out.print(s);
                for(int i = 0; i < a.size(); i ++){
                    System.out.print(" "+a.get(i));
                } //terminal redundancy
                System.out.println("");*/
                RT.setForegroundColor(Color.BLACK);
                RT.setFont(textFont);
                for(int i = 0;i<11;i++){ //"name" + # string draw
                    if(a.get(i) == 0){
                        RT.drawString(s+" 0",(i*60)+52,530);
                    }
                    else if(a.get(i) < 30){
                        RT.drawString(s+" "+a.get(i),(i*60)+52,(a.get(i)/2)+51);
                    }
                    else{
                        RT.drawString(s+" "+a.get(i),(i*60)+52,(a.get(i)/2)+30);
                    }
                    }
                RT.setForegroundColor(Color.RED); //line draw
                for(int i=0;i<11;i++){
                    if(a.get(i)==0){
                        a.set(i, 1000);
                    }
                    else{}
                }
                for(int i = 0; i<11;i++){
                    RT.drawLine((i*60)+52,(a.get(i)/2)+33,(i*60)+112,(a.get(i+1)/2)+33);
                }
            }
        }
    }
    public void search() throws FileNotFoundException{
        System.out.println("");
        System.out.println("7: Names only in 5-6 decades");
        NamesRecord bs = new NamesRecord();
        bs.record6();
    }
}
