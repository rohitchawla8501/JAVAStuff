package com.seed1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RGB extends JFrame {
	JTextField tftred,tftblue,tftgreen;
	JLabel lblred,lblgreen,lblblue;
	RGB()
	{
		setVisible(true);
		setSize(700,700);
		setLayout(new FlowLayout());
		tftred=new JTextField(20);
		tftblue=new JTextField(20);
		tftgreen=new JTextField(20);
        lblred=new JLabel("RED");
        lblgreen=new JLabel("GREEN");
        lblblue=new JLabel("BLUE");
	
	add(lblred);
	add(tftred);
	add(lblgreen);
	add(tftgreen);
	add(lblblue);
	add(tftblue);
	Handler m=new Handler(this);
	
	this.addMouseListener(m);
	
	
	
	}
public static void main(String[] args) {
	new RGB();
}

}
