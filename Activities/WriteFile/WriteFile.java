import java.io.*;
/**
 * Write a description of class WriteFIle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WriteFile
{
    // instance variables - replace the example below with your own
    private FileOutputStream out;
    private PrintStream ps;

    /**
     * Constructor for objects of class WriteFIle
     */
    public WriteFile(String s)
    {
        try
        {
            out = new FileOutputStream(s);
            ps = new PrintStream(out);
        }
        catch(Exception e)
        {
            System.out.println("Error opening the file");
        }
    }
    public void write(String s){
        
    }
    public void close(){
        try{
            ps.close();
        }
        catch(Exception e){
            System.out.println("Error closing the file");
        }
    }
}
