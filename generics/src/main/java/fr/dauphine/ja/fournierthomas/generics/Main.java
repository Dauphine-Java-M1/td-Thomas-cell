package fr.dauphine.ja.fournierthomas.generics;

import java.util.*;

public class Main {
	public static int maximum(int ...args) {
		int max=args[0];
		for(int n:args) {
			if(max<n) max=n;
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println(maximum(65465,6567,634346,467987,4678,6769876,4567));
	}
}
