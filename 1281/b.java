import java.awt.*;
import java.applet.*;
/*<applet code="b.class" width=300 height=300></applet>*/
public class b extends Applet
{
   int x,y;
   Image p;
   public void init()
   {
       p=getImage(getDocumentBase(),"apple.jpg");
   }	 
   
  public void paint(Graphics g)
  {
    g.drawImage(p,x,y,this);
  }
   
}
 

