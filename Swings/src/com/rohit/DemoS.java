package com.rohit;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DemoS extends JFrame {

	JLabel lblusername;
	JPanel p1,p2;;
	JLabel lblpassword;
	JTextField txtusrname,txtpassword;
	
	
	
	DemoS(){
		setVisible(true);
		setSize(700,700);
		lblusername = new JLabel("Username");
		lblpassword = new JLabel("Password");
	 txtusrname =new JTextField(50);
	 txtpassword =new JTextField(50);
	  p1=new JPanel()	;
	  p2=new JPanel()	;
	  p1.add(lblusername);
		p1.add(txtusrname);
		p2.add(lblpassword);
		p2.add(txtpassword);
		setLayout(new FlowLayout());
		
		
	 
	
	}
public static void main(String[] args) {
	new DemoS();
	
}	

}
