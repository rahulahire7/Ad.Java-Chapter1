import java.awt.*;
class TestGridLayout extends Frame
{
	public TestGridLayout()
	{
		super("GridLayout Test");
		setSize(400,400);
		setVisible(true);
		
		setLayout(new GridLayout(3,4,10,10));
		for(int i=1;i<=12;i++)
		{
			add(new Button(""+i));
		}
	pack();
	}
	public static void main(String args[])
	{
		TestGridLayout t=new TestGridLayout();
	}
}