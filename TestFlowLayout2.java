import java.awt.*;
class TestFlowLayout2 extends Frame
{
Panel p;
Button b1,b2,b3,b4;
	public TestFlowLayout2()
	{
	super("Demo Flow Layout");
	setSize(400,400);
	setVisible(true);

	p=new Panel();
	add(p);	
	
/*	FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
	p.setLayout(fl);*/
	
/*GridLayout gl=new GridLayout(2,2,5,5);
	p.setLayout(gl);
	*/


	TextArea ta=new TextArea(5,5);	
	b1=new Button("First");
	b2=new Button("Second");
	b3=new Button("Third");
	b4=new Button("Fouth");

CardLayout cl=new CardLayout();
p.setLayout(cl);
//p.add(ta,"");
p.add(b1,"");	
p.add(b2,"");	
p.add(b3,"");
p.add(b4,"");
	

/*BorderLayout bl=new BorderLayout(10,10);
p.setLayout(bl);

p.add(ta,BorderLayout.CENTER);
p.add(b1,BorderLayout.NORTH);	
p.add(b2,BorderLayout.SOUTH);	
p.add(b3,BorderLayout.EAST);
p.add(b4,BorderLayout.WEST);
*/
	}
	public static void main(String args[])
	{
		new TestFlowLayout2();
	}
	
}