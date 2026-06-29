import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * This class implements a calculator as a GUI.
 * 
 * @author (Raphael Talusan)
 * @version (11/17/23)
 */
public class Calculator extends JFrame
{
    JTextField f;
    String s1 = ""; //empty string
    String s2 = "";
    boolean add;
    boolean subtract;
    boolean multiply;
    boolean divide;
    /**
     * Constructor for objects of class GUI_Practice
     */
    public Calculator()
    {
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        f = new JTextField();
        f.setHorizontalAlignment(JTextField.RIGHT);
        add(f,BorderLayout.NORTH);
        JButton b1 = new JButton("1"); //0-9, multiply, divide, 
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton ba = new JButton("+");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton bs = new JButton("-");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bm = new JButton("*");
        JButton b0 = new JButton("0");
        JButton c = new JButton("C");
        JButton be = new JButton("=");
        JButton bd = new JButton("/");
        
        p.setLayout(new GridLayout(4,4));
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(ba);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bs);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bm);
        p.add(b0);
        p.add(c);
        p.add(be);
        p.add(bd);
        
        add(p,BorderLayout.CENTER);
        pack();
        setVisible(true); //need Action Listener
        b1.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                f.setText(f.getText()+"1");
            }
        }
        );
        b2.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                f.setText(f.getText()+"2");
            }
        }
        );
        b3.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                f.setText(f.getText()+"3");
            }
        }
        );
        b4.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                f.setText(f.getText()+"4");
            }
        }
        );
        b5.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                f.setText(f.getText()+"5");
            }
        }
        );
        b6.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                f.setText(f.getText()+"6");
            }
        }
        );
        b7.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                f.setText(f.getText()+"7");
            }
        }
        );
        b8.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                f.setText(f.getText()+"8");
            }
        }
        );
        b9.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                f.setText(f.getText()+"9");
            }
        }
        );
        b0.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                f.setText(f.getText()+"0");
            }
        }
        );
        ba.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                s1 = f.getText();
                f.setText("");
                add = true;
            }
        }
        );
        bs.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                s1 = f.getText();
                f.setText("");
                subtract = true;
            }
        }
        );
        bm.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                s1 = f.getText();
                f.setText("");
                multiply = true;
            }
        }
        );
        bd.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                s1 = f.getText();
                f.setText("");
                divide = true;
            }
        }
        );
        be.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                s2 = f.getText();
                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);
                Double d1 = new Double(num1);
                Double d2 = new Double(num2);
                if(add){
                    f.setText(""+(num1+num2));
                }
                if(subtract){
                    f.setText(""+(num1-num2));
                }
                if(multiply){
                    f.setText(""+(num1*num2));
                }
                if(divide){
                    f.setText(""+(d1/d2));
                }
            }
        }
        );
        c.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                    f.setText("");
                }
            }
        );
    }
}
