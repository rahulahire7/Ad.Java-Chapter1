import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class login extends Frame implements ActionListener
 
{
		Panel p;
		
		Label l2,l1;
		TextField t1,t2,t3;
		Button b1,b2;
		GridLayout g;
		Font f1;
	
		login()
		{
			super("Welcome");
			setVisible(true);
			setSize(2000,2000);
			p=new Panel();
			t1=new TextField(20);
			t2=new TextField(20);
			t3=new TextField(20);
			t1.setEchoCharacter('*');
			b1=new Button("Check");
			b2=new Button("Next");
			l1=new Label("Enter the password");
			l2=new Label(" The password is");
			g=new GridLayout(4,2);
			f1=new Font("Times New Roman",Font.PLAIN,28);
			add(p);
			p.add(l1);
			p.add(t1);
			p.add(b1);
			p.add(t3);
			p.add(l2);
			p.add(t2);
			p.add(b2);
			p.setLayout(g);	
			p.setBackground(Color.PINK);
			p.setFont(f1);
			p.setLayout(null);
			l1.setBounds(0,50,250,30);
			l1.setBackground(Color.PINK);
			t1.setBounds(280,50,240,30);
			t1.setBackground(Color.PINK);
			b1.setBounds(0,150,250,30);
			b1.setBackground(Color.PINK);
			t3.setBounds(280,150,240,30);
			t3.setBackground(Color.PINK);
			l2.setBounds(0,250,250,30);
			l2.setBackground(Color.PINK);
			t2.setBounds(280,250,240,30);
			t2.setBackground(Color.PINK);
			b2.setBounds(280,350,240,30);
			b2.setBackground(Color.PINK);
			
	
			b1.addActionListener(this);
			b2.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e)
		{
			String  s=new String("abc");
			if(e.getSource()==b2)
			{
				registrationform re=new registrationform();
		     }
			if(e.getSource()==b1)
			{
				
      				if(s.equals(t1.getText()))
				{
					t2.setText(t1.getText());
					String s1=new String("Login Successfully");
					t3.setText(s1);
				}
				else
				{
					t3.setText("Wrong password");
					t2.setText("Wrong entery");
					
				}
				 
				
			}
		
		}	
		public static void main(String args[])
		{
	 		login l=new login();
	 			
		}
}
		