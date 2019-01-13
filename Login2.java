import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Login2 extends JFrame implements ActionListener
{
JLabel lunm,lpass;
JTextField tunm;
JPasswordField tpass;
JButton blogin,breset;
JLabel lbl;
	public Login2()
	{
	super("Login Page");
	setSize(400,400);
	setVisible(true);
	setBackground(Color.red);

	lunm=new JLabel("User Name");
	lpass=new JLabel("Password");
	
	tunm=new JTextField(10);
	tpass=new JPasswordField(10);

	blogin=new JButton("Login");
	breset=new JButton("Reset");
	
	lbl=new JLabel("");
	setLayout(new GridLayout(4,2));
	add(lunm);
	add(tunm);
	add(lpass);
	add(tpass);
	add(blogin);
	add(breset);
	add(lbl);	

	blogin.addActionListener(this);
	breset.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==blogin)
	{
	int n=0;
	String msg="";	
	String s1=tunm.getText();
	String s2=tpass.getText();
	
	if(s1.equals("java"))
	{
	if(s2.equals("android"))
		{
		n=1;
		msg="Valid User";
		/*Home m=new Home();
		this.dispose();*/
		}
		else
		{
		msg="Invalid Pass";
		}
	}
	else
	{
		msg="Invalid Uname";
	}
	System.out.println(n);
	if(n==1)
	{
		lbl.setText(msg);
		lbl.setForeground(Color.green);
	}
	else
	{
	lbl.setText(msg);
	lbl.setForeground(Color.red);
	}
	}
}
}