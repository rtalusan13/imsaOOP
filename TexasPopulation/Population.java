import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;

/**
 * Write a description of class Population here.
 *
 * @author (Raphael Talusan)
 * @version (10/27/23)
 */
public class Population
{
    private Scanner scan;
    private Scanner sc;
    private ArrayList<String> p;
    private String[] counties;
    private int[] population;
    private int[] numCon;
    private double[] percent;
    private double[] digitPop;
    private int total; //total population of the state
    private Random rand;
    private Random colorRand;
    private Canvas RT;
    Font textFont = new Font("Arial", Font.PLAIN, 10);
    Font headerFont = new Font("Arial", Font.BOLD, 14);
    /**
     * Constructor for objects of class Population
     */
    public Population() throws FileNotFoundException
    {
        File file = new File("TexasCountyPopulation.txt");
        scan = new Scanner(file);
        sc = new Scanner(System.in);
        p = new ArrayList<String>();
        counties = new String[254];
        population = new int[254];
        numCon = new int[9];
        percent = new double[9];
        digitPop = new double[9];
        rand = new Random();
        readfile();// read the input population file
        boolean b = true;
        String response = "";
        int response1;
        int response2;
        while (b)
        {
            System.out.println("Would you like to look at Texas Population, enter yes or no");
            response = sc.nextLine();
            if (response.equals("yes"))
            {
                System.out.println("Please select one of the following:");
                System.out.println("1: Print data from file");
                System.out.println("2: Print Texas total population");
                System.out.println("3: Print population for a random county");
                System.out.println("4: Enter digit 1-9 to display counties with population starting what that digit");
                System.out.println("5: Display percent of population and number of counties for each digit");
                System.out.println("6: Shuffle the ArrayList's order");
                response1 = Integer.parseInt(sc.nextLine());
                if (response1 >= 1 && response1 <= 6)
                {
                    if (response1 == 1)
                    {
                        printdata();
                    }
                    if (response1 == 2)
                    {
                        findTotal();
                    }
                    if (response1 == 3)
                    {
                        randomCounty();
                    }
                    if (response1 == 4)
                    {
                        System.out.println("Enter a digit 1 through 9");
                        response2 = Integer.parseInt(sc.nextLine());
                        if (response2 >= 1 && response2 <= 9)
                        {
                            System.out.println("Counties Population Starting digit" + response2);
                            showLeadingDigit(response2);
                        }
                        else
                        {
                            System.out.println("Starting Digit must be between 1 and 9");
                        }
                    }
                    if (response1 == 5)
                    {
                        analysis();
                        draw();
                    }
                    if (response1 == 6)
                    {
                        shuffler();
                    }
                }
                else
                {
                    System.out.println("Your Response must be 1, 2, 3, 4, 5, or 6");

                }
            }
            else
            {
                b = false;
                System.out.println("Goodbye!");
                System.exit(0);
            }
        }
    }
    // method will read the imput file
    public void readfile()
    {
        String line = "";
        String[]s;
        int cnt = 0;
        while (scan.hasNextLine())
        {
            line = scan.nextLine();
            p.add(line);
            s = line.split("\t");
            counties[cnt] = s[0];//add county name to counties array
            population[cnt] = Integer.parseInt(s[1]); // add to population array
            total = total + Integer.parseInt(s[1]);//get the state population
            cnt = cnt +1;
           
        }
    }
    // this method writes texas population to the terminal window
    public void findTotal()
    {
        System.out.println("Population of the state of Texas ---> " + total);
    }
    //this method displays the population of a random county
    public void randomCounty()
    {
        int number = rand.nextInt(254);
        System.out.println("Population of " + counties[number] + "is " + population[number]);
    }
    //this method prints all the data to window terminal
    public void printdata()
    {
        for (String d : p)
        {
            System.out.println(d);
        }
    }
    //this method shows all counties whose leading digit of the population is a specific digit given by the user
    public void showLeadingDigit(int b)
    {
        int index = 0;
        String a = "" + b;
        for (int f : population)
        {
            String s = "" + f;
            String c = "" + s.charAt(0);
            if (c.equals(a))
            {
                System.out.println(counties[index] + " " + s);
            }
            index++;
        }
    }
    //this method will make a table with the data
    public void analysis ()
    {
        System.out.println("digit   # of counties   Percentage");
        for (int i = 1; i <= 9 ; i++)
        {
            int digit = i;
            int index = 0;
            String a = "" + i;
            int totalpop = 25145561;
            int pop = 0;
           
            for (int f:population)
            {
                String s = "" + f;
                String c = "" + s.charAt(0);
               
                if (c.equals(a))
                {
                    index++;
                    pop = pop + f;
                }
            }
            int number = index;
            numCon[i-1] = index;
            digitPop[i-1] = pop;
            Double q = new Double(pop);
            Double p = new Double(totalpop);
            double percentage = q/p;
            percentage = percentage*100;
            percentage = (Math.round(100*percentage))/100.0;
            percent[i-1] = percentage;
       
            System.out.println((i) + "        " + numCon[i-1] + "               "+percent[i-1]);
        }
    }
    public void shuffler(){
        Collections.shuffle(p);
        System.out.println("Shuffled!");
    }
    public void draw(){
        RT = new Canvas("Population vs. Leading Digits", 500, 600);
        RT.setForegroundColor(Color.BLACK);
        RT.fillRectangle(10,5,3,575); //1% = 19 pixels
        RT.fillRectangle(10,577,480,3);
        RT.setFont(textFont);
        int ySetter = 577;
        RT.drawString("0",14,ySetter);
        ySetter = ySetter - 95;
        RT.drawString("5",14,ySetter);
        ySetter = ySetter - 95;
        RT.drawString("10",14,ySetter);
        ySetter = ySetter - 95;
        RT.drawString("15",14,ySetter);
        ySetter = ySetter - 95;
        RT.drawString("20",14,ySetter);
        ySetter = ySetter - 95;
        RT.drawString("25",14,ySetter);
        ySetter = ySetter - 95;
        RT.drawString("30",14,ySetter);
        int xSetter = 37;
        RT.drawString("1",xSetter-2,590);
        graph1(xSetter);
        RT.setForegroundColor(Color.BLACK);
        xSetter = xSetter + 54;
        RT.drawString("2",xSetter-2,590);
        graph2(xSetter);
        RT.setForegroundColor(Color.BLACK);
        xSetter = xSetter + 54;
        RT.drawString("3",xSetter,590);
        graph3(xSetter); 
        RT.setForegroundColor(Color.BLACK);
        xSetter = xSetter + 54;
        RT.drawString("4",xSetter-2,590);
        graph4(xSetter); 
        RT.setForegroundColor(Color.BLACK);
        xSetter = xSetter + 54;
        RT.drawString("5",xSetter-1,590);
        graph5(xSetter); 
        RT.setForegroundColor(Color.BLACK);
        xSetter = xSetter + 54;
        RT.drawString("6",xSetter-1,590);
        graph6(xSetter); 
        RT.setForegroundColor(Color.BLACK);
        xSetter = xSetter + 54;
        RT.drawString("7",xSetter-1,590);
        graph7(xSetter); 
        RT.setForegroundColor(Color.BLACK);
        xSetter = xSetter + 54;
        RT.drawString("8",xSetter-1,590);
        graph8(xSetter); 
        RT.setForegroundColor(Color.BLACK);
        xSetter = xSetter + 54;
        RT.drawString("9",xSetter-1,590);
        graph9(xSetter);
        RT.setForegroundColor(Color.BLACK);
        RT.setFont(headerFont);
        RT.drawString("Graph of Percentange vs. Leading digits for Texas Population",40,17);
    }
    private void graph1(int xSetter){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B= (int)(Math.random()*256);
        Color color = new Color(R, G, B); //random color, but can be bright or dull

        //to get rainbow, pastel colors
        Random random = new Random();
        final float hue = random.nextFloat();
        final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
        final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
        color = Color.getHSBColor(hue, saturation, luminance);
        RT.setForegroundColor(color);
        RT.fillRectangle(xSetter-13,10,27,567);
    }
    private void graph2(int xSetter){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B= (int)(Math.random()*256);
        Color color = new Color(R, G, B); //random color, but can be bright or dull

        //to get rainbow, pastel colors
        Random random = new Random();
        final float hue = random.nextFloat();
        final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
        final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
        color = Color.getHSBColor(hue, saturation, luminance);
        RT.setForegroundColor(color);
        int y = 577 - (18*19);
        int k = 577 - y;
        RT.fillRectangle(xSetter-13,y,27,k);
    }
    private void graph3(int xSetter){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B= (int)(Math.random()*256);
        Color color = new Color(R, G, B); //random color, but can be bright or dull

        //to get rainbow, pastel colors
        Random random = new Random();
        final float hue = random.nextFloat();
        final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
        final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
        color = Color.getHSBColor(hue, saturation, luminance);
        RT.setForegroundColor(color);
        int y = 577 - (7*19);
        int k = 577 - y;
        RT.fillRectangle(xSetter-13,y,27,k);
    }
    private void graph4(int xSetter){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B= (int)(Math.random()*256);
        Color color = new Color(R, G, B); //random color, but can be bright or dull

        //to get rainbow, pastel colors
        Random random = new Random();
        final float hue = random.nextFloat();
        final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
        final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
        color = Color.getHSBColor(hue, saturation, luminance);
        RT.setForegroundColor(color);
        int y = 577 - (24*19);
        int k = 577 - y;
        RT.fillRectangle(xSetter-13,y,27,k);
    }
    private void graph5(int xSetter){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B= (int)(Math.random()*256);
        Color color = new Color(R, G, B); //random color, but can be bright or dull

        //to get rainbow, pastel colors
        Random random = new Random();
        final float hue = random.nextFloat();
        final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
        final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
        color = Color.getHSBColor(hue, saturation, luminance);
        RT.setForegroundColor(color);
        int y = 577 - (4*19);
        int k = 577 - y;
        RT.fillRectangle(xSetter-13,y,27,k);
    }
    private void graph6(int xSetter){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B= (int)(Math.random()*256);
        Color color = new Color(R, G, B); //random color, but can be bright or dull

        //to get rainbow, pastel colors
        Random random = new Random();
        final float hue = random.nextFloat();
        final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
        final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
        color = Color.getHSBColor(hue, saturation, luminance);
        RT.setForegroundColor(color);
        int y = 577 - (4*19)-3;
        int k = 577 - y;
        RT.fillRectangle(xSetter-13,y,27,k);
    }
    private void graph7(int xSetter){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B= (int)(Math.random()*256);
        Color color = new Color(R, G, B); //random color, but can be bright or dull

        //to get rainbow, pastel colors
        Random random = new Random();
        final float hue = random.nextFloat();
        final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
        final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
        color = Color.getHSBColor(hue, saturation, luminance);
        RT.setForegroundColor(color);
        int y = 577 - (8*19);
        int k = 577 - y;
        RT.fillRectangle(xSetter-13,y,27,k);
    }
    private void graph8(int xSetter){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B= (int)(Math.random()*256);
        Color color = new Color(R, G, B); //random color, but can be bright or dull

        //to get rainbow, pastel colors
        Random random = new Random();
        final float hue = random.nextFloat();
        final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
        final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
        color = Color.getHSBColor(hue, saturation, luminance);
        RT.setForegroundColor(color);
        int y = 577 - (5*19);
        int k = 577 - y;
        RT.fillRectangle(xSetter-13,y,27,k);
    }
    private void graph9(int xSetter){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B= (int)(Math.random()*256);
        Color color = new Color(R, G, B); //random color, but can be bright or dull

        //to get rainbow, pastel colors
        Random random = new Random();
        final float hue = random.nextFloat();
        final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
        final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
        color = Color.getHSBColor(hue, saturation, luminance);
        RT.setForegroundColor(color);
        int y = 577 - 6;
        int k = 577 - y;
        RT.fillRectangle(xSetter-13,y,27,k);
    }
}