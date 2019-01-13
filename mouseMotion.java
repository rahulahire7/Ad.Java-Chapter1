import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class mouseMotion extends JFrame implements 
MouseMotionListener,ActionListener
{
	String str = " ";
	int mX = 0 , mY = 0;
	JLabel l;
	JButton b;
	public mouseMotion(String strName)
	{
	super(strName);//f=new JFrame();
	getContentPane().setLayout(new FlowLayout());
		
		l = new JLabel(str + mX + mY );
		b = new JButton("Quit");
		add(l);
		add(b);
		addMouseMotionListener(this);
		b.addActionListener(this);
	}
   	public void mouseMoved(MouseEvent me)
	{
		Color c=new Color(me.getX(),me.getY(),125);
		getContentPane().setBackground(c);
		mX = me.getX();
		mY = me.getY();
		str = "Mouse Moving at:";
		l.setText(str + mY + " " + mX);
	}		

   	public void mouseDragged(MouseEvent me)
	{
		mX = me.getX();
		mY = me.getY();
		str = "Mouse Dragged at : ";
		l.setText(str + mX + " " + mY);
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
mouseMotion ME = new mouseMotion("MouseMotionEvents");
ME.setSize(300,300);
ME.setVisible(true);
	}
}
