import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="fact"  width=300  height=300></applet>*/
public class fact extends Applet implements ActionListener
{
    double d1=0.0, res=1;
    String cmd="";
    Panel p1,p2;
    TextField t1,t2;
    Button f,c;
    public void init()
    {
       t1=new TextField(30);
       t2=new TextField(30);
       f=new Button("fact");
       c=new Button("c");
       setLayout(new BorderLayout());
       f.addActionListener(this);
       c.addActionListener(this);
       p1=new Panel();
       p2=new Panel();
       p1.add(t1);
       p1.add(t2);
       p2.add(f);
       p2.add(c);
       add(p1,BorderLayout.NORTH);
       add(p2,BorderLayout.CENTER);
   }
   public void actionPerformed(ActionEvent ae)
   {
      cmd=ae.getActionCommand();
      t1.setText(t1.getText());
      d1=Double.parseDouble(t1.getText());
      if(cmd=="fact")
      {
         res=1;
         while(d1>=1)
         {
              res=res*d1;
              d1=d1-1;
         }
         t2.setText(""+res);
        
      }
      if(cmd=="c")
      {
           t1.setText("");
           t2.setText("");
      }
    }
}