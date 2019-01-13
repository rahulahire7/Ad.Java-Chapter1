import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<Applet code="buttontest.class" height=400 width=400></applet>
public class buttontest extends Applet
{
	Label lb1 = new Label("BUTTON 1");
	Button b1 = new Button("OK");
	Label lb2 = new Label("BUTTON ");
	Button b2 = new Button("CANCEL");

	public void init()
	{
		setLayout(new GridLayout(2,2));
		
		b1.addActionListener(new b1());
		b2.addActionListener(new b2());
		add(lb1);
		add(b1);
		add(lb2);
		add(b2);
	}
	class b1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			getAppletContext().showStatus("BUTTON 1: OK CLICKED");
			setBackground(Color.red);
		}
	}
	class b2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			getAppletContext().showStatus("BUTTON 2: CANCEL CLICKED");

		}
	}
}
