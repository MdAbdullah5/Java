import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class alphabets
{
  public static void main(String[] args)
  {
        JFrame f=new JFrame("Learn Alphabets");
        final JTextArea t=new JTextArea();
         t.setBounds(10,10,100,100);
         JButton a=new JButton("a");
          final JDialog d=new JDialog();
          d.setBounds(300,300,200,200);
          JLabel l=new JLabel();
          ImageIcon i=new ImageIcon("apple.jpg");
           l.setIcon(i);
           l.setText("this is an apple");
           l.setBounds(200,10,60,60);
           d.add(l);
         
         a.setBounds(120,10,50,50);
         a.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            { 
                
                t.setText("Apple");
                
                d.setVisible(true);

              
             }}       
         );
         //f.add(d);
         f.add(a);
         f.add(t);
         f.setSize(300,300);
         f.setLayout(null);
         f.setVisible(true);
}
}