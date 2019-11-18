package fr.dauphine.ja.fournierthomas.iterables;

import java.util.*;

public class Panel extends AbstractList<Integer> implements Iterable<Integer> {
	private int x, y;
	public Panel(int x,int y) {
		if(y<x) throw new RuntimeException("Upper bound must be higher than lower bound");
		this.x=x;
		this.y=y;
	}
	public static Panel panel(int x, int y) {
		return new Panel(x,y);
	}
	public static Iterator<Integer> panel1(final int x, final int y){
		return new Iterator<Integer>(){
			private int it=x, upBound=y;
			public boolean hasNext() {
				if(it<=upBound) return true;
				return false;
			}
			public Integer next() {
				if(hasNext()) return it++;
				throw new RuntimeException("Iterator out ouf bounds");
			}
		};
	}
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>(){
			private int it=x, upBound=y;
			public boolean hasNext() {
				if(it<=upBound) return true;
				return false;
			}
			public Integer next() {
				if(hasNext()) return it++;
				throw new RuntimeException("Iterator out ouf bounds");
			}
		};
	}
	public int size() {
		return y-x+1;
	}
	public Integer get(int pos) {
		if(pos>=size() || pos<0) throw new RuntimeException("Out of bounds");
		return x+pos;
	}
	
	public static void main(String[] args) {
		List<Integer> l = new Panel(3,6);
		for(int i:l) {
			System.out.println(i);
		}
		System.out.println(l.get(1));
		
	}

}
