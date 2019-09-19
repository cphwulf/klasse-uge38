package numberguess;
import java.util.Scanner;

public class ComputeSum2 {
	public static void main(String[] args){
		int userInt = getUserInt();
		int sum = doMath(userInt);
		System.out.println(sum);
	}
	public static int doMath(int number){
		// ex: 345
		int sum = 0;
		int diff = 1;
		int tmpVal,tmpRest, tmpSum;
		while(diff != 0) {
			tmpSum = sum;
			tmpRest = number %10;
			//5
			tmpVal = number / 10;
			// 34
			sum =sum + tmpRest;
			// 5
			diff = tmpSum - sum;
			number = tmpVal;
		}
		
		return sum;
	}
	public static int getUserInt(){
		Scanner myScan = new Scanner(System.in);
		System.out.println("Indtast heltal:");
		int myInt = myScan.nextInt();
		return myInt;
	}
}
