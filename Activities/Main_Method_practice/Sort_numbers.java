/**
 * This class sorts a given number of numbers in an array.
 *
 * @author (Raphael Talusan)
 * @version (10/16/23)
 */
public class Sort_numbers
{
    private int[] x;
    public Sort_numbers(int n)
    {
        x = new int[n];
        for (int i = 0; i < x.length; i++){
            x[i] = (int)(Math.random()*101);
        }
        for (int i = 0; i < x.length; i++){
            System.out.print(" "+x[i]+" ");
        }
        System.out.println("");
        sort();
    }
    public void sort()
    {
        int temp = 0;
        for (int i = 0; i < x.length-1; i++){
            for (int j = 0; j < x.length-1; j++){
                if (x[j]>x[j+1]){
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < x.length; i++){
            System.out.print(" "+ x[i] +" ");
        }
        System.out.println("");
    }
}
