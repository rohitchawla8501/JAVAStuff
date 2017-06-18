package com.seed;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BasicSal extends JFrame implements ActionListener {
JLabel lblname,lblbasic,lblsalinhand,lbltotalsal,lblhra,lblpf,lblda,lbltax; 
JTextField tftname,tftbasic,totalsal,salinhand;	
JCheckBox cbhra,cbda,cbpf,cbtax;
JButton btncal;
BasicSal()
	{
	setVisible(true);
	setSize(700, 700);
	setLayout(new FlowLayout());
	 lblname=new JLabel("Name");
	 lblbasic =new JLabel("Basic salary");
	 lblsalinhand=new JLabel("Salary in hand");
	 lbltotalsal=new JLabel("Totalsalary");
     lblhra=new JLabel("HRA");
	 lblpf=new JLabel("PF");
	 lblda=new JLabel("DA");
	 lbltax=new JLabel("TAX");
	 tftname= new JTextField(40);
	 tftbasic= new JTextField(40);
	 totalsal= new JTextField(40);
	 salinhand= new JTextField(40);
	 cbhra=new JCheckBox();
	 cbda=new JCheckBox();
	 cbpf=new JCheckBox();
	 cbtax=new JCheckBox();
	 btncal= new JButton("Calculate");
	totalsal.setEditable(false);
	salinhand.setEditable(false);
	add (lblname);
	add(tftname);
	add(lblbasic);
	add(tftbasic);
	add(lblhra);
	add(cbhra);
	add(lblda);
	add(cbda);
	add(lbltotalsal);
	add(totalsal);
	add(lblpf);
	add(cbpf);
	add(lbltax);
	add(cbtax);
	add (lblsalinhand);
	add(salinhand);
	add (btncal);
	btncal.addActionListener(this);
	}




public static void main(String[] args) {
	new BasicSal();
}




@Override
public void actionPerformed(ActionEvent e) {
	if(tftname.getText().equals(""))
    {
    	JOptionPane.showMessageDialog(this, "Please enter name", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
	
	if(tftbasic.getText().equals(""))
    {
    	JOptionPane.showMessageDialog(this, "Please enter SALARY", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
	
	else{
	double totalsalary=Double.parseDouble(tftbasic.getText());
	double da,hra,temp,salaryinhand;
    double taxx=0;
	double pf=0;
    
	
	
	
	if(cbhra.isSelected())
	{
		double hraa=0.10*totalsalary;
	    totalsalary=totalsalary+hraa;
	}
	totalsal.setText(totalsalary+" ");
	if(cbda.isSelected())
	{
		 da=0.15*totalsalary;
	    totalsalary=totalsalary+da;
	}
	totalsal.setText(totalsalary+" ");
 temp=Double.parseDouble(totalsal.getText());
if(cbpf.isSelected()){
	 pf=0.12*temp;
	
}
if(cbtax.isSelected()){
	 taxx=0.02*temp;
}
 salaryinhand= temp-(pf+taxx);
salinhand.setText(salaryinhand+"");

	}
}






	
	}
	
	
	
	

