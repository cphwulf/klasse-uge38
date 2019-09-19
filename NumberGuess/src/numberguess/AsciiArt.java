package numberguess;
public class AsciiArt {
	public  static void main(String[] args) {
		String figur1 = "?";
		String figur2 = "#";
		doPyra(figur1,figur2);
		doPyra2();
	}
	public static void doPyra(String figur1,String figur2) {
		for (int i=0; i < 10;i++) {
			if (i%2==0) {
			System.out.print(figur1);
			} else {
			System.out.print(figur2);
			} 

		}
		System.out.println("");
		
		/*
		int cnt=0;
		while(cnt < 10){
		cnt++;
		System.out.println("#");
		}
		*/
		
		
	}
	public static void doPyra2() {
		int cnt = 0;
		int limit = 10;
		while (cnt < limit){
			cnt++;
			System.out.println("#");
		}
	}
	
}
