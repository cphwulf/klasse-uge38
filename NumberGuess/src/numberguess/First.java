package numberguess;
import java.util.Scanner;
public class First {
	public static void main(String[] args) {
		int myNum = 0;
		Scanner myScan = new Scanner(System.in);
		System.out.println("heltal:");
		if(myScan.hasNextInt()) {
			myNum = myScan.nextInt();
		}
		int rest=2;
		int num=0;
		while (myNum % rest != 0) {
			rest = rest + 1;
		}
		System.out.println(myNum + "s mindste divisor er: "+ rest);
	}
}