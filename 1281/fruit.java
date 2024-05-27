import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="fruit.class" height=300 width=300></applet>*/
class item
{
  int price;
  String f;
  item(int r,String h)
  {
     price=r;
     f=h;
  }

}
public class fruit extends Applet implements ActionListener
{
      Panel p1,p2,p3;
      TextField t1,t2,t3;
      item a1=new item(5,"banana");
      item a2=new item(10,"apple");
      item a3=new item(20,"kiwi");
      Button b1,b2,b3,b4,b5;
      String cmd="";
      int tcost,u;
      public void init()
      {
         t1=new TextField(30);
         t2=new TextField(30);
         t3=new TextField(30);
         b1=new Button("Bananas");
         b2=new Button("Apples");
         b3=new Button("Kiwis");
         b4=new Button("cost");
         b5=new Button("clear");
         p1=new Panel();
         p2=new Panel();
         p3=new Panel();
         p1.add(t1);
         p1.add(t2);
         p1.add(t3);
         p2.add(b1);
         p2.add(b2);
         p2.add(b3);
         p3.add(b4);
         p3.add(b5);
   		setLayout(new BorderLayout());
         add(p1,BorderLayout.NORTH);
         add(p2,BorderLayout.CENTER);
 		add(p3,BorderLayout.SOUTH);
      }
      public void actionPerformed(ActionEvent ae)
      {
		cmd=ae.getActionCommand();
         if(cmd=="Bananas")
         {
             t1.setText(""+"banana/5");
              
         }
         if(cmd=="Apples")
         {
             t1.setText(""+"apple/10");
              
         }
         if(cmd=="Kiwis")
         {
             t1.setText(""+"apple/10");
              
         }
         /*if(cmd=="cost")
         {
             t2.setText(t2.getText());
             tcost=Integer.parseInt(t2.getText());
             u=tcost*item.price;
         }*/
      }
      
}
