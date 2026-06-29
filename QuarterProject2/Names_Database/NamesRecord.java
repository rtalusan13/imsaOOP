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
 * Write a description of class NamesRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NamesRecord
{
    public void record1() throws FileNotFoundException
    {
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
    public void record2(String s) throws FileNotFoundException
    {
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
    public void record3() throws FileNotFoundException{
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
    public void record4() throws FileNotFoundException{
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
    public void record5(int s) throws FileNotFoundException{
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
    public void record6() throws FileNotFoundException{
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
