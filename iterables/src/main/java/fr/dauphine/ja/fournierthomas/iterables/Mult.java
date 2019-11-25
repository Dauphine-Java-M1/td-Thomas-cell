package fr.dauphine.ja.fournierthomas.iterables;
import java.util.*;
public class Mult {
	public static List<Integer> mult(final int x, final List<Integer> l){
		return new AbstractSequentialList<Integer>() {
			private int multi=x;
			private List<Integer> data=l;

			@Override
			public ListIterator<Integer> listIterator(final int arg0) {
				return new ListIterator<Integer>(){
					ListIterator<Integer> it=data.listIterator(arg0);
					public boolean hasNext() {
						
						return it.hasNext();
					}

					public Integer next() {
						// TODO Auto-generated method stub
						return it.next()*multi;
					}

					public void add(Integer arg0) {
						it.add(arg0/multi);
						
					}

					public boolean hasPrevious() {
						return it.hasPrevious();
					}

					public int nextIndex() {
						return it.nextIndex();
					}

					public Integer previous() {
						return it.previous()*multi;
					}

					public int previousIndex() {
						return it.previousIndex();
					}

					public void remove() {
						it.remove();
						
					}

					public void set(Integer arg0) {
						it.set(arg0/2);
						
					}
					
				};
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return data.size();
			}
			
		};
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 1000000; i++) {al.add(i);}
		long t0 = System.nanoTime();
		List<Integer> ret = Mult.mult(2, al);
		long sum=0;
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i = 0; i < 1000000; i++) {
			ll.add(i);
			}
		t0 = System.nanoTime();
		sum=0;
		ret = Mult.mult(2, ll);
		for(int val : ret) {
			sum+=val/2;
			}
		
		System.out.println((System.nanoTime() - t0));
	}
	
}
