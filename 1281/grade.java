import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="grade" height=300 width=300>
</applet>*/
public class grade extends Applet implements ActionListener{
double result(double ui,double vi,double wi){
double avg;
avg=(ui+vi+wi)/30;
return(avg);
}
Label l1,l2,l3;
double avg=1;
TextField t1,t2,t3,s;
Button b1,b2,b3;
Panel p1,p2,p3;
public void init(){
setLayout(new FlowLayout(FlowLayout.LEFT));
l1=new Label("enter marks ");
add(l1);
t1=new TextField(10);
add(t1);
t2=new TextField(10);
add(t2);
t3=new TextField(10);
add(t3);
b1=new Button("cal");
b2=new Button("clear");
b3=new Button("exit");
p1=new Panel();
p1.add(l1);
p1.add(t1);
p1.add(t2);
p1.add(t3);
add(p1,BorderLayout.NORTH);
l3=new Label("grade");
add(l3);
s=new TextField(30);
add(s);
p2=new Panel();
p2.add(l3);
p2.add(s);
p3=new Panel();
p3.add(b1);
p3.add(b2);
add(p2,BorderLayout.CENTER);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
add(p3,BorderLayout.SOUTH);
}
public void actionPerformed(ActionEvent a){
if(a.getSource()==b1){
double u=Double.parseDouble(t1.getText());
double v=Double.parseDouble(t2.getText());
double w=Double.parseDouble(t3.getText());
double res=result(u,v,w);
s.setText(String.valueOf(res));

}
if(a.getSource()==b2){
t1.setText("");
t2.setText("");
t3.setText("");
s.setText("");}
}
}
