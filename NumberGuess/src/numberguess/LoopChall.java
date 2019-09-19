/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package numberguess;

/**
 *
 * @author thor
 */
public class LoopChall {
	public static void main(String[] args) {
		double retVal = computeSquareRoot(7.0);
		System.out.printf("%.2f%n",retVal);
		int computedSum = computeSum(345);
		
	}
	public static double computeSquareRoot(double userInput){
	//x1 = (x0 + a/x0)/2	
	double tol = 0.001;
	double diff = 1;
	double guess = userInput/2;
	double tmpGuess = 0;

	while(diff > tol) {
		tmpGuess = guess;
		guess = (guess + userInput/guess)/2.0;
		diff = tmpGuess - guess;
	}
	return guess;
	}
	public static int computeSum(int userInput){

		int rest = 0;
		int sum = 0;
		while(userInput > 0) {
			//345
			// 34
			// 3
			rest = userInput % 10;
			// 5
			//4
			// 3
			sum = sum + rest;
			// 5 = 0 + 5
			// 9 = 5 + 4
			// 12 = 9 + 3
			userInput = userInput/10;
			// 34
			// 3
			// 0
		}
		return sum;
	}

}