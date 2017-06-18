package com.seed;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RGB extends JFrame implements MouseListener{


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
	this.addMouseListener( this);
	
	
	
	}
	public void mouseClicked(MouseEvent e) {
	    try{
		int red=Integer.parseInt(tftred.getText());
	    int green=Integer.parseInt(tftgreen.getText());
	    int blue=Integer.parseInt(tftblue.getText());
		
		this.getContentPane().setBackground(new Color(red, green, blue));
	    } 
		catch(NumberFormatException f)
		   {
			 JOptionPane.showMessageDialog(this, "Please enter integers only");
		   }
		   catch(IllegalArgumentException z){
			   JOptionPane.showMessageDialog(this, "Please enter in range");
		   }
	}
	
	
	
public static void main(String[] args) {
	new RGB();
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}
