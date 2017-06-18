package com.seed;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Ball extends JFrame implements Runnable {
int x1=50,x2=50,x3=50;
	Ball()
	{
		setVisible(true);
		setSize(700,700);
		
	}
	
	
	@Override
	public void run() {
		
		
	}

	public void paint(Graphics g){
		super.paint(g);
		g.fillOval(x1, 50, 50, 50);
		g.fillOval(x2, 350, 50, 50);
		g.fillOval(x3, 550, 50, 50);
	}
public static void main(String[] args) {
	Ball b=new Ball();
	Thread t1=new Thread(b,"red");
	Thread t2=new Thread(b,"blue");	
	Thread t3=new Thread(b,"green");
}	

}
