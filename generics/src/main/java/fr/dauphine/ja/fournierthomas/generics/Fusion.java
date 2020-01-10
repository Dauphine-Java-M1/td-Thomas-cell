package fr.dauphine.ja.fournierthomas.generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Fusion {
	
	public static <T> List<T> fusion(List<? extends T> l1, List<? extends T> l2){
		if(l1.size()!= l2.size()) throw new RuntimeException("Not Same Size Lists");
		List <T> fusion= new LinkedList<T>();
		Iterator<? extends T> i1=l1.iterator();
		Iterator<? extends T> i2=l2.iterator();
		ListIterator<T> i=fusion.listIterator();
		while(i1.hasNext()) {
			i.add(i1.next());
			i.add(i2.next());
		}
		return fusion;
	}
	
	public static void main(String [] args) {
		List<String> l1= Arrays.asList("C", "rc");
		System.out.println("\nl1\n");
		Wild.print(l1);
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		System.out.println("\nl2\n");
		Wild.print(l2);
		List<? extends CharSequence> r1=fusion(l1,l2);
		System.out.println("\nr1\n");
		Wild.print(r1);
		List<?> r2=fusion(l1,l2);
		System.out.println("\nr2\n");
		Wild.print(r2);
		List<Integer> l3 = Arrays.asList(1,2);
		System.out.println("\nl3\n");
		Wild.print(l3);
		List<Integer> l4 = Arrays.asList(10,20);
		System.out.println("\nl4\n");
		Wild.print(l4);
		List<Integer> r3 = fusion(l3,l4);
		System.out.println("\nr3\n");
		Wild.print(r3);
		System.out.println("\nr4\n");
		List<?> r4 = fusion(l1,l3);
		Wild.print(r4);
	}
}
