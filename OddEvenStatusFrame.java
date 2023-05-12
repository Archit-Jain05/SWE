//
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class OddEvenStatusFrame extends Frame implements WindowListener, ActionListener{
Label lbl1,lbl2;
TextField tf1,tf2;
Button status,reset;
OddEvenStatusFrame()
{
  super("Odd And Even");
  lbl1=new Label("Enter Account Number:");
  lbl2=new Label("Status");
  tf1=new TextField(50);
  tf2=new TextField(30);
  status=new Button("Display Balance");
  reset=new Button("Exit");
  //Registration
  status.addActionListener(this);
  reset.addActionListener(this);
  //set FlowLayout
  setLayout(new FlowLayout());
  add(lbl1);
  add(tf1);
  add(lbl2);
  add(tf2);
  add(status);
  add(reset);
}
OddEvenStatusFrame(String title)
{

//Register the Listeners
addWindowListener(this);  // frame object has to register itself to listener
  //set window title using setTitle method
this.setTitle(title);  
setSize(300,300);      
this.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
  //System.out.println("Button Clicked");
  String str=ae.getActionCommand();
  System.out.println("Button "+str+" Clicked");
  tf2.setEditable(false);
  if(str.equals("Display Balance"))
  {
    int num=Integer.parseInt(tf1.getText());
    if(num==1)
    {
      tf2.setText("1000");
    }
    else if(num==2)
    {
      tf2.setText("2000");
    }
  }
  else
  {
    System.exit(0);
  }
}

public void windowClosing(WindowEvent we)  {
//hide the window when window's close button is clicked
System.out.println("Frame Closed");
this.setVisible(false);    
dispose();
//System.exit(0); 
}

public void windowActivated(WindowEvent we){}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}
public static void main(String args[]){
 OddEvenStatusFrame f1 = new OddEvenStatusFrame();
 f1.setVisible(true);
 f1.setSize(400,400);
} 
}