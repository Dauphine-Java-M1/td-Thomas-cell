package model;

import java.awt.Graphics;
import java.util.*;

import view.BrokenLineDrawer;
import view.Drawer;
public class BrokenLine extends Shape{
	private ArrayList<Point> data=new ArrayList<Point>();
	private Drawer d;
	public BrokenLine() {
		d=new BrokenLineDrawer(this);
	}
	public int nbPoints() {
		return data.size();
	}
	public boolean contains(Point p) {
		Objects.requireNonNull(p, "p can't be null");
		for(Point pt: data) {
			if(p.equals(pt)) return true;
		}
		return false;
	}
	public void add(Point p) {
		Objects.requireNonNull(p, "you can't add a null point");
		data.add(p);
		
	}
	public Point get(int n) {
		if(n<0 || n>data.size()) throw new RuntimeException("Illegal index");
		return data.get(n);
	}
	public String toString() {
		String str="";
		for(Point p: data) str+=p.toString()+" ";
		return str;
		
	}
	public void draw(Graphics arg0) {
		d.draw(arg0);
	}
	public static void main(String [] args) {
		BrokenLine myBL=new BrokenLine();
		for(int i=0; i<10;i++) {
			myBL.add(new Point(i, i));
		}
		System.out.println(myBL.nbPoints());
		System.out.println(myBL);
		
	}
}
