package fr.dauphine.ja.fournierthomas.threads;

import java.util.ArrayList;
import java.util.List;

public class MySafeList {
	private List<Double> data=new ArrayList<Double>();
	
	public synchronized void add(Double d) {
		data.add(d);
	}
	
	public double get(int i) {
		return data.get(i);
	}
	
	public int size() {
		return data.size();
	}
	public static boolean stressTest(int n, final int m) {
		final MySafeList msl=new MySafeList();
		List<Thread> l=new ArrayList<Thread>();
		for(int i=0; i<n; i++) {
			l.add(new Thread(new Runnable(){
				public void run() {
					for(int i=0; i<m; i++) {
						msl.add(0.0);
					}
				}
			}));
			l.get(i).start();
		}
		for(int i=0; i<n; i++) {
			try {
				l.get(i).join();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(msl.size()==n*m) {
			System.out.println(msl.size());
			return true;
		}
		return false;
	}
	public static void main(String [] args) {
		System.out.println(stressTest(2,1000));
	}
}
