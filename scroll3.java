import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public  class scroll3 extends Frame implements AdjustmentListener
{
	Panel p;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1,b2,b3,b4;
	GridLayout g;
	Font f;
	Scrollbar s1,s2,s3;
	public scroll3()
	{
		super("Wel-come");
		setSize(700,300);
		setVisible(true);
		g=new GridLayout(3,3);
		
		p =new Panel();
		p.setLayout(null);
		s1=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		s2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		s3=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		
		f=new Font("Snap ITC",Font.BOLD+Font.ITALIC,26);
		add(p);
		p.setFont(f);
		
		s1.setBounds(250,20,300,30);
		s2.setBounds(250,60,300,30);
		s3.setBounds(250,100,300,30);
		
		l1=new Label("0");
		l2=new Label("0");
		l3=new Label("0");
		l1.setBounds(100,20,150,30);
		l2.setBounds(100,60,150,30);
		l3.setBounds(100,100,150,30);
		l1.setBackground(Color.PINK);
		l2.setBackground(Color.PINK);
		l3.setBackground(Color.PINK);
	
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
	

	
	
		Color c=new Color(s1.getValue(),s2.getValue(),s3.getValue());
		
		p.setBackground(c);
		l1.setText(String.valueOf(s1.getValue()));
		l2.setText(String.valueOf(s2.getValue()));
		l3.setText(String.valueOf(s3.getValue()));
		
		
}
public static void main(String args[])
	{
		scroll3 a=new scroll3();
	}
}