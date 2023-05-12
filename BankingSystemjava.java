import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class BankingSystem extends JFrame implements ActionListener{
public static int acc_no, bal;
JFrame frame;
JLabel l1 = new JLabel("Account Number");
JLabel l2 = new JLabel("Current Balance");
JLabel l3 = new JLabel("Select Transaction");
JLabel l4 = new JLabel("Enter Transaction Amount");
JButton b1 = new JButton("Display Balance");
JButton b2 = new JButton("Transaction");
JButton b3 = new JButton("Exit");
JTextField tf1 = new JTextField(10);
JTextField tf2 = new JTextField(10);
JTextField tf3 = new JTextField(10);
JRadioButton rb1 = new JRadioButton("Debit");
JRadioButton rb2 = new JRadioButton("Credit");
ButtonGroup bg = new ButtonGroup();
BankingSystem(){
frame = new JFrame("Banking System");
addingComponents();
frame.setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(200, 400);
frame.setVisible(true);
}
void addingComponents(){
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
bg.add(rb1);
bg.add(rb2);
frame.add(l1);
frame.add(tf1);
frame.add(b1);
frame.add(l2);
frame.add(tf2);frame.add(l3);
frame.add(rb1);
frame.add(rb2);
frame.add(l4);
frame.add(tf3);
frame.add(b2);
frame.add(b3);
}
public void actionPerformed(ActionEvent ae){
JButton b = (JButton)ae.getSource();
if(b == b3){
System.exit(0);
}
else if(b == b1){
int t1 = Integer.parseInt(tf1.getText());
if(t1 == BankingSystem.acc_no){
tf2.setText(Integer.toString(BankingSystem.bal));
}
}
else if(b == b2){
if(rb1.isSelected()){
int t = Integer.parseInt(tf3.getText());
BankingSystem.bal -= t;
tf2.setText(Integer.toString(BankingSystem.bal));
}
else if(rb2.isSelected()){
int t = Integer.parseInt(tf3.getText());
BankingSystem.bal += t;
tf2.setText(Integer.toString(BankingSystem.bal));
}
else{
JOptionPane.showMessageDialog(frame, "Please select a transaction type.");
}
}
else{
JOptionPane.showMessageDialog(frame, "Error.");
}
}
public static void main(String[] args){
BankingSystem b = new BankingSystem();
BankingSystem.acc_no = 1;
BankingSystem.bal = 10;
}
} 