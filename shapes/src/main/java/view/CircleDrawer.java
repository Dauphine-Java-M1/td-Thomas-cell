package view;

import java.awt.Color;
import java.awt.Graphics;

import model.Circle;
import model.Point;

public class CircleDrawer extends Drawer {
	private Circle data;
	
	public CircleDrawer(Circle cl) {
		data=cl;
	}
	@Override
	public void draw(Graphics arg0) {
		// TODO Auto-generated method stub
		Point p=data.getCenter();
		int tmp=(int) data.getRadius();
		arg0.fillOval((int)p.getX()-tmp,(int) p.getY()-tmp,tmp*2 , tmp*2);
	}

}
