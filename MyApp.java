package awtDemo;
 
import java.awt.*;
import java.awt.event.*;
//RadioButton in AWT
class MyApp  extends Frame{

  static String operation=""; 
	Label l1,l2;
	Checkbox c1, c2;
	CheckboxGroup cbg;
 
	public MyApp() {
		super("Tutor Joes");
		setSize(1000,600);//w,h
		setLayout(null);
		setVisible(true);
 
 
		cbg = new CheckboxGroup();
 
		c1 = new Checkbox("Male",cbg,false);
		c1.setBounds(10, 50, 250, 30);
 
		l1 = new Label("Not Selected");
		l1.setBounds(300, 50, 600, 30);
 
		c2 = new Checkbox("Female",cbg,false);
		c2.setBounds(10, 100, 250, 30);
 
		l2=new Label("Not Selected");
		l2.setBounds(300,100,600,30);
 
		c1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				operation="Debit";
			}
		});
		c2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
 
				operation="Credit";
			}
		});
 
		add(c1);
		add(l1);
		add(c2);
		add(l2);
 
		//Close Button Code
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
public class app{
	public static void main(String[] args) {
		MyApp frm=new MyApp();
	}
 
}