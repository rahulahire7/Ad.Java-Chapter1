import java.awt.*;
import java.awt.event.*;//step1
class DemoAction extends Frame implements ActionListener//step2
{
	Panel p1;
	Button b1,b2;
	public DemoAction()
	{
		super("Action Event");
		setSize(400,400);
		setVisible(true);

		p1=new Panel();
		p1.setBackground(Color.yellow);
		add(p1);
		b1=new Button("Hiii");
		b2=new Button("Bye");

		p1.add(b1);
		p1.add(b2);

		//step3-register event
		b1.addActionListener(this);
		b2.addActionListener(this);

		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			p1.setBackground(Color.red);
		}
		if(e.getSource()==b2)
		{
			p1.setBackground(Color.blue);
		}
	}
	public static void main(String args[])
	{
		DemoAction d=new DemoAction();
	}
}