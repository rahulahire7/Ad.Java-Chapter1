import java.applet.Applet;
import java.awt.*;
public class HomeApplet extends Applet
{
Font f = new Font("Helvetica", Font.BOLD + Font.ITALIC,30);
Font f1 = new Font("Helvetica", Font.ITALIC,20);
public void paint(Graphics g)
{
g.setFont(f);
g.drawString("MoneySaver Corporation", 100, 100);
g.setFont(f1);
g.drawString("MoneySaver Corporation is bank providing various services",40,150);
g.drawString("such as depositing and withdrawing money, and loan facility ", 40, 200);
g.drawString("to its customers. Bank has opened various branches all over ",40,250);
g.drawString("the world. Customers can visit the bank Website,", 40, 300);
g.drawString("MoneySaver.com for any queries.",40,350);
}
/*
<APPLET CODE = "HomeApplet.class" HEIGHT = 400 WIDTH = 600>
</APPLET>
*/
}
