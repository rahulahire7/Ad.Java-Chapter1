import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="Customer.class" height=400 width=400></applet>

public class Customer extends JApplet
{
	//Variable for the panel
	JPanel pnl;
	JLabel lcnm;
	JLabel lccno;
	JLabel lcp;
	JLabel lcage;
	JTextField tcnm;
	JTextField tccno;
	JComboBox cmbcp;
	JTextField tcage;
	JButton btnaccept;

	public void init()
	{
		pnl = new JPanel();
		getContentPane().add(pnl);

		lcnm = new JLabel("Customer Name");
		lccno = new JLabel("Cell Number:");
		lcp = new JLabel("Package");
		lcage = new JLabel("Age");

		tcnm = new JTextField(30);
		tccno = new JTextField(20);
		tcage = new JTextField(15);
		String packages[] ={ "Executive", "Standard" };
		cmbcp = new JComboBox(packages);

		btnaccept=new JButton("Accept");

		pnl.add(lcnm);
		pnl.add(tcnm);
		pnl.add(lccno);
		pnl.add(tccno);
		pnl.add(lcage);
		pnl.add(tcage);
		pnl.add(lcp);
		pnl.add(cmbcp);
		pnl.add(btnaccept);

		pnl.setLayout(null);
		lcnm.setBounds(10, 10, 100, 20);
		tcnm.setBounds(120, 10, 100, 20);
		lccno.setBounds(10, 30, 100, 20);
		tccno.setBounds(120, 30, 100, 20);
		lcage.setBounds(10, 60, 100, 20);
		tcage.setBounds(120, 60, 100, 20);
		lcp.setBounds(10, 90, 100, 20);
		cmbcp.setBounds(120, 90, 100, 40);
		btnaccept.setBounds(150, 130, 60, 40);

		ValidateAction validateButton = new ValidateAction();
		abtaccept.addActionListener(ValidateButton);
	}
		class ValidateAction implements ActionListener
		{
			public void actionPerformed(ActionEvent evt)
			{
				//EXtracting source action
				Object obj = evt.getSource();
				if (obj == btnaccept)
				{
					//Retriving the customer ID from the text box
					String cutomerCellNo = textCustCellNo.getText();
					//Checking wheter the user has entered the valu
					if (customerCellNo.length() == 0)
					{
						//Displaying the error message on the status bar
						getAppletContext.showStatus("Customer Cell No.can not be empty");
						return;
					}
					else
					{
						//retriving the customer name from the textbox
						String cstomerName = tcnm.getText();
						//checking whether the user has entered a value
						if (customerName.length() == 0)
						{
							//Display the error message on the status bar
							getAppletContext().showStatus("Customer Name can not empty");
							return;
						}
						else
						{
							//Retriveing the customer age
							String custage = tcage.getText();
							if (custage.length() == 0)
						{
							//Display the error message on the status bar
							getAppletContext().showStatus("age should not be left blank");
						return;
						}
							else
							{
								int customerAge=Integer.parseInt(tcage.getText());
								if(customerAge<=0||customerAge>=100)
								{
									getAppletContext.showStatus("Invalid value for age");
									return;
								}
								getAppletContext().showStatus("");
							}
					}
				}
			}

			}
		}