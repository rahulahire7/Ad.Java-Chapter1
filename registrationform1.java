import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class registrationform extends Frame implements ActionListener
{
        
    Label lti,lmn,lln,ladd,lem,lph,lfn,lgen;
    TextField tfn,tln,tag,tgen,tem,tph,tmn;
    TextArea tadd;
    Button b1,b2;
    Checkbox c1,c2;
    Panel p;
    Font f,f1;
     registrationform() 
		{
		super("Registration");
    		setSize(2000,2000);
    		setVisible(true);
    		f1=new Font("Times New Roman",Font.PLAIN,28);
    		p=new Panel();
		f=new Font("Times New Roman",Font.PLAIN,22);
		lti=new Label("Registration form");
		lti.setFont(f1);
		lfn=new Label("Enter the First Name:");
    		lmn=new Label("Enter the Middle Name:");
    		lln=new Label("Enter the Last Name:");
		ladd=new Label("Enter the Address:");
    		lgen=new Label("Choose the Gender:");
    		lem=new Label("Enter the Email-id :");
    		lph=new Label("Enter the Phoneno:");
    		tfn=new TextField(20);
    		tmn=new TextField(20);
    		tln=new TextField(20);
		tadd=new TextArea(5,10);
		tem=new TextField(20);
		tph=new TextField(20);
    		c1=new Checkbox("Mail");
		c2=new Checkbox("Femail");
		b1=new Button("Save");
		b2=new Button ("Exit");
		add(p);
		p.add(lti);
		p.add(lfn);
		p.add(tfn);
		p.add(lmn);
		p.add(tmn);
		p.add(lln);
		p.add(tln);
		p.add(ladd);
		p.add(tadd);
		p.add(lgen);
		p.add(c1);
		p.add(c2);
		p.add(lph);
		p.add(tph);
		p.add(lem);
		p.add(tem);
		p.add(b1);
		p.add(b2);
		p.setFont(f);
		p.setLayout(null);
		show();
		lti.setBounds(250,20,300,30);
		lfn.setBounds(0,60,230,20);
		tfn.setBounds(250,60,270,30);
		lmn.setBounds(0,100,250,20);
		tmn.setBounds(250,100,270,30);
		lln.setBounds(0,140,250,20);
		tln.setBounds(250,140,270,30);
		ladd.setBounds(0,180,250,20);
		tadd.setBounds(250,180,270,60);
		lgen.setBounds(0,240,250,20);
		c1.setBounds(250,240,260,30);
		c2.setBounds(510,240,550,40);
		lph.setBounds(0,300,250,20);
		tph.setBounds(250,300,270,30);
		lem.setBounds(0,340,250,20);
		tem.setBounds(250,340,270,30);
		b1.setBounds(120,380,140,30);
		b2.setBounds(280,380,180,30);
		lti.setForeground(Color.MAGENTA);
		lfn.setForeground(Color.MAGENTA);
		tfn.setForeground(Color.MAGENTA);
		lmn.setForeground(Color.MAGENTA);
		tmn.setForeground(Color.MAGENTA);
		lln.setForeground(Color.MAGENTA);
		tln.setForeground(Color.MAGENTA);
		ladd.setForeground(Color.MAGENTA);
		tadd.setForeground(Color.MAGENTA);
		lem.setForeground(Color.MAGENTA);
		tem.setForeground(Color.MAGENTA);
		lph.setForeground(Color.MAGENTA);
		tph.setForeground(Color.MAGENTA);
		lgen.setForeground(Color.MAGENTA);
		c1.setForeground(Color.MAGENTA);
		c2.setForeground(Color.MAGENTA);
		p.setBackground(Color.PINK);
		lti.setBackground(Color.PINK);
		lfn.setBackground(Color.PINK);
		tfn.setBackground(Color.PINK);
		lmn.setBackground(Color.PINK);
		tmn.setBackground(Color.PINK);
		lln.setBackground(Color.PINK);
		tln.setBackground(Color.PINK);
		ladd.setBackground(Color.PINK);
		tadd.setBackground(Color.PINK);
		lem.setBackground(Color.PINK);
		tem.setBackground(Color.PINK);
		lph.setBackground(Color.PINK);
		tph.setBackground(Color.PINK);
		lgen.setBackground(Color.PINK);
		c1.setBackground(Color.PINK);
		c2.setBackground(Color.PINK);
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			login l=new login();
		}
		if(e.getSource()==b2)
		{
		    setVisible(false);
		}
	}
	 public static void main(String[] args) 
    	{
       		 registrationform l=new  registrationform();	
    
    			
	}
  }  		
    		