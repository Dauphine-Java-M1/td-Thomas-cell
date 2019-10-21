package model;
import java.awt.Graphics;
import java.util.*;

import view.Drawer;
import view.PointDrawer;

public class Point extends Shape{
	private Drawer d;
	private double x,y;
	private static int cpt=0;
	
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
		cpt++;
		d=new PointDrawer(this);
	}
	public Point(Point pt) {
		this(pt.getX(), pt.getY());
	}
	public Point() {
		this(0,0);
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public static int getCpt() {
		return cpt;
	}
	public void draw(Graphics arg0) {
		d.draw(arg0);
	}
	public Point translate(double dx, double dy) {
		return new Point(x+dx, y+dy);
	}
	public double norm2(Point p) {
		return Math.sqrt((x-p.getX())*(x-p.getX())+(y-p.getY())*(y-p.getY()));
	}
	public boolean isSameAs(Point pt) {
		if(x==pt.getX() && y==pt.getY()) return true;
		return false;
	}
	@Override
	public boolean equals(Object obj) {
		Point pt=(Point) obj;
		return isSameAs(pt);
	}
	@Override
	public String toString() {
		String str="";
		str+="("+x+","+y+")";
		return str;
	}
	public static void main( String[] args ) {
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		System.out.println(p1);
		p1.translate(1, 1);
		System.out.println(p1);
		ArrayList<Point> list=new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}
	
}