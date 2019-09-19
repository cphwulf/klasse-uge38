package numberguess;

/**
 *
 * @author thor
 */
public class AsciiArtTwo {
	public  static void main(String[] args) {
		doPyra();
	}
	public static void doPyra() {
		String myS = "#";
		String myC = "";
		String myE = "";
		myC = myC + myS;
		int cnt=7;
		for (int i=1;i<=6;i++) {
			cnt--;
			String format = "%"+cnt+"s%"+i+"s%n";
			System.out.printf(format,myE,myC);
			myC = myC + myS + myS ;
		}
		
		/*
		int cnt=0;
		while(cnt < 10){
		cnt++;
		System.out.println("#");
		}
		*/
		
		
	}
	
}