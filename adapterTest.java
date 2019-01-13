import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class adapterTest extends JFrame implements ActionListener
{
	int X , Y ;
	String str;
	JButton b ; 
	JLabel l;	
		
	public adapterTest()
	{
		super("The Mouse Adapter");
getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel p =new JPanel();
		p.setLayout(new FlowLayout());
		
		l = new JLabel(str + X +  Y );
		getContentPane().add(l);
		
		b = new JButton("Quit");
		b.addActionListener(this);
		p.add(b);
		
		getContentPane().add(p);
		ListenerClass listen = new ListenerClass();
		addMouseListener(listen);
		setSize(300,300);
		setVisible(true);
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
		adapterTest f = new adapterTest();
      } 
}
class ListenerClass extends MouseAdapter
{		
	public void mouseClicked(MouseEvent me)
	{  
adapterTest AT;
AT = (adapterTest)me.getSource();           
         AT.l.setText("Mouse clicked at:" + me.getX()+ "," + me.getY());
	}
}