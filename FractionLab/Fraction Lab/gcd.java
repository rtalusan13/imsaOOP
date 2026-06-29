
/**
 * Write a description of class gcd here.
 * 
 * @author (Dr. P. Patankar) 
 * @version (1)
 */
public class gcd
{
    
    public gcd()
    {
      
    }
    //Method to find the greatest common factor.
    public static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
    

    
}
