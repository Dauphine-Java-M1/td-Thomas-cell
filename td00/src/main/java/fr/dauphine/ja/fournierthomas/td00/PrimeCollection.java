package fr.dauphine.ja.fournierthomas.td00;
import java.util.*;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	private ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		numbers=new ArrayList<>();
	}
	public void initRandom(int n, int m) {
		Random gen=new Random();
		for(int i=0; i<n; i++) {
			numbers.add(gen.nextInt(m));
		}
	}
	public void initRandom(int n, int min, int sup) {
		Random gen=new Random();
		for(int i=0; i<n; i++) {
			numbers.add(gen.nextInt(sup-min)+min);
		}
	}
	public boolean isPrime(int p) {
		for(int i=2; i*i<p; i++) {
			if(p%i==0) return false;
		}
		return true;
		
	}
	public void printPrimes() {
		for(int i=0; i<numbers.size();i++) {
			if(isPrime(numbers.get(i))) {
				System.out.println(numbers.get(i));
			}
		}
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			String str="";
			for(int i=0; i<numbers.size(); i++) {
				str+=numbers.get(i);
				if(i<numbers.size()-1) str+=" ";
			}
			return str;
		}
    public static void main( String[] args )
    {
    	PrimeCollection pm=new PrimeCollection();
    	pm.initRandom(100,1,1000);
    	pm.printPrimes();
        
    }
}
