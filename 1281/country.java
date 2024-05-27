import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class country
{
     public static void main(String[] args)
     {
        JFrame f=new JFrame();
        ImageIcon i1=new ImageIcon("german_attire.jpg");
        ImageIcon i2=new ImageIcon("american_attire.jpg");
        ImageIcon i3=new ImageIcon("china_attire.jpg");
        ImageIcon i4=new ImageIcon("canada_attire.jpg");
        ImageIcon i5=new ImageIcon("indian_attire.jpg");
        JButton b1=new JButton(i2);
        JButton b2=new JButton(i1);
        JButton b3=new JButton(i4);
        JButton b4=new JButton(i3);
        JButton b5=new JButton(i5);
        b5.setBounds(200,200,60,60);
        JTextField t=new JTextField();
        t.setBounds(50,50,50,50);
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JDialog g=new JDialog();
        JDialog a=new JDialog();
         
        
        p2.setLayout(new GridLayout(5,1));
        p2.setBounds(0,110,500,500);
        JDialog d1=new JDialog();
       
  
         p2.add(b1);
          p2.add(b2);
          p2.add(b3);
          p2.add(b4);
          p2.add(b5);
          f.add(t);
          f.add(p2);
          f.setSize(800,800);
          f.setLayout(new BorderLayout());
           f.setVisible(true);
        
     }
}