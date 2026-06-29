import java.util.Random;
import javax.swing.*;
import java.io.File;
import java.io.*;
import javax.sound.sampled.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
/**
 * Write a description of class ReadFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Start
{
    // instance variables - replace the example below with your own
    /**private File soundFile;
    private AudioInputStream audioStream;
    private AudioFormat audioFormat;
    private SourceDataLine sourceLine;
    */
    // ask for input 1-4 for instrument
    //clarinet/minuetI-version.wav
    /**
     * Constructor for objects of class ReadFile
     */
    public Start()
    {}
    public static void main(String[] args){
        Random random = new Random();
        int j = random.nextInt(4)+1;
        int x1;
        int x2;
        int version;
        switch (j){ 
            case 1://clarinet
                for(int i = 0; i < 16; i++){
                    x1 = random.nextInt(6)+1;
                    x2 = random.nextInt(6)+1;
                    version = x1 + x2;
                    String abc = Integer.toString(i)+"-";
                    String rt = Integer.toString(version)+".wav";
                    String filename = "clarinet/minuet"+abc+rt;
                    StdAudio.play(filename);
                    System.out.println(Integer.toString(version)+"--> "+filename);
                }
                for(int i = 16; i < 32; i++){
                    x1 = random.nextInt(6)+1;
                    String abc = Integer.toString(i-16)+"-";
                    String rt = Integer.toString(x1)+".wav";
                    String filename = "clarinet/trio"+abc+rt;
                    StdAudio.play(filename);
                    System.out.println(Integer.toString(x1)+"--> "+filename);
                }
                break;
            case 2://flute-harp
                for(int i = 0; i < 16; i++){
                    x1 = random.nextInt(6)+1;
                    x2 = random.nextInt(6)+1;
                    version = x1 + x2;
                    String abc = Integer.toString(i)+"-";
                    String rt = Integer.toString(version)+".wav";
                    String filename = "flute-harp/minuet"+abc+rt;
                    StdAudio.play(filename);
                    System.out.println(Integer.toString(version)+"--> "+filename);
                }
                for(int i = 16; i < 32; i++){
                    x1 = random.nextInt(6)+1;
                    String abc = Integer.toString(i-16)+"-";
                    String rt = Integer.toString(x1)+".wav";
                    String filename = "flute-harp/trio"+abc+rt;
                    StdAudio.play(filename);
                    System.out.println(Integer.toString(x1)+"--> "+filename);
                }
                break;
            case 3://mbira
                for(int i = 0; i < 16; i++){
                    x1 = random.nextInt(6)+1;
                    x2 = random.nextInt(6)+1;
                    version = x1 + x2;
                    String abc = Integer.toString(i)+"-";
                    String rt = Integer.toString(version)+".wav";
                    String filename = "mbira/minuet"+abc+rt;
                    StdAudio.play(filename);
                    System.out.println(Integer.toString(version)+"--> "+filename);
                }
                for(int i = 16; i < 32; i++){
                    x1 = random.nextInt(6)+1;
                    String abc = Integer.toString(i-16)+"-";
                    String rt = Integer.toString(x1)+".wav";
                    String filename = "mbira/trio"+abc+rt;
                    StdAudio.play(filename);
                    System.out.println(Integer.toString(x1)+"--> "+filename);
                }
                break;
            case 4://piano
                for(int i = 0; i < 16; i++){
                    x1 = random.nextInt(6)+1;
                    x2 = random.nextInt(6)+1;
                    version = x1 + x2;
                    String abc = Integer.toString(i)+"-";
                    String rt = Integer.toString(version)+".wav";
                    String filename = "piano/minuet"+abc+rt;
                    StdAudio.play(filename);
                    System.out.println(Integer.toString(version)+"--> "+filename);
                }
                for(int i = 16; i < 32; i++){
                    x1 = random.nextInt(6)+1;
                    String abc = Integer.toString(i-16)+"-";
                    String rt = Integer.toString(x1)+".wav";
                    String filename = "piano/trio"+abc+rt;
                    StdAudio.play(filename);
                    System.out.println(Integer.toString(x1)+"--> "+filename);
                }
                break;
        }
    }
}
