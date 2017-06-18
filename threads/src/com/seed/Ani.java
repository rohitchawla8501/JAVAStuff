package com.seed;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Ani extends JFrame implements Runnable {
int x1=50;
int x2=620;
int y1=620;	
int y2=50;	
	Ani(){
		setVisible(true);
		setSize(700,700);
	}
	public void run(){
		while(true){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(x1<620 && x2>50){	
		if(Thread.currentThread().getName().equals("t1"))
			x1++;
		if(Thread.currentThread().getName().equals("t2"))
			x2--;
		}
		else{
			if(Thread.currentThread().getName().equals("t1"))
				y1--;
			if(Thread.currentThread().getName().equals("t2"))
				y2++;
		}
		
		
		
		repaint();
		}
	
	}
	
	public void paint(Graphics g){
		super.paint(g);
		if(x1<620&&x2>50){
		g.drawString("Rohit", x1, 300);
		g.drawString("Rahul", x2, 300);
		
		y1=620;
		y2=50;
		}
		
		else
	    {
	    	g.drawString("Rohit", y1 ,300);
			g.drawString("Rahul", y2, 300);
	        if(y1<51&&y2>621){
	        	x1=50;
	        	x2=620;
	        }
	    }
	}
public static void main(String[] args) {
	Ani a =new Ani();
	Thread t1= new Thread(a,"t1");
	Thread t2= new Thread(a,"t2");
   
	t1.start();
	t2.start();
      
}	



}
