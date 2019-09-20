package numberguess;
import java.util.Arrays;
public class LetterHist {
	public static void main(String[] args) {
		String myWord = "aaaajk";
		int[] myArr = letterHist(myWord.toLowerCase());
		printLet();
		
	}
	public static int[] letterHist(String word) {
		// a starts at 97, z  at 122
		int[] collector = new int[122-97+1];
		//int[] collector = new int[122];
		for (char a: word.toCharArray()) {
			int idx = a-97;
			//int idx = a;
			System.out.print(idx);
			System.out.println();
			System.out.print(a);
			System.out.println();
			collector[idx] = collector[idx]+1;
			
		}
		System.out.println(Arrays.toString(collector));
		return new int[] {1,2};
	}
	public static void printLet(){
		for (int i=97;i<123;i++) {
			System.out.printf("%3c",i);
		}
		System.out.println();
	}
	
}
