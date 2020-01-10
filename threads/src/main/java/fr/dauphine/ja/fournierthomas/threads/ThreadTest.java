package fr.dauphine.ja.fournierthomas.threads;

public class ThreadTest {
	static int n=0;
	static final Object monitor = new Object();
	public static Runnable getRunner(final int i) {
		return new Runnable(){
			int myI=i;
			int myCpt=0;
			public void run() {				
				while(true) {
					synchronized(monitor) {
						if(n>=10000)break;
						
						else {
							myCpt++;
							n++;
							System.out.println("Je suis le thread "+myI+" et j'exécute l'itération "+n+" myCpt="+myCpt);
						}
					}
				}
			}
		};
	}
	
	public static void main(String [] args) {
		Thread t1=new Thread(getRunner(1));
		Thread t2=new Thread(getRunner(2));
		t1.start();
		t2.start();
	}
}
