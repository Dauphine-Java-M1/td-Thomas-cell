package model;

import java.awt.Graphics;

import view.CircleDrawer;
import view.Drawer;

public class Circle extends Shape{
	private Point center;
	private double radius;
	private Drawer d;
	public Circle(double x, double y, double radius) {
		center=new Point(x,y);
		this.radius=radius;
		d=new CircleDrawer(this);
	}
	public Circle(Point p, double radius) {
		this(p.getX(), p.getY(), radius);
	}
	
	public Circle translate(double dx, double dy) {
		return new Circle(center.translate(dx, dy), radius);
	}
	public String toString() {
		String str="";
		str+="Circle : "+center+" ; radius="+radius+" ; surface="+surface();
		return str;
	}
	public boolean contains(Point p) {
		if(center.norm2(p)<=radius) return true;
		return false;
	}
	
	public Point getCenter() {
		return center;
	}
	public double getRadius() {
		return radius;
	}
	public double surface() {
		return Math.PI*radius*radius;
	}
	public boolean contains(Point p, Circle...circles) {
		for(Circle circ:circles) {
			if(circ.contains(p)) return true;
		}
		return false;
	}
	public void draw(Graphics arg0) {
		d.draw(arg0);
	}
	@Override
	public boolean equals(Object obj) {
		Circle p=(Circle)obj;
		if(center.equals(p.getCenter()) && radius==p.getRadius()) return true;
		return false;
	}
	public static void main(String [] args) {
		Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		
		Circle c2=new Circle(p,2);
		c2=c2.translate(1, 1);
		
		System.out.println(c+" "+c2);
		System.out.println(c.contains(new Point(2.0,2.0)));
		System.out.println(c.contains(new Point(0,0)));
		
	}
}
