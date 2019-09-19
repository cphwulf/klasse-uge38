/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author thor
 */
public class drawOne {
	public static void main(String[] args) {
		drawRow();
		drawFig2();
		drawSeries();
		/*
		drawSeries2();
		drawSeries3();
		drawFig();
		*/
	}
	public static void drawRow() {
		// udskriv 1  4  9  16  25  36  49  64  81  100
		// med et for-loop
		// udvid fra:
		// 0  1  2  3  4  5  6  7  8  9
		// 1  2  3  4  5  6  7  8  9  10
		// 0  2  6  12  20  30  42  56  72  90
		// 1  3  7  13  21  31  43  57  73  91
		// 1  4  9  16  25  36  49  64  81  100
		for (int i = 0;i< 10;i++) {
			//int var = (2+i)*i + 1;
			int var = i;
			System.out.printf(" %d ",var);
		}
	}
	public static void drawFig2() {
		/*
		Tegn flg figur med nestede loops
		1
		22
		333
		4444
		55555
		666666
		*/
		for(int i=0;i<7;i++) {
			for(int j=0;j<i;j++) {
				System.out.printf("%d",i);
			}
			System.out.println();
			
		}
	}
	public static void drawSeries() {
		for (int i=0;i<=5;i++) {
			System.out.printf("#");
			for (int j=0;j<=i;j++) {
				System.out.printf("@");
			}
			System.out.printf("#");
			System.out.println();
			
		}
		
	}
	public static void drawSeries2() {
		System.out.println("Pyra one");
		// figuren er i et grid hvor antal pladser = 2*antal linjer + 1
		// Så f.eks et 5 x 11 grid
		/*
		|    #    |
		|   ###   |
		|  #####  |
		| ####### |
		|#########|
		*/
		int max=4;
		//lav max linjer
		for (int i=0;i<=max;i++) {
			System.out.printf("|");
			// for hver linje fyld med flest tomme pladser ovenfra 
			for (int j=max;j>i;j--) {
				System.out.printf(" ");
			}
			for (int j=0;j<=(2*i);j++) {
				System.out.printf("#");
			}
			for (int j=max;j>i;j--) {
				System.out.printf(" ");
			}
			System.out.printf("|");
			System.out.println();
		}

	}
	public static void drawSeries3() {
		// figuren er i et grid hvor antal pladser = 2*antal linjer + 1
		// Så f.eks et 5 x 11 grid
		/*
		|#########|
		| ####### |
		|  #####  |
		|   ###   |
		|    #    |
		*/
		int max=4;
		//lav max linjer
		for (int i=0;i<=max;i++) {
			System.out.printf("|");
			// for hver linje fyld med færrest tomme pladser ovenfra 
			for (int j=0;j<i;j++) {
				System.out.printf(" ");
			}
			for (int j=2*max;j>(2*i-1);j--) {
				System.out.printf("#");
			}
			for (int j=0;j<i;j++) {
				System.out.printf(" ");
			}
			System.out.printf("|");
			System.out.println();
		}

	}
	public static void drawFig() {
		for (int line = 1; line <= 5; line++) {
			for (int i = 1; i <= (line - 1); i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= (11 - 2 * line); i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
