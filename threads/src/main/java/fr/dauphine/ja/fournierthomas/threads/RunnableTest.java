package fr.dauphine.ja.fournierthomas.threads;

import java.util.concurrent.locks.ReentrantLock;

public class RunnableTest implements Runnable {
	private int Id;
	private int cpt=0;
	private static int n=0;
	private static final ReentrantLock lock=new ReentrantLock();
	public RunnableTest(int i) {
		Id=i;
	}
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			lock.lock();
			try {
				if(n>=10000) break;
				else{
					lock.lock();
					try{
						n++;
						cpt++;
						System.out.println("Je suis le Thread d'Id "+Id+" à l'itération "+n+" mon cpt="+cpt);
					}finally {
						lock.unlock();
					}
				}
			}finally {
				lock.unlock();
			}
		}
	}
	
	public static void main(String [] args) {
		Thread t1=new Thread(new RunnableTest(1));
		Thread t2=new Thread(new RunnableTest(2));
		t1.start();
		t2.start();
	}
	
}
