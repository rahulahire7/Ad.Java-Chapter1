import java.awt.*;
import java.applet.*;
public class House extends Applet
{
	public void paint(Graphics g)
{
		g.drawLine(120,40,20,100);
		g.drawLine(120,40,220,100);
		g.drawRect(20,100,200,180);
		int x[] = {100,140,170,140,100,60,100};
		int y[] = {150,150,200,250,250,200,150};
		int n= 7;
		g.drawPolygon(x, y, n);
		g.drawOval(100,60,30,30);
		g.drawLine(310,120, 310,280);
		g.drawLine(340,120, 340,280);
		g.drawArc(280,80,150,150,90,120);
		g.drawArc(220,80,150,150,90,-120);
	}
/*	
<APPLET CODE="House.class" HEIGHT = 350 WIDTH = 450>
</APPLET>
*/
}
