package view;

import java.awt.Color;
import java.awt.Graphics;

import model.Circle;

public class Japan extends MyDisplay {
	

	protected void paintComponent(Graphics arg0) {
		int width=(int)(arg0.getClipBounds().getWidth());
		int height=(int)arg0.getClipBounds().getHeight();
		this.cleanse();
		int min=Math.min(width, height*2);
		this.add(new Circle(width/2, height/2, min/10));
		arg0.setColor(Color.RED);
		super.paintComponent(arg0);
	}
	
}
