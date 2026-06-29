import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Fibonacci{
    public Fibonacci(){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("How many fibonacci terms would you like to print? ");
        int terms = myScanner.nextInt();
        List<Long> myLongList = new ArrayList<>();
        long fibNum = 1;
        myScanner.close();
        int i = 0;
        if(i == 0){
            System.out.print("Fibonacci Sequence: 1, ");
            i = i + 3;
        }
        for(i = 2; i < terms; i++){
            myLongList.add(fibNum);
            System.out.print(fibNum+", ");
            fibNum = fibNum + myLongList.get(i-2);
            /**System.out.print(oddTerms+", ");
            evenTerms = evenTerms + oddTerms;
            System.out.print(evenTerms+", ");
            oddTerms = evenTerms + oddTerms;*/
        }
    }
}