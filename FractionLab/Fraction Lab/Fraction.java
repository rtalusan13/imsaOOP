/**
* This class will perform arithmetic operations on fractions.
*
* @author P Patankar
* @version May, 2015
*/
public class Fraction
{
    private int numerator;
    private int denominator;
    Fraction f;
    String s;

    /**
    * Constructor for objects of class Fraction
    */
    public Fraction(int n, int d)
    {
        numerator = n;
        denominator = d;
    }
    /**
     * Returns the nemerator.
     */
    public int getNumerator()
    {
        return numerator;
    }
    /**
     * Returns the denominator.
     */
    public int getDenominator()
    {
        return denominator;
    }
    /** Adds the new fraction to the existing fraction
    *  and returns the reduced fraction
    */
    public Fraction add(Fraction frac)
    {
        numerator = frac.getNumerator()*denominator + numerator*frac.getDenominator();
        denominator = frac.getDenominator()*denominator;
        reduce();
        return (new Fraction(numerator,denominator));
    }
   
    
   
    /** Multiplies the existing fraction by the new fraction
    *  and returns the reduced fraction
    */
    public Fraction multiply(Fraction frac)
    {
        numerator = frac.getNumerator()*numerator;
        denominator = frac.getDenominator()*denominator;
        reduce();
        return (new Fraction(numerator,denominator)); 
    }
   
    
       
    /** Reduces the fraction to lowest terms by finding integer values
    *  that divide evenly into both numerator and denominator.
    */
    //public Fraction reduce(Fraction frac)
    public void reduce()
    {
        //The gcd is the greatest common factor.
        int fraction_gcd = gcd.findGCD(numerator, denominator);
        //Divide the numerator by gcd.
        numerator = numerator/fraction_gcd;
        //Divide the denominator by gcd.
        denominator = denominator/fraction_gcd;
       
    }
   
    /** Returns a string representing the current value of
    *  the fraction. If the numerator is zero, returns 0.
    *  If the denominator is 1, returns only the numerator.
    *  If the denominator is 0, returns undefined
    *  If the numerator and the denominator are the same, returns 1
    *  else returns numerator / denominator in reduced form
    */
    public String result()
    {
       String s = "";
       if(denominator == 0){
           s = "undefined";
       }
       else if(numerator == 0){
           s = "0";
       }
       else if(numerator == denominator){
           s = "1";
       }
       else if(denominator == 1){
           s = Integer.toString(numerator);
       }
       else{
           s = Integer.toString(numerator)+"/"+Integer.toString(denominator);
       }
       return s;
    } 
}