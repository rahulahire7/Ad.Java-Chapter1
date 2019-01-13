import java.awt.*;
import java.awt.event.*;
class DemoEvent extends Frame implements MouseListener
{
	Panel p;
	Button b1,b2;

	public DemoEvent()
	{
		super("Welcome");
		setVisible(true);
		setSize(400, 400);

		p = new Panel();
		add(p);
		b1 = new Button("Hi");
		p.add(b1);
		b2 = new Button("Bye");
		p.add(b2);

		b1.addMouseListener(this);
		b2.addMouseListener(this);
	}
	public void mouseExited(MouseEvent e)
	{
		p.setBackground(Color.yellow);
	}
	public void mouseEntered(MouseEvent e)
	{
		p.setBackground(Color.red);
	}
	public void mousePressed(MouseEvent e)
	{
		p.setBackground(Color.white);
	}	
	public void mouseReleased(MouseEvent e)
	{
		p.setBackground(Color.black);
	}
	public void mouseClicked(MouseEvent e)
	{
		p.setBackground(Color.pink);
	}	
		
		
		
	public static void main(String args[])
	{
		DemoEvent d = new DemoEvent();	
	}
}