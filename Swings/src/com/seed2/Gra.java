package com.seed2;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gra extends JFrame{
	

	JLabel lblusername;
	JPanel p1,p2;;
	JLabel lblpassword;
	JTextField txtusrname,txtpassword;
	
	
	
	Gra(){
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
		add(p1);
		add(p2);
		
	 
	
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawRect(350, 350, 65, 85);
		 g.setFont(new Font("Lucia Sand Unicode", Font.BOLD, 20));
		g.drawString("Rohit", 350, 350);
	    g.setFont(new Font("Lucia Sand Unicode", Font.BOLD, 580));
	}

public static void main(String[] args) {
	new Gra();
}

}
