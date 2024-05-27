import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="shop.class" width=300 height=300></applet>*/
class fruit
{
   String name;
   int price;
   fruit(String s,int p)
   {
       name=s;
       price=p;
   } 
}
public class shop extends Applet implements ActionListener
{
  fruit apple=new fruit("apple",10);
  fruit banana=new fruit("banana",5);
  Panel p1,p2,p3;
  TextField t1,t2,t3;
  Button b1,b2,b3,b4;
  String cmd="";
  public void init()
  {
     Button b1=new Button("apple");
     Button b2=new Button("banana");
     Button b3=new Button("cost");
     Button b4=new Button("clear");
     b1.addActionListener("this");
     b2.addActionListener("this");
     b3.addActionListener("this");
     b4.addActionListener("this");
     p1=new Panel();
     p2=new Panel();
     p3=new Panel();
     t1=new TextField(30);
     t2=new TextField(30);
     t3=new TextField(30);
     p1.add(t1);
     p1.add(t2);
     p1.add(t3);
     p2.add(b1);
     p2.add(b2);
     p3.add(b3);
     p3.add(b4);
     setLayout(new BorderLayout());
     add(p1,BorderLayout.NORTH);
     add(p2,BorderLayout.CENTER);
     add(p3,BorderLayout.SOUTH);
  }
  public void actionPerformed(ActionEvent ae)
  {
     c
     if()
  }      
  