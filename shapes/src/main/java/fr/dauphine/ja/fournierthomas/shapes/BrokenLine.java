package fr.dauphine.ja.fournierthomas.shapes;

import java.util.*;
public class BrokenLine {
	private ArrayList<Point> data=new ArrayList<Point>();
	
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
	public String toString() {
		String str="";
		for(Point p: data) str+=p.toString()+" ";
		return str;
		
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
