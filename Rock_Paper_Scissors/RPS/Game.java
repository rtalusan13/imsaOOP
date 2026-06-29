import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
/**
 * This runs Rock Paper Scissors.
 *
 * @author (Raphael Talusan)
 * @version (9/29/23)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private Canvas RT;
    int player1;
    int player2;
    int player1Wins;
    int player2Wins;
    int drawInt;
    int gamesPlayed;
    Font bigFont = new Font("Times New Roman", Font.BOLD, 40);
    Font choiceFont = new Font("Comic Sans", Font.BOLD, 30);
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        RT = new Canvas("Rock Paper Scissors", 500, 500);
        JFrame frame = new JFrame("Input Dialog Example #1");
        String s = JOptionPane.showInputDialog(frame,"How many games?");
        int i = Integer.parseInt(s);
        int player1Wins = 0;
        int player2Wins = 0;
        int drawInt = 0;
        int gamesPlayed = 1;
        String wins1String;
        String wins2String;
        String drawnString;
        String gamesPlayedString;
        for (i = i; i > 0; i--){
            Random random = new Random();
            RT.setForegroundColor(Color.YELLOW);
            RT.fillRectangle(0,0,500,500);
            RT.setForegroundColor(Color.BLACK);
            RT.setFont(bigFont);
            gamesPlayedString = Integer.toString(gamesPlayed);
            RT.drawString("Game Number:",100,60);
            RT.drawString(gamesPlayedString,370,60);
            player1 = random.nextInt(3)+1;
            player2 = random.nextInt(3)+1;
            //FINISH GETTING EVERYTHING PRINT IN CANVAS IN EACH CASE
            try
            {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
            //rock is 1, paper 2, scissors 3
            //p1 rock and p2 scissors
            if(player1 == 1){
                RT.setFont(choiceFont);
                RT.drawString("rock",65,275);
                if(player1 == player2){
                    drawInt = drawInt + 1;
                    RT.setFont(bigFont);
                    RT.drawString("Draw Game",145,450);
                    RT.setFont(choiceFont);
                    RT.drawString("rock",380,275);
                }
                if(player2 == 2){
                    player2Wins = player2Wins + 1;
                    RT.setFont(bigFont);
                    RT.drawString("Player 2 Wins",135,450);
                    RT.setFont(choiceFont);
                    RT.drawString("paper",370,275);
                }
                if(player2 == 3){
                    player1Wins = player1Wins + 1;
                    RT.setFont(bigFont);
                    RT.drawString("Player 1 Wins",135,450);
                    RT.setFont(choiceFont);
                    RT.drawString("scissors",347,275);
                }
            }
            if(player1 == 2){
                RT.setFont(choiceFont);
                RT.drawString("paper", 55, 275);
                if(player1 == player2){
                    drawInt = drawInt + 1;
                    RT.setFont(bigFont);
                    RT.drawString("Draw Game",145,450);
                    RT.setFont(choiceFont);
                    RT.drawString("paper",370,275);
                }
                if(player2 == 3){
                    player2Wins = player2Wins + 1;
                    RT.setFont(bigFont);
                    RT.drawString("Player 2 Wins",135,450);
                    RT.setFont(choiceFont);
                    RT.drawString("scissors",347,275);
                }
                if(player2 == 1){
                    player1Wins = player1Wins + 1;
                    RT.setFont(bigFont);
                    RT.drawString("Player 1 Wins",135,450);
                    RT.setFont(choiceFont);
                    RT.drawString("rock",380,275);
                }
            }
            if(player1 == 3){
                RT.setFont(choiceFont);
                RT.drawString("scissors",40,275);
                if(player1 == player2){
                    drawInt = drawInt + 1;
                    RT.setFont(bigFont);
                    RT.drawString("Draw Game",145,450);
                    RT.setFont(choiceFont);
                    RT.drawString("scissors",347,275);
                }
                if(player2 == 1){
                    player2Wins = player2Wins + 1;
                    RT.setFont(bigFont);
                    RT.drawString("Player 2 Wins",135,450);
                    RT.setFont(choiceFont);
                    RT.drawString("rock",380,275);
                }
                if(player2 == 2){
                    player1Wins = player1Wins + 1;
                    RT.setFont(bigFont);
                    RT.drawString("Player 1 Wins",135,450);
                    RT.setFont(choiceFont);
                    RT.drawString("paper",370,275);
                }
            }
            gamesPlayed = gamesPlayed + 1;
            try
            {
                TimeUnit.MILLISECONDS.sleep(1500);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        /**System.out.println("Games Played: "+(gamesPlayed-1));
        System.out.println("Player 1 Wins: "+player1Wins);
        System.out.println("Player 2 Wins: "+player2Wins);
        System.out.println("Drawn games: "+drawInt);
        */
        RT.setForegroundColor(Color.YELLOW);
        RT.fillRectangle(0,0,500,500);
        RT.setForegroundColor(Color.BLACK);
        RT.setFont(bigFont);
        RT.drawString("Results Screen",110,50);
        RT.drawString("Games Played:",90,200);
        gamesPlayedString = Integer.toString(gamesPlayed-1);
        RT.drawString(gamesPlayedString,350,200);
        RT.drawString("Player 1 Wins:",90,250);
        wins1String = Integer.toString(player1Wins);
        RT.drawString(wins1String,350,250);
        RT.drawString("Player 2 Wins:",90,300);
        wins2String = Integer.toString(player2Wins);
        RT.drawString(wins2String,350,300);
        RT.drawString("Games Drawn:",90,350);
        drawnString = Integer.toString(drawInt);
        RT.drawString(drawnString,350,350);
    }
}
