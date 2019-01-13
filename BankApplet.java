import java.awt.*;
import java.applet.*;
/*<applet code="BankApplet.class" width="600" height="500"></applet>*/
public class BankApplet extends Applet
{
Label lbankName, blabel, lname, lemailadd, lsubject, lmessage;
TextField tfname, tfemailid, tfsubject;
Button submit, reset;
TextArea tamessage;
public void init()
{
/*Creating Instances of the Label class*/
lbankName=new Label(" MoneySaver Corporation");
blabel=new Label(" ");
lname=new Label("Name");
lemailadd=new Label("E-mail Address");
lsubject=new Label("Subject");
lmessage=new Label("Message");
/*Creating Instances of the TextField class*/
tfname=new TextField(10);
tfemailid=new TextField(10);
tfsubject=new TextField("Feedback",10);
/*Creating Instance of the Button class*/
submit = new Button("Submit");
reset = new Button("Reset");
/*Creating Instances of the TextArea class*/
tamessage = new TextArea("Type your text here");
/*Creating Instance of the Font class*/
Font f=new Font("Arial",Font.BOLD | Font.ITALIC,25);
Font f1=new Font("Arial",Font.BOLD | Font.ITALIC,14);
/*Applying font and color formats*/
lbankName.setFont(f); 
lname.setFont(f1);
lemailadd.setFont(f1);
lsubject.setFont(f1);
lmessage.setFont(f1);
/*Setting the GridLayout*/
setLayout(new GridLayout(6,2,8,8));
/*Adding AWT Components to the GridLayout*/
add(lbankName);
add(blabel);
add(lname);
add(tfname);
add(lemailadd);
add(tfemailid);
add(lsubject);
add(tfsubject);
add(lmessage);
add(tamessage);
add(submit);
add(reset);
}
}
