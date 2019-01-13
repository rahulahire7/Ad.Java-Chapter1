import java.awt.*;
import java.applet.*;
public class DrawingHouse extends Applet
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
	}
/*	
<APPLET CODE="DrawingHouse.class" HEIGHT = 300 WIDTH = 300>
</APPLET>
*/
}
