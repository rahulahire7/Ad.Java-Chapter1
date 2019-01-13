import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AdapterTestClass extends JFrame implements ActionListener{
	
	int X , Y ;
	String str;
	JButton b ; 
	JLabel l;	
		
	public AdapterTestClass()
	{
super("The Mouse Motion Adapter");
getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));

JPanel p =new JPanel();
p.setLayout(new FlowLayout());

l = new JLabel(str + X +  Y );
getContentPane().add(l,"South");

b = new JButton("Quit");
b.addActionListener(this);
p.add(b);
getContentPane().add(p);
		
addMouseMotionListener(new ListenerClass());
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
			AdapterTestClass f = new AdapterTestClass();
	} 
}

class ListenerClass extends MouseMotionAdapter
{		
       
	public void mouseDragged(MouseEvent me)
	{  
            AdapterTestClass AT;
	AT = (AdapterTestClass)me.getSource();           
		AT.l.setText("Mouse draggeded at:" + me.getX()+ "," + me.getY());
		AT.l.setForeground(Color.red);
	}
}
