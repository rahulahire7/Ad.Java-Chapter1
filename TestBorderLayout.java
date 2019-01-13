import java.awt.*;
class TestBorderLayout extends Frame
{
	public TestBorderLayout()
	{
		super("BorderLayout");
		setSize(400,400);
		setVisible(true);
		setBackground(Color.red);
		setLayout(new BorderLayout(5,5));
		add("South",new Button("First"));
		add("North",new Button("Second"));
		add("East",new Button("Third"));
		add("West",new Button("Four"));
	add("Center",new TextArea("Appears at the Center"));
	pack();
	}
	public static void main(String args[])
	{
TestBorderLayout t=new TestBorderLayout();
	}
}
