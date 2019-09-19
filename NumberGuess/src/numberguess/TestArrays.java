package numberguess;
import java.util.Arrays;

/**
 *
 * @author thor
 */
public class TestArrays {
	public static void main(String[] args) {
		// ex med array ud over limit
		String myOrder = orderFlowers();
		System.out.println(myOrder);
		String[] myOrderArr = myOrder.split(";");
		System.out.println(Arrays.toString(myOrderArr));
		String[] myAddOrderArr = new String[myOrderArr.length];
		System.out.println(myOrderArr.length);
		//extendMyOrder(myOrderArr)

		for (int i = 0;i<myOrderArr.length;i++) {
			System.out.println("At " + i + "har vi: " + myOrderArr[i]);
		}
		System.out.println(Arrays.toString(myAddOrderArr));
		//myAddOrderArr[6]="ekstra";

		

		// 

		/*
		int[] myList;
		myList = new int[8];
		myList[2] = 5;
		Arrays.fill(myList,1);
		System.out.println(Arrays.toString(myList));
		System.out.println(myList);
		String[] myListOfStrings = new String[12];
		myListOfStrings[1]="Anton";
		System.out.println(Arrays.toString(myListOfStrings));
		System.out.println(myListOfStrings);
		String[] copyOf;
		copyOf=myListOfStrings;
		System.out.println(copyOf);
		String[] copyOf2;
		copyOf2 = Arrays.copyOf(myListOfStrings, myListOfStrings.length);
		System.out.println(copyOf2);
		System.out.println(Arrays.toString(copyOf2));
		System.out.println("BEF " + Arrays.toString(myListOfStrings));
		doMod(myListOfStrings);
		System.out.println("AFTER:" +Arrays.toString(myListOfStrings));

		System.out.println("BEF " + Arrays.toString(myList));
		doMod2(myList);
		System.out.println("AFTER:" +Arrays.toString(myList));
*/
	}
	public static void doMod(String[] myArr) {
		myArr[2]="Viggo";
		System.out.println("in method:" +Arrays.toString(myArr));
	}
	public static void doMod2(int[] myArr) {
		int[] myArrLocal2 = Arrays.copyOf(myArr,myArr.length);
		//myArrLocal[2]=4;
		myArrLocal2[2]=4;
		//System.out.println("in method:" +Arrays.toString(myArr));
		//System.out.println("in method:" +Arrays.toString(myArrLocal));
		System.out.println("in method:" +Arrays.toString(myArrLocal2));
	}
	public static String orderFlowers() {
		return "roser,tulipaner;Ja til grønt;345;Otto Verner;Gyden 12;4500 Odense";

	}
}
