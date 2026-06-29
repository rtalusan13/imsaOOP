import java.util.HashMap;
/**
 * Write a description of class Hashmap here.
 *
 * @author (Raphael Talusan)
 * @version (11/6/23)
 */
public class Hashmap
{
    public Hashmap()
    {
        HashMap phonebook = new HashMap<String,String>();
        phonebook.put("John","312-690-2346"); // key, value
        phonebook.put("Michael","708-670-2346");
        phonebook.put("Jill","331-740-2346");
        System.out.println(phonebook.get("John")); //to extract, give the key
    }
}
