import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionTester extends JFrame implements 
ActionListener
{
	JButton b1,b2;
	JLabel l1;
	int clicked;

final String str="Number of Times button Clicked=";
	public ActionTester(String strName)
	{
		super(strName);
		getContentPane().setLayout(new FlowLayout());
		
		JPanel p=new JPanel();
		p.setBackground(Color.red);
		b1=new JButton("Click Me");
		b2=new JButton("Quit");	
		
		p.setLayout(new FlowLayout());
		p.add(b1);
		p.add(b2);
		getContentPane().add(p);
		//-------------------------------
		l1=new JLabel(str+clicked ,JLabel.CENTER);
		getContentPane().add(l1);
		//-----------------------------------
		//step3
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)//step4
	{
		String s=e.getActionCommand();
		System.out.println(s);
		if("Click Me".equals(s))
		{
			clicked++;
			l1.setText(str+clicked);
		}
		if("Quit".equals(s))
		{
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		ActionTester t=new ActionTester("Action Event");
		t.setSize(300,300);
		t.setVisible(true);
	}	
}
