package model;

import java.awt.Graphics;

import view.Drawer;
import view.RingDrawer;

public class Ring extends Shape{
	private Circle extern;
	private double internRadius;
	private Drawer d;
	public Ring(Point p, double internRadius, double externRadius) {
		if(internRadius>externRadius) throw new RuntimeException("Intern Radius must be lower than extern radius");
		extern=new Circle(p, externRadius);
		this.internRadius=internRadius;
		d=new RingDrawer(this);
	}
	public Circle getExtern() {
		return new Circle(extern.getCenter(), extern.getRadius());
	}
	public double getInterRadius() {
		return internRadius;
	}
	
	public String toString() {
		String str="Ring : ";
		str+=extern.getCenter().toString()+" ; internRadius="+internRadius+" ; externRadius="+extern.getRadius();
		return str;
	}
	@Override
	public boolean equals(Object obj) {
		Ring rg=(Ring) obj;
		if(extern.equals(rg.getExtern()) && internRadius==rg.getInterRadius()) return true;
		return false;
	}
	public boolean contains(Point p) {
		if(extern.contains(p) && extern.getCenter().norm2(p)>=internRadius) return true;
		return false;
		
	}
	public void draw(Graphics arg0) {
		d.draw(arg0);
	}
	public boolean contains(Point p, Ring...rings) {
		for(Ring rg:rings) {
			if(rg.contains(p)) return true;
		}
		return false;
	}
	
	public static void main(String [] args) {
		Ring rg=new Ring(new Point(1,1), 8, 10);
		System.out.println(rg);
	}
}
