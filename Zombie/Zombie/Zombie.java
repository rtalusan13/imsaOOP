import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException; //io stands for input output
import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;
/**
 * Write a description of class Zombie here.
 *
 * @author (Raphael Talusan)
 * @version (11/9/23)
 */
public class Zombie
{
    ArrayList<String> names1 = new ArrayList<String>();
    ArrayList<String> zomb = new ArrayList<String>();
    ArrayList<String> none = new ArrayList<String>();
    ArrayList<String> mostContact = new ArrayList<String>();
    ArrayList<String> mostViral = new ArrayList<String>();  
    HashMap<String, ArrayList> collection1 = new HashMap<String, ArrayList>();

    //Constructor for objects of class Zombie
    //runs all of methods and inserts line after all at once
    public Zombie() throws FileNotFoundException
    {
        Contact();
        System.out.println("");
        pZeroPrint();
        System.out.println("");
        potZombiePrint();
        System.out.println("");
        neither();
        System.out.println("");
        viral();
        System.out.println("");
        mostContact();
        System.out.println("");
    }
    //this method is for the processing of the file through Scannr and loading data into collection1
    public void collectionLoad() throws FileNotFoundException
    {
        File text = new File("Dataset1.txt");
        Scanner scan = new Scanner(text);
        
        while (scan.hasNextLine())
        {
            ArrayList<String> l1 = new ArrayList<String>();
            ArrayList<String> list = new ArrayList<String>();
            String line = scan.nextLine();
            String[] line1 = line.split(",");
            
            for(int i = 1; i < line1.length; i++)
            {
                list.add(line1[i]);
            }
            
            collection1.put(line1[0], list);    
        }
    }
    //this method is for the first part
    //creates splitted data into arraylist and prints out lines using size logic
    public void Contact() throws FileNotFoundException
    {
        File text = new File("Dataset1.txt");
        Scanner scan = new Scanner(text);
        
        System.out.print("Contact Records: ");
        while (scan.hasNextLine())
        {
            List<String> l1 = new ArrayList<String>();
            String line = scan.nextLine();
            String[] line1 = line.split(",");
            for (String a: line1)
            {
                l1.add(a);
            }
           
            System.out.print("\n" + "\t" + l1.get(0) + " had contact with ");
            for(int i= 1; i < l1.size(); i++)
            {   
                if(l1.size() == 2)
                {
                    System.out.print(l1.get(1));
                }
                else
                {
                    if(i == l1.size()-1)
                        {
                            System.out.print(l1.get(i));
                        }
                    else if(i == l1.size()-2)
                            {
                                System.out.print(l1.get(i) + " and ");
                            }
                        else
                            {
                                System.out.print(l1.get(i) +", ");
                            }
                }
            }
        }
    }
    //pure logic method for patient zero that is used in later method
    //searches keys and sees if values contain key
    //found counter is used to instances
    public void pZero() throws FileNotFoundException
    {      
        collectionLoad(); 
        
        for(String word: collection1.keySet())
        {
            int found = 0;
            
            for(ArrayList list1: collection1.values())
            {
                if(list1.contains(word))
                {
                    found = found + 1;
                }
            }
            if(found == 0)
            {
                names1.add(word);
            }
        }    
    }
    //print capability for pZero()
    public void pZeroPrint() throws FileNotFoundException
    {
        collectionLoad(); 
        
        for(String word: collection1.keySet())
        {
            int found = 0;
            for(ArrayList list1: collection1.values())
            {
                if(list1.contains(word))
                {
                    found = found + 1;
                }
            }
            if(found == 0)
            {
                names1.add(word);
            }
        }
        
        System.out.print("Patient Zero(s): ");
        printNames(names1);
    }
    //pure logic method for potential zombie that is used in later method
    //searches values and sees if value is not a key 
    public void potZombie() throws FileNotFoundException
    {
        collectionLoad(); 
        
        for(ArrayList list1: collection1.values())
        {
            int found = 0;
            for(int i= 0; i < list1.size(); i++)
            {
                if (collection1.containsKey(list1.get(i)))
                {
                    ;
                }
                else
                {
                    if(zomb.contains(list1.get(i)))
                    {
                        ;
                    }
                    else
                    {
                        StringBuffer sb = new StringBuffer();
                        sb.append(list1.get(i));
                        zomb.add(sb.toString());                        
                    }
                }
            }
        }
    }
    //print capability for prior method
    public void potZombiePrint() throws FileNotFoundException
    {
        collectionLoad(); 
        
        for(ArrayList list1: collection1.values())
        {
            int found = 0;
            for(int i= 0; i < list1.size(); i++)
            {
                //System.out.println(list1.get(i));
                if (collection1.containsKey(list1.get(i)))
                {
                    ;
                }
                else
                {
                    if(zomb.contains(list1.get(i)))
                    {
                        ;
                    }
                    else
                    {
                        StringBuffer sb = new StringBuffer();
                        sb.append(list1.get(i));
                        zomb.add(sb.toString());
                    }
                }
            }
        }     
        System.out.print("Potential Zombies: ");
        printNames(zomb);
    }
    //takes in prior logic methods for lists
    //then it sees the names in the file that are not in those functions' output lists
    public void neither() throws FileNotFoundException
    {
        collectionLoad(); 
        
        potZombie();
        pZero();
        
        for(ArrayList list1: collection1.values())
        {
            for(int i= 0; i < list1.size(); i++)
            {
                if(zomb.contains(list1.get(i)) || names1.contains(list1.get(i)))
                {
                   ; 
                }
                else
                {
                    StringBuffer sb1 = new StringBuffer();
                    sb1.append(list1.get(i));
                    if(none.contains(sb1.toString()))
                    {
                        ;
                    }
                    else
                    {
                        none.add(sb1.toString());
                    }
                }
            }
        }
        System.out.print("Neither Patient Zero or Potential Zombie: ");
        printNames(none);
    }
    //goes through the keys, finds max size, and then compares value size of keys to this
    //based on this, word is added to list
    public void viral() throws FileNotFoundException
    {
        int maxSize = 0;
        String maxViral = "";
        
        collectionLoad(); 
        
        for(String word: collection1.keySet())
        {
            if(collection1.get(word).size() >= maxSize)
            {
                maxSize = collection1.get(word).size();
            }
        }
        for(String word: collection1.keySet())
        {
            if(collection1.get(word).size() == maxSize)
            {
                mostViral.add(word);   
            }
        }
        System.out.print("Most Viral People: ");
        printNames(mostViral);
    }
    //the method look through the values and sees which one occurs the most and adds it to list that is printed
    public void mostContact() throws FileNotFoundException
    {
        HashMap<String, Integer> collection2 = new HashMap<String, Integer>();
        int maxInt1 = 0;
        
        collectionLoad(); 
        
        for(ArrayList value: collection1.values())
        {
            for(int i = 0; i <value.size(); i++)
            {
                StringBuffer sb3 = new StringBuffer();
                sb3.append(value.get(i));
                if (collection2.containsKey(sb3.toString()))
                {
                    
                    collection2.put(sb3.toString(), collection2.get(sb3.toString()) + 1);
                }
                else
                {
                    collection2.put(sb3.toString(),1);
                }
            }
        }
        
        for(int num: collection2.values())
        {
            if(num > maxInt1)
            {
                maxInt1 = num;
            }
        }
        
        for(String word: collection2.keySet())
        {
            if(collection2.get(word) == maxInt1)
            {
                mostContact.add(word);
            }
        }
        
        System.out.print("Most Contacted: ");
        printNames(mostContact);    
    }
    //method that takes the lists outputted by the other methods and prints out with commas and and
    public void printNames(ArrayList array)
    {
        int arrayLen = array.size();
        
        if(arrayLen > 0)
        {
            System.out.print(array.get(0));
            if(arrayLen == 2)
                {
                    System.out.print(" and " + array.get(1));
                }
            if (arrayLen == 3)
                {
                    System.out.print(", " + array.get(1) + " and " + array.get(2));
                }
            else if (arrayLen > 3)
                {
                    for (int i = 1; i < arrayLen - 1; i++)
                    {
                        System.out.print(", " + array.get(i));
                    }
                    System.out.print(" and "  + array.get(arrayLen - 1));
                }
        
        }
    }
}