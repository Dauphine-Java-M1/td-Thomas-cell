package fr.dauphine.ja.fournierthomas.generics;


public class Main {
	public static <T extends Comparable<T>> T myMax(T obj, T ... args) {
		T max=obj;
		for(T obj2:args) {
			if(obj2.compareTo(max)>0) max=obj2;
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println(myMax(65465,6567,634346,467987,4678,6769876,4567));
		System.out.println(myMax(8.6,16.64));
		System.out.println(myMax("baa", "aba"));
	}
}
