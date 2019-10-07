package fr.dauphine.ja.fournierthomas.shapes;
import java.util.*;

public class Point{
	private int x,y;
	private static int cpt=0;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		cpt++;
	}
	public Point(Point pt) {
		this(pt.getX(), pt.getY());
	}
	public Point() {
		this(0,0);
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
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
		
		ArrayList<Point> list=new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}
	
}