import java.awt.*;
public class TestFlowLayout extends Frame
{
	//Panel pnl;
	String s[]={"One","Two","Three","Four","Five","Six","Seven","Eight"};
	public TestFlowLayout()
	{
		super("FlowDemo");
		setSize(400,400);
		setVisible(true);
		
		FlowLayout f1=new FlowLayout(FlowLayout.LEFT);		
		setLayout(f1);
		for(int i=0;i<s.length;i++)
		{
			add(new Button(s[i]));
		}
		
		
	}

	public static void main(String []args)
	{
		TestFlowLayout t=new TestFlowLayout();
	}
}