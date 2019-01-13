import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.applet.*;
//<applet code="scroll2" height=400 width=400></applet>
public  class scroll2 extends Applet implements AdjustmentListener
{
	Panel p;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1,b2,b3,b4;
	GridLayout g;
	Font f;
	Scrollbar s1,s2,s3;
	public void init()
	{
		
		
		
		s1=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,50);
		s2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,50);
		s3=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,50);
		l1=new Label("PINK");
		l2=new Label("MAGENTA");
		l3=new Label("CYAN");
		f=new Font("Snap ITC",Font.BOLD+Font.ITALIC,26);
		
		
		setBackground(Color.BLACK);
		
		setFont(f);
		add(l1);
		add(s1);
		add(l2);
		add(s2);
		add(l3);
		add(s3);
		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);
		
	}
public void paint(Graphics g)
{
s1.setBounds(250,20,300,30);
		s2.setBounds(250,60,300,30);
		s3.setBounds(250,100,300,30);
		l1.setBounds(100,20,150,30);
		l2.setBounds(100,60,150,30);
		l3.setBounds(100,100,150,30);
}
public void adjustmentValueChanged(AdjustmentEvent e)
{
	

	
	if(e.getSource()==s1)
	{
		setBackground(Color.PINK);
		l1.setBackground(Color.PINK);
		l2.setBackground(Color.PINK);
		l1.setForeground(Color.BLACK);
		l3.setBackground(Color.PINK);
	}
	if(e.getSource()==s2)
	{
		setBackground(Color.MAGENTA);
		l2.setBackground(Color.MAGENTA);
		l1.setBackground(Color.MAGENTA);
		l2.setForeground(Color.BLACK);
		l3.setBackground(Color.MAGENTA);
	}
	if(e.getSource()==s3)
	{
		setBackground(Color.CYAN);
		l3.setBackground(Color.CYAN);
		l1.setBackground(Color.CYAN);
		l2.setBackground(Color.CYAN);
		l3.setForeground(Color.BLACK);
		
	}
}

}