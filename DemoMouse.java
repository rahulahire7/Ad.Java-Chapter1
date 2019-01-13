import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="DemoMouse.class" height=500 width=500></applet>
public class DemoMouse extends JApplet implements MouseListener
{
	JPanel pnl;	
	JLabel lbl;
	Font f1, f2;
	public void init()
	{
		System.out.println("Test1");
		setVisible(true);
		setSize(400,400);
		System.out.println("Test2");
		pnl = new JPanel();
		getContentPane().add(pnl);
		System.out.println("Test3");
lbl = new JLabel("Welcome");
f1 = new Font("Times New Roman", Font.BOLD, 32);
f2 = new Font("Times New Roman", Font.BOLD, 16);
lbl.addMouseListener(this);
	}
	public void mousePressed(MouseEvent e)
	{
		lbl.setForeground(Color.black);
	}
	public void mouseReleased(MouseEvent e)
	{ }
	public void mouseEntered(MouseEvent e)
	{
		lbl.setFont(f1);
	 }
	public void mouseExited(MouseEvent e)
	{
		lbl.setFont(f2);
		lbl.setForeground(Color.black);
	}
	public void mouseClicked(MouseEvent e)
	{ }
}
		