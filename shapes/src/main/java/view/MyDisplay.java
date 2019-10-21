package view;

import javax.swing.JFrame;
import javax.swing.JPanel;


import model.*;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.*;

public class MyDisplay extends JPanel {
	
	private ArrayList<Shape> data=new ArrayList<Shape>();
	
	public void add(Shape p) {
		data.add(p);
	}
	public static void main(String[] args) {
		MyDisplay tmp=new MyDisplay();
		JFrame frame=new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tmp.add(new Ring(new Point(400,400),10,30));
		tmp.add(new Circle(new Point(100,200),30));
		MyDisplay d=new MyDisplay();
		frame.add(tmp);
	}
	
	@Override
	protected void paintComponent(Graphics arg0) {
		int width=(int)(arg0.getClipBounds().getWidth());
		int height=(int)arg0.getClipBounds().getHeight();
		for(Shape s:data) {
			s.draw(arg0);
		}
		
	}
}
