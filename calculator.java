import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//<applet code="calculator.class" height=400 width=400></applet>
public class calculator extends JApplet implements ActionListener
{

	JPanel pnl;
	JButton b1, b2, b3, b4;
	JLabel lbl1, lbl2, lbl3;
	JTextField txt1, txt2, txt3;
	int n1, n2, ans;
	public void init()
	{
		pnl = new JPanel();
		getContentPane().add(pnl);
		b1 = new JButton("add");
		b2 = new JButton("sub");
		b3 = new JButton("mult");
		b4 = new JButton("div");
		JButton b5 = new JButton("res");
		lbl1 = new JLabel("FIRST NUMBER");
		lbl2 = new JLabel("SECOND NUMBER");
		lbl3 = new JLabel("ANSWER");
		txt1 = new JTextField(20);
		txt2 = new JTextField(20);
		txt3 = new JTextField(20);
		pnl.add(b1);
		pnl.add(b2);
		pnl.add(b3);
		pnl.add(b4);
		pnl.add(b5);

		pnl.add(lbl1);
		pnl.add(lbl2);
		pnl.add(lbl3);
		pnl.add(txt1);
		pnl.add(txt2);
		pnl.add(txt3);
		pnl.setLayout(null);
		lbl1.setBounds(50, 20, 150, 20);
		txt1.setBounds(200, 20, 100, 20);
		lbl2.setBounds(50, 40, 100, 20);
		txt2.setBounds(200, 40, 100, 20);
		lbl3.setBounds(50, 60, 100, 20);
		txt3.setBounds(200, 60, 100, 20);
		b1.setBounds(50, 100, 100, 20);
		b2.setBounds(160, 100, 100, 20);
		b3.setBounds(50, 130, 100, 20);
		b4.setBounds(160, 130, 100, 20);
		b5.setBounds(60, 170, 100, 20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()== b1)
		{
			int n1 = Integer.parseInt(txt1.getText());
			int n2 = Integer.parseInt(txt1.getText());
			int ans = n1 + n2;
			txt3.setText(String.valueOf(ans));
		}
		if (e.getSource()== b2)
		{
			int n1 = Integer.parseInt(txt1.getText());
			int n2 = Integer.parseInt(txt1.getText());
			int ans = n1- n2;
			txt3.setText(String.valueOf(ans));
		}

		if (e.getSource()== b3)
		{
			int n1 = Integer.parseInt(txt1.getText());
			int n2 = Integer.parseInt(txt1.getText());
			int ans = n1 * n2;
			txt3.setText(String.valueOf(ans));
		}
		if (e.getSource()== b4)
		{
			int n1 = Integer.parseInt(txt1.getText());
			int n2 = Integer.parseInt(txt1.getText());
			int ans = n1 / n2;
			txt3.setText(String.valueOf(ans));
		}
		if (e.getSource() == b5)
		{
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");

		}
	}
}