
/**
 * This class will test the fraction tester.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fraction_Tester
{

    /**
     * Constructor for objects of class Fraction_Tester
     */
    public Fraction_Tester()
    {
       Fraction f1 = new Fraction(1,2);
       Fraction f2 = new Fraction(1,2);
       Fraction f3 = f1.add(f2);
       System.out.println(f3.result());
       Fraction f4 = new Fraction(1,2);
       Fraction f5 = new Fraction(1,2);
       Fraction f6 = f4.multiply(f5);
       System.out.println(f6.result());
       Fraction f7 = new Fraction(2,1);
       Fraction f8 = new Fraction(2,1);
       Fraction f9 = f7.multiply(f8);
       System.out.println(f9.result());
       
       
    }

    
}
