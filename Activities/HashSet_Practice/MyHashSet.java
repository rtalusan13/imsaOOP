import java.util.HashSet;
/**
 * Write a description of class MyHashSet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyHashSet
{
    // instance variables - replace the example below with your own
    private HashSet<String> myset;

    /**
     * Constructor for objects of class MyHashSet
     */
    public MyHashSet()
    {
        // initialise instance variables
        myset = new HashSet<String>();
        myset.add("one");
        myset.add("two");
        myset.add("three");
        myset.add("one");
        myset.add("three");
        myset.add("three");
        for (String s: myset){
            System.out.println(s);
        }
    }
}
