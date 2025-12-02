
/**
 * Write a description of class Lab_Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lab_Test
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Lab_Test
     */
    public Lab_Test()
    {
        Lab lab = new Lab();
        System.out.println(lab.replace("abcdabcd","bcd","xyz"));
        //System.out.println(lab.find("abcd","cd"));
        //System.out.println(lab.find("abcd","ef"));
        System.out.println(lab.password("abcd","abcd"));
        System.out.println(lab.length("abcdefgh"));
        System.out.println(lab.length("abcd"));
        
       
    }

    
}
