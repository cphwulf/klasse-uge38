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
public class ComputeSum3 {
	public static void main(String[] args) {
		int mySum = computeSum(345);
		System.out.println(mySum);
		
		
	}
	public static int computeSum(int userInput){
		int sum = 0;
		int rest = 0;
		while (userInput > 0) {
			// 345
			rest = userInput%10;
			// 5
			userInput = userInput/10;
			// 5 = 0 + 5
			sum = sum + rest;
		}
		return sum;
	}
	
}
