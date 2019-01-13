import java.awt.*;
import javax.swing.*;
class MyTable extends JFrame
{
	Panel p;
	JTable table;
	public MyTable()
	{
		super("Test");
		setSize(400,400);		
		setVisible(true);
String[] columnNames = 
{"First Name","Last Name"};

Object[][] data = {{"Ramesh", "abc"},
		{"Suresh", "xyz"}
	            };

table = new JTable(data, columnNames);
p=new Panel();
add(p);
p.add(table);
}

public static void main(String args[])
{
	MyTable t=new MyTable();
}
}