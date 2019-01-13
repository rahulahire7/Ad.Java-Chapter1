import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public  class scroll1 extends Frame implements AdjustmentListener
{
	Panel p;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1,b2,b3,b4;
	GridLayout g;
	Font f;
	Scrollbar s1,s2,s3;
	public scroll1()
	{
		super("Wel-come");
		setSize(700,300);
		setVisible(true);
		g=new GridLayout(3,3);
		
		p =new Panel();
		p.setLayout(null);
		s1=new Scrollbar(Scrollbar.HORIZONTAL,5,1,100,255);
		s2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		s3=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		l1=new Label("PINK");
		l2=new Label("MAGENTA");
		l3=new Label("CYAN");
		f=new Font("Snap ITC",Font.BOLD+Font.ITALIC,26);
		add(p);
		p.setFont(f);
		p.setBackground(Color.BLACK);
		s1.setBounds(250,20,300,30);
		s2.setBounds(250,60,300,30);
		s3.setBounds(250,100,300,30);
		l1.setBounds(100,20,150,30);
		l2.setBounds(100,60,150,30);
		l3.setBounds(100,100,150,30);
		
		p.add(l1);
		p.add(s1);
		p.add(l2);
		p.add(s2);
		p.add(l3);
		p.add(s3);
		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);
		show();
	}
public void adjustmentValueChanged(AdjustmentEvent e)
{
	if(e.getSource()==s1)
	{
		Color c=new Color(s1.getValue(),s1.getValue()+1,s1.getValue()-1);
		
		p.setBackground(c);
		l1.setBackground(Color.PINK);
		l2.setBackground(Color.PINK);
		l1.setForeground(Color.BLACK);
		l3.setBackground(Color.PINK);
	}
	if(e.getSource()==s2)
	{
		Color c=new Color(s2.getValue(),0,0);
		p.setBackground(c);
		
	}
	if(e.getSource()==s3)
	{
		Color c=new Color(s3.getValue(),0,0);
		p.setBackground(c);
		
	}
}
public static void main(String args[])
	{
		scroll1 a=new scroll1();
	}
}