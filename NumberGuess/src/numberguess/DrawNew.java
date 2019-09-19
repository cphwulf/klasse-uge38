package numberguess;
import java.util.Scanner;
/**
 *
 * @author thor
 */
public class DrawNew {
	public static void main(String[] args){
		String myOrder = returnOrder
		String tilbehør = returnOrder2('L');
		String antal = returnOrder2('A');
		// 
		System.out.println(myOrder);
		String[] myArr = myOrder.split("&");
		System.out.println(myArr.length);
		for(int i=0;i < myArr.length;i++){
			System.out.println(myArr[i]);
		}
	}
	public static String returnOrder() {
		Scanner myScan = new Scanner(System.in);
		System.out.println("hvor mange pizzaer?");
		int numOfPizza = myScan.nextInt();
		System.out.println("Pizzaslags?");
		myScan.nextLine();
		String artOfPizza = myScan.nextLine();
		System.out.println("Ost/skinke");
		String addOnPizze = myScan.nextLine();
		//String returnVal = String.format("%d %s %s",numOfPizza,artOfPizza,addOnPizze);
		String returnVal = String.format("%d&%s&%s",numOfPizza,artOfPizza,addOnPizze);
		return returnVal;
	}
	public static String returnOrder2(char myChar) {
		if(myChar == 'L') {
			return "ost";
		}
	}
}