package numberguess;
import java.util.Scanner;
import java.util.Arrays;

public class OnStrings2 {
	public static void main(String[] args) {
		String[] collector = new String[6];
		String prefCar = doDiag("Car");
		collector[0] = prefCar;
		String prefAnim = doDiag("Animal");
		collector[1] = prefAnim;
		String prefCountry = doDiag("Country");
		collector[2] = prefCountry;
		String prefTimeOfYear = doDiag("Season");
		collector[3] = prefTimeOfYear;
		System.out.println(prefCar);
		System.out.println(Arrays.toString(collector));
	}
	public static String doDiag(String str) {
		Scanner myScan = new Scanner(System.in);
		System.out.println("What is your favorite "+ str + "?");
		if (str.equals("Car")) {
			String myCar = myScan.nextLine();
			return myCar;
		}
		if (str.equals("Country")) {
			String myCountry = myScan.nextLine();
			return myCountry;
		}
		if (str.equals("Season")) {
			String mySeason = myScan.nextLine();
			return mySeason;
		}
		if (str.equals("Animal")) {
			String myAni = myScan.nextLine();
			return myAni;
		} else {
			return "No answer";
		}

		
	}
	
}
