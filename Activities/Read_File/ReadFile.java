import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * This class reads an input file.
 *
 * @author (Raphael Talusan)
 * @version (10/6/23)
 */
public class ReadFile
{
    private String[] s; 

    /**
     * Constructor for objects of class ReadFile
     */
    public ReadFile(String a)throws FileNotFoundException
    {
        File text = new File(a);
        Scanner scan = new Scanner(text);
        String line = "";
        s = new String[4];
        int i = 0;
        while(scan.hasNextLine()){
            line = scan.nextLine();
            s[i] = line;
            i = i + 1;
        }
        int total = 0;
        String[] s1 = new String[2];
        for (int j = 0; j< s.length; j++){
            s1 = s[j].split(" ");
            total = total + Integer.parseInt(s1[i]);
        }
        System.out.println("This is the integer --> "+total);
    }
}
