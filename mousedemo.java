import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="mousedemo.class" height=400 width=400></applet>

public class mousedemo extends JApplet implements MouseListener
{
		JPanel p1;
		JLabel l1;
		Font f1,f2;
		public void init()
		{
			p1=new JPanel();
			getContentPane().add(p1);

			f1=new Font("TIMES NEW ROMAN",Font.BOLD,24);
			f2=new Font("TIMES NEW ROMAN",Font.BOLD,10);
			
			l1=new JLabel("NIIT CITY CENTER ");
			
		//	p1.setLayout(null);
			
			l1.addMouseListener(this);
			p1.add(l1);
	
			
		}
		 public void mousePressed(MouseEvent m)
		{
getAppletContent().showStatus("MOUSE PRESS AT:"+m.getX()+" "+m.getY());
		}
		public void mouseReleased(MouseEvent m)
		{
		
		}
		public void mouseEntered(MouseEvent m)
		{
		
		}
		public void mouseExited(MouseEvent m)
		{
		
		}
		public void mouseClicked(MouseEvent m)
		{
			
		}
		
}
