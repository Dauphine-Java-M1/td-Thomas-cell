package fr.dauphine.ja.fournierthomas.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wild {
	public static <T extends Object> void print(List<T> list) {
		for(T o:list) System.out.println(o);
	}
	
	public static <T extends CharSequence> void printLength(List<T> list){
		for(T obj: list) System.out.println(obj.length());
	}
	
	public static List<?> listLength(List<? extends CharSequence> list) {
		ArrayList<Integer> length=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			CharSequence seq=list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	public static void main(String[] args) {
		List<String> list=Arrays.asList("foo", "toto");
		print(list);
		printLength(list);
		List<String> l=Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
	}
}
