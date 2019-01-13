import java.awt.*;
class TestCardLayout extends Frame
{
Panel p1,p2,p3;
	public TestCardLayout()
	{
		super("CardLayout");
		setSize(400,400);
		setVisible(true);

		p1=new Panel();
		p2=new Panel();
		p3=new Panel();

		p1.setBackground(Color.red);
		p2.setBackground(Color.yellow);
		p3.setBackground(Color.green);

		CardLayout c=new CardLayout();
		setLayout(c);

		add(p1);
		add(p2);
		add(p3);
		
	}
	public static void main(String args[])
	{
		TestCardLayout cd=new TestCardLayout();
					
	}
}