import java.awt.*;
import java.applet.*;

public class FLayoutMan extend Frame
{
	public FLayoutMan()
	{
		FlowLayout fl=new FlowLayout();	
		setLayout(fl);
		Button a,b,c;
		a = new Button("Add");
		b = new Button("Update");
		c = new Button("Delete");
		add(a);
		add(b);
		add(c);
	}
	public static void main(String args[])
	{
		FLayoutMan fl=new FLayoutMan();
	}
}
