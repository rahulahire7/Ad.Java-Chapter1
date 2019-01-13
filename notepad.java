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
		m2=new Menu("Edit");
		m3=new Menu("Format");
		m4=new Menu("View");
		m5=new Menu("Help");
		m11=new MenuItem("New     Ctrl+N");
		m12=new MenuItem("Open    Ctrl+O");
		m13=new MenuItem("Save     Ctrl+S");
		m14=new MenuItem("Save as ");
		//m14.setmenuSeprator();
		m15=new MenuItem("Print      Ctrl+P");
		m16=new MenuItem("Exit");
		////////////
		m21=new MenuItem("Undo    Ctrl+Z");
		m22=new MenuItem("Cut      Ctrl+X");
		m23=new MenuItem("Copy   Ctrl+C");
		m24=new MenuItem("Paste   Ctrl+V");
		//m14.setmenuSeprator();
		m25=new MenuItem("Find      Ctrl+F");
		m26=new MenuItem("Go to     Ctrl+G");
		m31=new MenuItem("Wrodwrap........");
		m32=new MenuItem("Font");
		m41=new MenuItem("SatusBar");
		m51=new MenuItem("Help");
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
		m1.add(m15);
		m1.add(m16);
		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		m2.add(m24);
		m2.add(m25);
		m2.add(m26);
		m3.add(m31);
		m3.add(m32);
		m4.add(m41);
		m5.add(m51);
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		m.add(m5);
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
		