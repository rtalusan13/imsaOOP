import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
/**
 * This class implements an arralist of strings.
 *
 * @author (Raphael Talusan)
 * @version (10/20/23)
 */
public class My_ArrayList
{
    // instance variables - replace the example below with your own
    private ArrayList<String> list1;
    private Scanner scan;
    /**
     * Constructor for objects of class My_ArrayList
     */
    public My_ArrayList()
    {
        // initialise instance variables
        scan = new Scanner(System.in);
        list1 = new ArrayList<String>();
        String s = "";
        for (int i = 0; i < 5; i++){
            System.out.println("Input a string --> ");
            s = scan.nextLine();
            list1.add(s);
        }
        
        /**
         * use the get method of arraylist to extract the strings
         for (int i = 0; i < list1.size(); i++){
              System.out.println(list1.get(i));
         }
         */
        for(String p : list1){
            System.out.println(p);
        }
        
        /**
        Iterator<String> it = list1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
         */
    }
}
