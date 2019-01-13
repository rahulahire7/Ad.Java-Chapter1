import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TabPanel extends JFrame
{
Container container;
JTabbedPane tpane;
JPanel red = new JPanel();
JPanel green = new JPanel();
JPanel blue = new JPanel();
public TabPanel()
{
super("Tabbed Panel");
container = getContentPane();
JPanel jpanel = new JPanel(new GridLayout(1, 1));
red.setBackground(Color.red);
green.setBackground(Color.green);
blue.setBackground(Color.blue);

JTabbedPane tpane = new JTabbedPane();
tpane.addTab("RED", red);
tpane.addTab("BLUE", blue);
tpane.addTab("GREEN", green);
//tpane.setSelectedIndex(0);
jpanel.add(tpane);
container.add(jpanel);
setSize(350,400);
setVisible(true);
}
/* Creating an instance of JPanel. */
void makePane(String myString)
{
JPanel myPanel = new JPanel();
}
public static void main(String args[])
{
try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		TabPanel tabpanel = new TabPanel();
}
}
