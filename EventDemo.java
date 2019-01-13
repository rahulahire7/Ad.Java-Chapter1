import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//<applet code="EventDemo.class" height="300" width="300"></applet>

public class EventDemo extends JApplet implements ActionListener
{
	JPanel p1;
	JButton b1,b2,b3;
	
	public void init()
	{
		p1=new JPanel();
		getContentPane().add(p1);
		
		b1=new JButton("Red");
		b2=new JButton("Green");
		b3=new JButton("Blue");
	
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource()==b1)
			p1.setBackground(Color.red);
		
		if(e.getSource()==b2)
			p1.setBackground(Color.green);

		if(e.getSource()==b3)
			p1.setBackground(Color.blue);
		
	}
}