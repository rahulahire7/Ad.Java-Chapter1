import java.awt.*;
import java.applet.*;
/*
<Applet code = "GLayoutMan.class" width = 300 height = 100>
</Applet>
*/
public class GLayoutMan extends Applet 
{
	public void init()
	{
		GridLayout gl=new GridLayout(2,2,5,5);
		setLayout(gl);	
		add(new Button("Red"));
		add(new Button ("White"));
		add(new Button ("Green"));
		add(new Button ("Blue"));
		
	}
}
