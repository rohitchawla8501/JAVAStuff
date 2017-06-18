package com.seed1;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class Handler extends MouseAdapter {
RGB ref;
	Handler(RGB ref)
	{
		this.ref=ref;
	}
	
	
	public void mouseClicked(MouseEvent e) {
	   try{
		int red=Integer.parseInt(ref.tftred.getText());
	    int green=Integer.parseInt(ref.tftgreen.getText());
	    int blue=Integer.parseInt(ref.tftblue.getText());
		
		ref.getContentPane().setBackground(new Color(red, green, blue));
	   }
	   catch(NumberFormatException f)
	   {
		   JOptionPane.showMessageDialog(ref, "Please enter integers");
	   }
	   catch(IllegalArgumentException z){
		   JOptionPane.showMessageDialog(ref, "Please enter in range");
	   }
	}



}
