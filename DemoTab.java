import java.awt.*;
import javax.swing.*;

public class DemoTab extends JFrame
{
	JPanel p1, p2, p3;
	JTabbedPane t1;
	JLabel img;

	public DemoTab()
	{
		super("Welcome");
		setSize(400,400);
		setVisible(true);

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();

t1 = new JTabbedPane();
JLabel img = new JLabel(new ImageIcon("ganpati_bappa_moriya.jpg"));
JLabel img1 = new JLabel("");
JLabel img2 = new JLabel("");

		p1.add(img);
		p2.add(img1);
		p3.add(img2);

		t1.addTab("Welcome Form", p3);
		t1.addTab("Hi",p1);
		t1.addTab("Bye", p2);

		getContentPane().add(t1);
	}
	public static void main(String args[])
	{
		DemoTab d = new DemoTab();
	}
	}