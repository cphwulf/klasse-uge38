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
		double retVal = doLoop(6.0);
		System.out.printf("%.1f%n",retVal);
		
	}
	public static double doLoop(double val) {
		double diff = 1;
		double guess = val/2.0;
		double tol = 0.0001;
		while(diff > tol ) {
			System.out.println("guess "+ guess);
			double tmpGuess = guess;
			guess = ((guess + val/guess)/2.0 );
			diff = tmpGuess - guess;
		}
		return guess;
	}
}