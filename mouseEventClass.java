import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="mouseEventClass.class" height=400 width=400></applet>
public class mouseEventClass implements MouseListener, ActionListener,MouseMotionListener
{
	String str = " ";
	int mX = 0 , mY = 0;
	JLabel l;
	JButton b;
	JFrame f;
	JPanel pmain;
   	public mouseEventClass()
	{
		f=new JFrame();
		f.setVisible(true);
		f.setSize(400,400);

		pmain =new JPanel();
		f.add(pmain);

		JPanel p =new JPanel();
		p.setLayout(new FlowLayout());
		l = new JLabel(str + mX + mY );
		p.add(l);
		b = new JButton("Quit");
		p.add(b);
		pmain.add(p);
		pmain.addMouseListener(this);
		pmain.addMouseMotionListener(this);
		b.addActionListener(this);
	}
   	public void mouseClicked(MouseEvent me)
	{
		mX = me.getX();
		mY = me.getY();
		str = "Mouse clicked at:";
		l.setText(str + mY + "," + mX);
		
	}		
	public void mousePressed(MouseEvent me)
	{
		mX = me.getX();
		mY = me.getY();
		str = "Mouse pressed at : ";
		l.setText(str + mX + "," + mY);
	}
       public void mouseReleased(MouseEvent me)
	{
		mX = me.getX();
		mY = me.getY();
		str = "Mouse Released at : ";
		l.setText(str + mX + "," + mY);
	}
       public void mouseEntered(MouseEvent me)
	{
		mX = me.getX();
		mY = me.getY();
		str = "Mouse entered at : ";
		l.setText(str + mX + "," + mY);
	}	
       public void mouseExited(MouseEvent me)
	{
		mX = me.getX();
		mY = me.getY();
		str = "Mouse Exited at : ";
		l.setText(str + mX + "," + mY);
	}
       public void mouseDragged(MouseEvent me)
	{
		mX = me.getX();
		mY = me.getY();
		str = "Mouse Dragged at : ";
		l.setText(str + mX + "," + mY);
	}
       public void mouseMoved(MouseEvent me)
	{
		Color c=new Color(me.getX(),100,me.getY());
		pmain.setBackground(c);
		mX = me.getX();
		mY = me.getY();
		str = "Mouse Moved at : ";
		l.setText(str + mX + "," + mY);
	}	
       public void actionPerformed(ActionEvent ae)
	{
		String s= ae.getActionCommand();
		if ( "Quit".equals(s))
		{
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		mouseEventClass e=new mouseEventClass();
	} 
}
