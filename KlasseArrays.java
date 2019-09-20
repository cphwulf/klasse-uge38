package numberguess;
import java.util.Arrays;
import java.util.Random;

public class KlasseArrays {
	public static void main(String[] args) {
		/*
		int[] myInArr = new int[23];
		int val = 0;
		System.out.println(val);
		System.out.println(Arrays.toString(myInArr));
		doMod(myInArr,val);
		System.out.println(val);
		String[] myStrArr = new String[23];
		System.out.println(Arrays.toString(myInArr));
		*/
		int searchItem = 12;
		int size = 100;
		int randRange = 100;
		int[] myArr = new int[size];
		System.out.println(Arrays.toString(myArr));
		doMod(myArr,randRange);
		System.out.println(Arrays.toString(myArr));
		int isInArr=searchInArr(myArr,searchItem);
		if (isInArr > 0) {
			System.out.println(searchItem + " is in array " + isInArr);
		} else {
			System.out.println(searchItem + " is not in array");
		}
		
	}
	public static int searchInArr(int[] myArr, int searchVal){
		boolean retValBool=false;
		int retValCount=0;
		
		// lav en tæller
		for (int i = 0; i<myArr.length;i++){
			if(myArr[i] == searchVal) {
				// tæl én op hver gang
				///retValBool = true;
				retValCount++;
			}
		}
		// returner tæller
		//return retValBool;
		return retValCount;
	}
	
	public static void doMod(int[] myLocalArr, int randRange){
		Random myRand = new Random();
		for (int i = 0;i < myLocalArr.length;i++) {
			int randInt = myRand.nextInt(randRange)+1;
			myLocalArr[i]=randInt;
		}
	}
	public static void doMod2(int[] myLocalArr, int val){
		myLocalArr[10]=123;
		val = 21;
		System.out.println(val);
		
	}
	
}
