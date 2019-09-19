package numberguess;
import java.util.Scanner;

public class ComputeSum {
	public static void main(String[] args){
		/*
		* Opgave
		* 1) Lad brugeren indtaste et hel-tal mellem 100 og 999.
		* Lav en metode som returnerer den første tværsum (som er summen af de enkelte tal i
		* tallet)
		* exempel:
		* mitTal = 345
		* (hvor tværsummen så er 3 + 4 + 5, altså 11)
		*
		* Programmet skal udskrive flg:
		* Tværsummen er: 11
		*/
		// TODO: i maindelen skal der laves en brugerdialog og kald til metoden doMath
		
		int userInt = getUserInt();
		int sum = doMath(userInt);
	}
	public static int doMath(int number){
		// ex: 345
		//TODO: split number op i passende dele og udregn tværsummen
		
		return 12;
	}
	public static int getUserInt(){
		Scanner myScan = new Scanner(System.in);
		System.out.println("Indtast heltal:");
		int myInt = myScan.nextInt();
		return myInt;
	}
}
