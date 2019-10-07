package fr.dauphine.ja.fournierthomas.shapes;

public class BrokenLine {
	private Point [] data;
	int nbPoints=0;
	
	public BrokenLine(int capacity) {
		data=new Point[capacity];
	}
	
	public int pointCapacity() {
		return data.length;
	}
	
	public int nbPoints() {
		return nbPoints;
	}
	
	public int add(Point p) {
		if(nbPoints>=data.length) return -1;
		data[nbPoints++]=p;
		return 0;
		
	}
}
