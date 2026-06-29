import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class NameRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BASE extends JFrame
{
    JTextField f;
    private SimpleCanvas RT;
    public BASE()
    {
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        f = new JTextField();
        f.setHorizontalAlignment(JTextField.RIGHT);
        add(f,BorderLayout.NORTH);
        
        JButton b1 = new JButton("1: Increasingly popular names");
        JButton b2 = new JButton("2: Decade rank per name");
        JButton b3 = new JButton("3: Names only in one decade");
        JButton b4 = new JButton("4: Names in all decades");
        JButton b5 = new JButton("5: Names of a chosen rank");
        JButton b6 = new JButton("6: A graph for a name");
        JButton b7 = new JButton("7: Names only in 5-6 decades");
        JButton close = new JButton("Exit");
        
        p.setLayout(new GridLayout(8,1));
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(close);
        
        add(p,BorderLayout.CENTER);
        pack();
        setVisible(true);
        
        b1.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                try
                {
                    popularNames();
                }
                catch (FileNotFoundException fnfe)
                {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        b2.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                JFrame frame = new JFrame("2: Decade rank per name");
                String s = JOptionPane.showInputDialog(frame,"What name?");
                try
                {
                    singleName(s);
                }
                catch (FileNotFoundException fnfe)
                {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        b3.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                try
                {
                    singleDecade();
                }
                catch (FileNotFoundException fnfe)
                {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        b4.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                try
                {
                    allNamesDecades();
                }
                catch (FileNotFoundException fnfe)
                {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        b5.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                JFrame frame = new JFrame("5: Names of a chosen rank");
                String j = JOptionPane.showInputDialog(frame,"What rank (1-999)?");
                int s = Integer.parseInt(j);
                try
                {
                    singleRank(s);
                }
                catch (FileNotFoundException fnfe)
                {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        b6.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                JFrame frame = new JFrame("6: A graph for a name");
                String s = JOptionPane.showInputDialog(frame,"What name?");
                try
                {
                    drawing(s);
                }
                catch (FileNotFoundException fnfe)
                {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        b7.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                try
                {
                    search();
                }
                catch (FileNotFoundException fnfe)
                {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        close.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        }
        );
    }
    public void popularNames()throws FileNotFoundException{ //names getting more popular
        System.out.println("");
        System.out.println("1: Increasingly Popular Names");
        File text = new File("names.txt");
        Scanner scanner = new Scanner(text);
        while(scanner.hasNextLine()){
            String s = scanner.next();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for(int i = 0; i < 11; i++){
                a.add(scanner.nextInt());
                if(a.get(i) == 0){
                    a.set(i, 1000);
                }
            }
            int k = 0;
            for(int j = 0; j < a.size()-1; j++){
                if(a.get(j+1)<a.get(j)){ //or <= for all possibilities
                    k++;
                }
                else{
                }
            }
            if(k == 10){
                System.out.print(s);
                for(int i = 0; i < 11; i++){
                    if(a.get(i) == 1000){
                        a.set(i, 0);
                    }
                }
                for(int i = 0; i < a.size(); i++){
                    System.out.print(" "+a.get(i));
                }
                System.out.println("");
            }
            else{
                System.out.print("");
            }
        }
    }
    public void singleName(String s)  throws FileNotFoundException{ //one name, rank among all decades
        System.out.println("");
        System.out.println("Chosen name: "+s);
        File text = new File("names.txt");
        Scanner scanner = new Scanner(text);
        while(scanner.hasNextLine()){
            String t = scanner.nextLine();
            if (t.contains(s + " ")){
                System.out.println(t);
            }
            else{
                System.out.print("");
            }
        }
    }
    public void singleDecade()  throws FileNotFoundException{ //one decade, all ranked names
        System.out.println("");
        System.out.println("3: Names only in one decade");
        File text = new File("names.txt");
        Scanner scanner = new Scanner(text);
        while(scanner.hasNextLine()){
            String s = scanner.next();
            int j = 0;
            ArrayList<Integer> numbers = new ArrayList<>();
            for(int i = 0; i < 11; i++){
                numbers.add(scanner.nextInt());
            }
            for(int i = 0; i < 11; i++){
                if(numbers.get(i) == 0){
                    j++;
                }
            }
            if (j == 10){
                System.out.print(s);
                for(int i = 0; i < numbers.size(); i ++){
                    System.out.print(" "+numbers.get(i));
                }
                System.out.println("");
            }
            else{
                System.out.print("");
            }
        }
    }
    public void allNamesDecades() throws FileNotFoundException{
        File text = new File("names.txt");
        Scanner scanner = new Scanner(text);
        while(scanner.hasNextLine()){
            String s = scanner.nextLine();
            if (s.contains(" 0")){
                System.out.print("");
            }
            else{
                System.out.println(s);
            }
        }
    }
    public void singleRank(int s) throws FileNotFoundException{
        System.out.println("");
        System.out.println("Names with a rank "+s+":");
        File text = new File("names.txt");
        Scanner scanner = new Scanner(text);
        while(scanner.hasNextLine()){
            String t = scanner.nextLine() + " ";
            if (t.contains(" "+s+" ")){
                System.out.println(t);
            }
            else{
                System.out.print("");
            }
        }
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
        File text = new File("names.txt");
        Scanner scanner = new Scanner(text);
        while(scanner.hasNextLine()){
            String s = scanner.next();
            int j = 0;
            ArrayList<Integer> numbers = new ArrayList<>();
            for(int i = 0; i < 11; i++){
                numbers.add(scanner.nextInt());
            }
            for(int i = 0; i < 11; i++){
                if(numbers.get(i) == 0){
                    j++;
                }
            }
            if (j == 5){
                System.out.print(s);
                for(int i = 0; i < numbers.size(); i ++){
                    System.out.print(" "+numbers.get(i));
                }
                System.out.println("");
            }
            else if (j == 6){
                System.out.print(s);
                for(int i = 0; i < numbers.size(); i ++){
                    System.out.print(" "+numbers.get(i));
                }
                System.out.println("");
            }
            else{
                System.out.print("");
            }
        }
    }
}
