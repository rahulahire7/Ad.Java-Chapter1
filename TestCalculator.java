import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
public class TestCalculator implements ActionListener {
	JTextField ta1,ta2;
	JPanel jp1;
	JFrame jf1;
	GridLayout gl1;
	JButton[] jb=new JButton[12];
		public TestCalculator()
		{
			super();
			jf1=new JFrame();
			jp1=new JPanel();
			ta1=new JTextField(100);
			ta2=new JTextField(100);
			
			gl1=new GridLayout(4,4);
			jp1.setLayout(gl1);
			
			jf1.setSize(500,500);
			jf1.setVisible(true);
			jf1.add(BorderLayout.NORTH,ta1);
			jf1.add(BorderLayout.SOUTH,ta2);
			jf1.add(BorderLayout.CENTER,jp1);
			
			for(int i=0;i<10;i++)
			{
				jb[i]=new JButton(Integer.toString(i));
				jp1.add(jb[i]);
				jb[i].addActionListener(this);
			}
			jb[10]=new JButton("+");
			jb[11]=new JButton("-");
			jp1.add(jb[10]);
			jp1.add(jb[11]);
			jb[10].addActionListener(this);
			jb[11].addActionListener(this);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCalculator t=new TestCalculator();	
	}
	String taS;
	float ans=0f;
	String op="";
	float no1=0f,no2=0f;
	
	@Override

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if((e.getSource()==jb[10])||(e.getSource()==jb[11]))
		{
			if(op=="")
			{
			ans=(Float.parseFloat(ta1.getText()));
			}
			else
			{
				
			no1=(Float.parseFloat(ta1.getText()));
			}
				if(op=="+")
				{
					ans=ans+no1;
					ta2.setText(Float.toString(ans));
					//ans=0f;
					ta1.setText("");
				}
				if(op=="-")
				{
					ans=ans-no1;
					ta2.setText(Float.toString(ans));
					//ans=0f;
					ta1.setText("");
				}
				
			ta1.setText("");
			op=e.getActionCommand();
			//no=(Float.parseFloat(ta1.getText()));
		}
		if(e.getSource()==jb[0])
		{
			ta1.setText(ta1.getText()+e.getActionCommand());
		}
		if(e.getSource()==jb[1])
		{
			ta1.setText(ta1.getText()+e.getActionCommand());
		}
		if(e.getSource()==jb[2])
		{
			ta1.setText(ta1.getText()+e.getActionCommand());
		}
		if(e.getSource()==jb[3])
		{
			ta1.setText(ta1.getText()+e.getActionCommand());
		}
		if(e.getSource()==jb[4])
		{
			ta1.setText(ta1.getText()+e.getActionCommand());
		}
		if(e.getSource()==jb[5])
		{
			ta1.setText(ta1.getText()+e.getActionCommand());
		}
		if(e.getSource()==jb[6])
		{
			ta1.setText(ta1.getText()+e.getActionCommand());
		}
		if(e.getSource()==jb[7])
		{
			ta1.setText(ta1.getText()+e.getActionCommand());
		}
		if(e.getSource()==jb[8])
		{
			ta1.setText(ta1.getText()+e.getActionCommand());
		}
		if(e.getSource()==jb[9])
		{
			ta1.setText(ta1.getText()+e.getActionCommand());
		}
		
	}
	

}
