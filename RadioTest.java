import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<Applet code="RadioTest.class" height=400 width=400></applet>

public class RadioTest extends Applet
{
	public void init()
	{
		CheckboxGroup c=new CheckboxGroup();
	Checkbox c1=new Checkbox("Black and White",c,false);
	Checkbox c2=new Checkbox("Color",c,true);

	c1.addMouseListener(new Check1());
	c2.addMouseListener(new Check2());
	add(c1);
	add(c2);

		Choice abc=new Choice();
		abc.add("Onida");
		abc.add("BPL");
		abc.add("Samsung");
		abc.add("Philips");
		abc.add("Vidiocon");

		abc.addItemListener(new ch());
		add(abc);
	}
	class Check1 extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
	showStatus("you have selected :Bacl & white TV");
		}
	}
	class Check2 extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
	showStatus("u have selected :Color TV");
		}
	}
	class ch implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			String s=(String)e.getItem();
			showStatus("U Have Selected  "+s+"  Brand");
		}
	}
}