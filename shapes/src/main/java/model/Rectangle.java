package model;

import java.awt.Graphics;

import view.Drawer;
import view.RectangleDrawer;

public class Rectangle extends Shape {
	Point corner;
	double width,height;
	private Drawer d;
	
	public Rectangle(Point corner, double width, double length) {
		this.corner=corner;
		this.width=width;
		this.height=length;
		d=new RectangleDrawer(this);
		
	}
	public Rectangle(double x, double y, double width, double length) {
		this(new Point(x,y), width, length);
	}
	
	public Point getCorner() {
		return corner;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	@Override
	public void draw(Graphics arg0) {
		// TODO Auto-generated method stub
		d.draw(arg0);
	}

}
