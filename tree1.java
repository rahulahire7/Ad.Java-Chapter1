import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import javax.swing.event.*;

public class tree1 extends JFrame implements  MouseListener// ,TreeExpansionListener
{
	JTree tree;
	Container c;
	DefaultMutableTreeNode top,a,a1,a2,a3,b,b1,b2;
	JTextField tf;
	tree1(){
	super("Tree");
	setVisible(true);
	setSize(400,400);
	c=getContentPane();
	
	 top=new DefaultMutableTreeNode("Options");
	tf=new JTextField(20);
	 a=new DefaultMutableTreeNode("APPLET");
	top.add(a);
	a1=new DefaultMutableTreeNode("HOUSE");
	a.add(a1);
	 a2=new DefaultMutableTreeNode("SMILYFACE");
	a.add(a2);
	 a3=new DefaultMutableTreeNode("SHAPES");
	a.add(a3);
	 b=new DefaultMutableTreeNode("GUI");
	top.add(b);
	 b1=new DefaultMutableTreeNode("PROJECT");
	b.add(b1);
	DefaultMutableTreeNode b2=new DefaultMutableTreeNode("MARKSHET");
	b.add(b2);
	tree=new JTree(top);
	int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
	int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
	JScrollPane jsp=new JScrollPane(tree,v,h);
	c.add(tf,BorderLayout.SOUTH);
	c.add(jsp,BorderLayout.CENTER);
	tree.addMouseListener(this);
	//a1.addTreeExpansionListener(this);
	//tree.addActionListener(this);
		
}


/*    private void jTree1ValueChanged(TreeSelectionEvent evt) {
	if   (tree.a1.value=="House")
	{
  		  c.setBackground(Color.CYAN);// TODO add your handling code here:
   	 }
}*/

   public void mouseClicked(MouseEvent e)
   {
	String s1="House";
   	TreePath tp=tree.getPathForLocation(e.getX(),e.getY());
	if(tp!=null)
	{
		
		tf.setText(tp.toString());	
	}
	else
	{
		tf.setText("");		
	}	
   }
public void mousePressed(MouseEvent e)
   {
   	
   }
  
   public void mouseReleased(MouseEvent e)
   {
   
   }

   public void mouseExited(MouseEvent e)
   {

   }
    public void mouseEntered(MouseEvent e)
   {
   	
   }
  public void actionPerformed(ActionEvent e)
{
		//smilyface f=new smliyface();
}
	
	public static void main(String args[])
	{
		tree1 t=new tree1();
	}
}