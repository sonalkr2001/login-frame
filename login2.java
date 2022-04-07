import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class login2 //implements ActionListener
{
   JFrame jf;
   JTextField t1,t2;
   JButton b1,b2;
   JLabel l1,l2,l3 ;
   login2()
   {
     jf=new JFrame("LOGIN FORM");
	 t1=new JTextField();
	 t2=new JTextField();
	 Font fo=new Font("Arial",Font.BOLD,20);
	 t1.setFont(fo);
	 t2.setFont(fo);
	 b1=new JButton("Login");
	 b2=new JButton("Sign Up");
	 l1=new JLabel("User Id");
	 l2=new JLabel("Password");
	 l3=new JLabel("new user sign up ");
	 l3.setFont(fo);
	 l1.setFont(fo);
	 l2.setFont(fo); 
	 b1.setFont(fo);
	 b2.setFont(fo);
	 jf.setVisible(true);
	 jf.setLayout(null);
	 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 jf.getContentPane().setBackground(Color.green);
	 l1.setForeground(Color.red);
	 l2.setForeground(Color.red);
	 t1.setBackground(Color.blue);
	 t2.setBackground(Color.blue);
	 t1.setForeground(Color.red);
	 t2.setForeground(Color.red);
	 l3.setForeground(Color.blue);
	 b1.setBackground(Color.yellow);
	 b2.setBackground(Color.yellow);
	 b1.setForeground(Color.red);
	 b2.setForeground(Color.red);
	 jf.setResizable(false);
	 jf.setBounds(40,40,400,300);
	 l1.setBounds(20,30,100,40);
	 l2.setBounds(20,90,100,40);
	 t1.setBounds(140,30,200,40);
	 t2.setBounds(140,90,200,40);
	 l3.setBounds(100,150,300,20);
	 b1.setBounds(30,200,100,40);
	 b2.setBounds(200,200,120,40);
	 jf.add(l1);
	 jf.add(l2);
	 jf.add(l3);
	 jf.add(t1);
	 jf.add(t2);
	 jf.add(b1);
	 jf.add(b2);
	 }
	 public static void main(String ar[])
	 {
	  new login2();
	 }
	}
	
