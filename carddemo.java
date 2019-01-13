	import java.awt.*;
	import javax.swing.*;
	import java.awt.event.*;
//<applet code="carddemo.class" height="300" width="300"></applet>
	public class carddemo extends JApplet implements ActionListener
	{
		JPanel p1;
		JButton b1,b2,b3;
		CardLayout c;
		public void init()
		{
			p1=new JPanel();
			getContentPane().add(p1);
			
			b1=new JButton("ONE");
			b2=new JButton("TWO");
			b3=new JButton("THREE");

			c=new CardLayout();
			p1.setLayout(c);
			
			p1.add(b1);
			p1.add(b2);
			p1.add(b3);
						
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b1.setBackground(Color.red);					
			b2.setBackground(Color.blue);
			b3.setBackground(Color.green);
		}
		public void actionPerformed(ActionEvent e)
		{	
			if(e.getSource()==b1)
				c.next(p1);
				
			if(e.getSource()==b2)
				c.next(p1);
									
			if(e.getSource()==b3)
				c.next(p1);				
		}
	
	}
	
							
			
		