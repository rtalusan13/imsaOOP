import java.util.concurrent.TimeUnit;
/**
 * Write a description of class heater_testclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class heater_testclass
{
    // instance variables - replace the example below with your own
    int i;
    /**
     * Constructor for objects of class heater_testclass
     */
    public heater_testclass()
    {
        Heater heater = new Heater();
        for (i = 0; i < 4; i++){
            heater.warm();
            try
            {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        for (i = 0; i < 11; i++){
            heater.cool();
            try
            {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        heater.warm();
        }
    }
