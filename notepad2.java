import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class notepad extends Frame implements ActionListener
{
	Panel p;
	MenuBar m;
	Menu m1,m2,m3,m4,m5;
	MenuItem m11,m12,m13,m14,m15,m16,m21,m22,m23,m24,m25,m26,m31,m32,m41,m51;
	JTextArea ta;
	notepad()	
	{
		super("Version undefined");		
		setVisible(true);
		setSize(2000,2000);
		ta=new JTextArea();
		add(BorderLayout.CENTER,ta);
		p=new Panel();
		m=new MenuBar();
		m1=new Menu("File");
		m11=new MenuItem("New     Ctrl+N");
		m12=new MenuItem("Open    Ctrl+O");
		m13=new MenuItem("Save     Ctrl+S");
		m14=new MenuItem("Save as ");
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
		m1.add(m15);
		m1.add(m16);
		m.add(m1);
		setMenuBar(m);
		show();
	m22.addActionListener(this);
	m24.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==m22)
		{
			ta.cut();				
		}
		if(e.getSource()==m24)
		{
			ta.paste();
		}
	}
	public static void main(String args[])
	{
		notepad n=new notepad();		
	}
}	
		