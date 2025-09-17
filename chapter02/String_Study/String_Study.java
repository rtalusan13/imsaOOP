/**
 * This class uses various methods of the String class.
 *
 * @author (Raphael Talusan)
 * @version (9/7/2023)
 */
public class String_Study
{
    int i;
    int k;
    int multiplier;
    int looper;
    public String_Study(String s){
        if (i == 0){ //creates exception for when int = k = -1
            if (Character.isLetter(s.charAt(i))){
            System.out.print(s.charAt(i)); //prints s.charAt(0)
            }
            if (Character.isDigit(s.charAt(i))){
            System.out.print(""); //if s.charAt(0) is a digit, it will not print
            }
        }
        for (int i = 1; i < s.length();i++)
        {
            k = 0;
            k = i-1; //this was for redundancy to reset the value of k each loop
            if (Character.isLetter(s.charAt(i))){ //ignores any digits
                if (Character.isDigit(s.charAt(k))){ //checks previous char for a digit
                    multiplier = Integer.parseInt(String.valueOf(s.charAt(k)))+1;
                    //converts the digit in the string into a useable integer
                    for (int looper = 0; looper < multiplier;looper++){
                        System.out.print(s.charAt(i));
                        //loops the printing of the aforementioned s.charAt(i)
                        //using the digit at s.charAt(k) where k = i-1
                    }
                }
                else{
                    System.out.print(s.charAt(i));
                    //if previous character is not a digit, print normally
                }
            }
        }
        System.out.println("");
}
    
    /**
    
        public String_Study(String s)
    {
         
        s = "abcdef%gh1234";
        //char c = "9";
        
        
        int k = Character.getNumericValue(c);
         
        if(Character.isDigit(c)){
            }
        
       
        //System.out.println("The length of "+s+" is "+s.length());
        //System.out.println("The character at location 10 is "+s.charAt(10));
        /**
         *
         for (int i = 0; i<s.length();i++){
            System.out.println("The character at location "+i+" is "+ s.charAt(i));
        }
        
        String k = s.trim();//empty string
        System.out.println("The length of s is --> "+s.length());
        System.out.println("The length of s without spaces is --> "+k.length());
        
        
        System.out.println(s);
        System.out.println(s.substring(5,10));
        System.out.println(s.substring(5));
       
        for (int i = 0; i < s.length();){
            if (Character.isLetter(s.charAt(i))){
                System.out.println("The character is a letter "+s.charAt(i));
            }
            else if (Character.isDigit(s.charAt(i))){
                System.out.println("The character is a digit "+s.charAt(i));
            }
            else{
                System.out.println("The character is neither a letter nor digit: " +s.charAt(i));
            }
            i = i+1;
        }
    */
    }