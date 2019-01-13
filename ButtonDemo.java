import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="ButtonDemo.class" width=250 height=150>
</applet>
*/

public class ButtonDemo extends Applet implements ActionListener
{
	Button b,b1;
	public void init()
	{
		b= new Button("Click here");
		add("Center", b);
		b1= new Button("Click");
		add("SOUTH", b1);	
		b.addActionListener(this);
		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		/*if(ae.getSource()==b)
		{
			b.setLabel(" Button clicked ");
		}*/
		
		Button source = (Button)ae.getSource();
		source.setLabel(" Button clicked ");
		
	}
}
