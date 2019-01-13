import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//<applet code="LoginBox.class" height=400 width=400></applet>
public class LoginBox extends JApplet implements 
	ActionListener
{
	JPanel pnl;
	JLabel nm, pass;
	JTextField tnm;
	JPasswordField tpass;
	JButton b1, b2;
	GridLayout gl;

	public void init()
	{
		pnl = new JPanel();
		getContentPane().add(pnl);

		gl = new GridLayout(3, 2);
		pnl.setLayout(gl);

		nm = new JLabel("User Name:");
		tnm = new JTextField(10);

		pass = new JLabel("Password:");
		tpass = new JPasswordField(12);

		b1 = new JButton("Submit");
		b2 = new JButton("Reset");
		pnl.add(nm);
		pnl.add(tnm);
		pnl.add(pass);
		pnl.add(tpass);
		pnl.add(b1);
		pnl.add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b2)
		{
			tnm.setText("");
			tpass.setText("");
		}
		if(e.getSource()==b1)
		{

			String name = tnm.getText();
			String password = tpass.getText();
			if(name.length()==0)
			{
				JOptionPane.showMessageDialog(this, "Plz Enter u r Name:");
			}
			else if (password.length() == 0)
			{
				JOptionPane.showMessageDialog(this, "Plz Enter u r Password");
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Data Sumited");
			}
		}
	}



}
