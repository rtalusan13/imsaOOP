
/**
 * This class does calculations.
 * 
 * @author (Raphael Talusan) 
 * @version (11/3/23)
 */
public class Array_Lab
{
    // instance variables - replace the example below with your own
   
    int [] num = new int[10];
    /**
     * Constructor for objects of class Calculate
     * MAKE NO CHANGES TO THE CONSTRUCTOR
     */
    public Array_Lab()
    {
       //initailize the array
       for (int i = 0; i < 10; i++)
       {
        num[i] = (int)(Math.random()*5+1);
        if (num[i] == 2 || num[i] == 3)
        {
            num[i] = -num[i];
        }
        System.out.print(num[i]+ " ");
       }
       System.out.println();
       countFive();
       System.out.println("Thesum is --> " + sum());
       changeSign();
       for (int i = 0; i < 10; i++)
       {
        System.out.print(num[i]+ " ");   
       }
       oddEven();
       System.out.println();
    }
//this method counts how many times number 5 appears in the array num and
//displays that count on the terminal window.
    public void countFive( )
    {
        int count = 0;
        for(int i = 0; i < 10; i++){
            if(num[i] == 5){
                count++;
            }
            else{
                count = count;
            }
        }
        System.out.println("There are "+count+" fives");
    }
//this method counts the sum of the numbers in num and returns that sum
    public int sum()
    {
     int printed = 0;
     for(int i = 0; i<10; i++){
         printed = printed + num[i];
     }
     return printed;
    }
//this method changes the sign of the number and stores it back in the array 
//and displays the new numbers
public void changeSign()
{
    for(int i = 0; i < 10; i++){
        num[i] = -num[i];
    }
}
//this method counts number of even numbers and number of odd numbers and
//displays their respective count . For example - Even numbers --> 4 Odd Numbers --> 3
//Please note number 0 is neither even, nor odd.
public void oddEven()
{
    int evenCount = 0;
    int oddCount = 0;
    for(int i = 0; i < 10; i++){
        if(num[i] % 2 == 0){
            evenCount++;
        }
        if(num[i] % 2 == 1){
            oddCount++;
        }
    }
    System.out.println("Even numbers --> "+evenCount);
    System.out.println("Odd numbers --> "+oddCount);
}
}

