package in.nit.test;

public class junittest {
	
	public int square(int x) {
		return x*x;
	}
	public void countA(String word) {
		int count= 0;
		for(int i = 0; i < word.length();i++ ) {
			if(word.charAt(i)=='a' || word.charAt(i)=='A') {
				count++;
			}
		}
		return ;
	}
}
