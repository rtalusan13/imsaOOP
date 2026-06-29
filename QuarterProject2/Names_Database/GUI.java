import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.ArrayList;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class NameRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */ 
public class GUI extends JFrame
{
    public static void main(String[] args){
        GUI gui = new GUI();
        gui.pack();
        gui.setVisible(true);
    }
    public GUI(){
        JTextField f;
        
        JPanel p = new JPanel();
        f = new JTextField();
        f.setHorizontalAlignment(JTextField.RIGHT);
        add(f,BorderLayout.NORTH);
        
        JButton hello = new JButton("Welcome to my Name_Database");
        JButton blank = new JButton("");
        JButton b1 = new JButton("1: Increasingly popular names");
        JButton b2 = new JButton("2: Decade rank per name");
        JButton b3 = new JButton("3: Names only in one decade");
        JButton b4 = new JButton("4: Names in all decades");
        JButton b5 = new JButton("5: Names of a chosen rank");
        JButton b6 = new JButton("6: A graph for a name");
        JButton b7 = new JButton("7: Names only in 5-6 decades");
        JButton close = new JButton("Exit");
        
        hello.setForeground(Color.BLACK);
        b1.setForeground(Color.GREEN);
        b2.setForeground(Color.GREEN);
        b3.setForeground(Color.GREEN);
        b4.setForeground(Color.GREEN);
        b5.setForeground(Color.GREEN);
        b6.setForeground(Color.GREEN);
        b7.setForeground(Color.GREEN);
        close.setForeground(Color.GREEN);
        hello.setBackground(Color.WHITE);
        blank.setBackground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b2.setBackground(Color.BLACK);
        b3.setBackground(Color.BLACK);
        b4.setBackground(Color.BLACK);
        b5.setBackground(Color.BLACK);
        b6.setBackground(Color.BLACK);
        b7.setBackground(Color.BLACK);
        close.setBackground(Color.BLACK);
        
        Font myFont = new Font("Arial", Font.BOLD, 16);
        Font helloFont = new Font("Times New Roman", Font.BOLD, 16);
        hello.setFont(helloFont);
        b1.setFont(myFont);
        b2.setFont(myFont);
        b3.setFont(myFont);
        b4.setFont(myFont);
        b5.setFont(myFont);
        b6.setFont(myFont);
        b7.setFont(myFont);
        close.setFont(myFont);
        
        p.setLayout(new GridLayout(10,1));
        p.add(hello);
        p.add(blank);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(close);
        
        add(p,BorderLayout.CENTER);
        pack();
        setVisible(true);
        
        b1.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                Names rt = new Names();
                try
                {
                    rt.popularNames();
                }
                catch (FileNotFoundException fnfe)
                {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        b2.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                JFrame frame = new JFrame("2: Decade rank per name");
                String s = JOptionPane.showInputDialog(frame,"What name?");
                Names rt = new Names();
                try
                {
                    rt.singleName(s);
                }
                catch (FileNotFoundException fnfe)
                {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        b3.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                Names rt = new Names();
                try
                {
                    rt.singleDecade();
                }
                catch (FileNotFoundException fnfe)
                {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        b4.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                Names rt = new Names();
                try
                {
                    rt.allNamesDecades();
                }
                catch (FileNotFoundException fnfe)
                {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        b5.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                Names rt = new Names();
                JFrame frame = new JFrame("5: Names of a chosen rank");
                String j = JOptionPane.showInputDialog(frame,"What rank (1-999)?");
                try
                {
                    int s = Integer.parseInt(j);
                    if (s<1||s>999){
                        throw new NumberFormatException("Invalid rank. Please enter a number between 1 and 999.");
                    }
                    rt.singleRank(s);
                }
                catch (NumberFormatException b) {
                    JOptionPane.showMessageDialog(null, b.getMessage(), "Invalid Input", JOptionPane.ERROR_MESSAGE);
                } catch (FileNotFoundException fnfe) {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        b6.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                Names rt = new Names();
                JFrame frame = new JFrame("6: A graph for a name");
                String s = JOptionPane.showInputDialog(frame,"What name?");
                try
                {
                    rt.drawing(s);
                }
                catch (FileNotFoundException fnfe)
                {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        b7.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                Names rt = new Names();
                try
                {
                    rt.search();
                }
                catch (FileNotFoundException fnfe)
                {
                    fnfe.printStackTrace();
                }
            }
        }
        );
        close.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        }
        );
    }
}