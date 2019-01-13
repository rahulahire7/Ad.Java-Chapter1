import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//<applet code="DemoDialog.class" height=400 width=400></applet>
public class DemoDialog extends JApplet implements ActionListener
{
	JPanel pnl;
	JButton b1;

	public void init()
	{
		pnl = new JPanel();
		getContentPane().add(pnl);

		b1 = new JButton("Click Me");
		pnl.add(b1);

		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b1)
		{
			int result;
			result = JOptionPane.showConfirmDialog(this, "Continue???");
			switch (result)
			{
				case JOptionPane.YES_OPTION:
					showStatus("yes Button was Pressed...");
					break;
				case JOptionPane.NO_OPTION:
					showStatus("No Button was Pressed...");
					break;
				case JOptionPane.CANCEL_OPTION:
					showStatus("Cancel Button was Pressed...");
					break;
			}

		}
	}
}