package com.seed2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad extends JFrame implements ActionListener {
	String temp;
	JTextArea txtarea;
	JMenuItem cut,copy,paste;
	JMenu files,edit;
	JMenuBar jb;
	JScrollPane sp;

	Notepad()
	{
		setVisible(true);
		setSize(700,500);
	     
		txtarea=new JTextArea();
		cut=new JMenuItem("Cut");
		copy=new JMenuItem("Copy");
		paste=new JMenuItem("Paste");
		
		files = new JMenu("File");
		edit = new JMenu("Edit");
		jb =new JMenuBar();
		sp=new JScrollPane(txtarea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		
		jb.add(files);
		jb.add(edit);
		
		add(jb,"North");
		//add(txtarea);//dont need to add text area as it is contained in scroll pane
	    add(sp);
		cut.addActionListener(this);
	    copy.addActionListener(this);
	    paste.addActionListener(this);
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==cut)
		{
			txtarea.replaceRange("", txtarea.getSelectionStart(), txtarea.getSelectionEnd());	
		}
		if (e.getSource()==copy){
		temp=txtarea.getSelectedText();
		
		}
		if (e.getSource()==paste){
		txtarea.replaceRange(temp, txtarea.getSelectionStart(), txtarea.getSelectionEnd());	
		}
	}
	
public static void main(String[] args) {
	new Notepad();
}

}
