package fr.dauphine.ja.fournierthomas.iterables;
import java.util.*;
public class Mult {
	public static List<Integer> mult(final int x, final List<Integer> l){
		return new AbstractList<Integer>() {
			private int multi=x;
			private List<Integer> data=l;
			public Integer get(int pos) {
				return data.get(pos)*multi;
			}
			public int size() {
				return data.size();
			}
		};
	}
	
}
