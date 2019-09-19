package numberguess;
import java.util.Arrays;
import java.util.Random;
public class TestArrayTwo {
	
	public static void main(String[] args) {
		//
		String orderString = orderFlowers();
		String[] orderArr = orderString.split(";");
		System.out.println(Arrays.toString(orderArr));
		String[] myRetArr = extendOrderFlowers(orderArr, "Pølser");
		System.out.println(Arrays.toString(myRetArr));
		// fill with random ints
		int size = 100;
		int[] myArr = new int[size];
		initArray(myArr,size);
		System.out.println(Arrays.toString(myArr));
		
		// search for specific int
		int val = 4;
		int firstFound = lookForValInArr(myArr,val);
		if (firstFound >=0) {
			System.out.println("found: " + myArr[firstFound] + " at " + firstFound);
		} else {
			System.out.println("not found: " );
			
		}
		
		// compare two arrays
		int[] myArrSec = new int[size];
		initArray(myArrSec,size);
		int[] myArrThird = Arrays.copyOf(myArrSec,size);
		
		boolean isEqual = arrCompare(myArr,myArrSec);
		System.out.println(isEqual);
		isEqual = arrCompare(myArrThird,myArrSec);
		System.out.println(isEqual);
		
		mySortingOfArr2(myArr);
		// method that returns number of occurences in interval
		int a = numOfOccInInterval(myArr,0,10);
		System.out.println(a);
		int b = numOfOccInInterval(myArr,10,20);
		System.out.println(b);
		int c = numOfOccInInterval(myArr,20,30);
		System.out.println(c);
		int d = numOfOccInInterval(myArr,30,40);
		System.out.println(d);
		// improve this to be parametrizedkj
		int xDim = 10;
		int[] collector = new int[size/xDim];
		for (int i =0;i<(myArr.length/xDim);i++) {
			collector[i] = numOfOccInInterval(myArr,i*10,(i+1)*10);
		}
		System.out.println(Arrays.toString(collector));
		
		
		// method that sorts array
		//mySortingOfArr(myArr);
		//mySortingOfArr2(myArr);
		
		
		// method that returns historgram
		
		
	}
	public static boolean arrCompare(int[] myArr, int[] mySecArr ){
		if (myArr.length != mySecArr.length){
			return false;
		}
		for(int i = 0;i<myArr.length;i++) {
			if (myArr[i] != mySecArr[i]) {
				return false;
			}
		}
		return true;
	}
	public static int numOfOccInInterval(int[] myArr, int min, int max){
		int counter = 0;
		for (int i = 0;i<myArr.length;i++){
			if (myArr[i]>min && myArr[i] <= max) {
				counter++;
			}
		}
		return counter;
	}
	public static void mySortingOfArr2(int[] myArr) {
		int tmpVal = 0;
		//int[] tmpArr = new int[myArr.length]aa
		for (int j=0;j<myArr.length-1;j++) {
			for (int i = 0;i < myArr.length-1;i++) {
				if (myArr[i]>myArr[i+1]) {
					tmpVal=myArr[i];
					myArr[i]=myArr[i+1];
					myArr[i+1]=tmpVal;
				}
			}
			System.out.println(Arrays.toString(myArr));
		}
		//tmpArr[myArr.length-1]=myArr[myArr.length-1];
	}
	public static void mySortingOfArr(int[] myArr) {
		System.out.println(myArr);
		// 1 3 2 4 5 4 2
		int tmpVal = 0;
		int[] tmpArr = new int[myArr.length];
		for (int i = 0;i < myArr.length-1;i++) {
			if (myArr[i]>myArr[i+1]) {
				tmpVal=myArr[i];
				tmpArr[i]=myArr[i+1];
				myArr[i+1]=tmpVal;
			}
		}
		//tmpArr[myArr.length-1]=myArr[myArr.length-1];
		System.out.println(Arrays.toString(tmpArr));
		for (int i = 0;i < myArr.length-1;i++) {
			if (tmpArr[i]>tmpArr[i+1]) {
				tmpVal=tmpArr[i];
				tmpArr[i]=tmpArr[i+1];
				tmpArr[i+1]=tmpVal;
			}
		}
		System.out.println(Arrays.toString(tmpArr));
		for (int i = 0;i < myArr.length-1;i++) {
			if (tmpArr[i]>tmpArr[i+1]) {
				tmpVal=tmpArr[i];
				tmpArr[i]=tmpArr[i+1];
				tmpArr[i+1]=tmpVal;
			}
		}
		System.out.println(Arrays.toString(tmpArr));
		for (int i = 0;i < myArr.length-1;i++) {
			if (tmpArr[i]>tmpArr[i+1]) {
				tmpVal=tmpArr[i];
				tmpArr[i]=tmpArr[i+1];
				tmpArr[i+1]=tmpVal;
			}
		}
		System.out.println(Arrays.toString(tmpArr));
		for (int i = 0;i < myArr.length-1;i++) {
			if (tmpArr[i]>tmpArr[i+1]) {
				tmpVal=tmpArr[i];
				tmpArr[i]=tmpArr[i+1];
				tmpArr[i+1]=tmpVal;
			}
		}
		System.out.println(Arrays.toString(tmpArr));
	}
	
	public static int lookForValInArr(int[] myArr,int val) {
		int retInt=-1;
		for(int i = 0;i<myArr.length;i++){
			if (myArr[i]==val) {
				retInt = i;
			}
		}
		return retInt;
		
	}
	public static String orderFlowers() {
		return "roser,tulipaner;Ja til grønt;345;Otto Verner;Gyden 12;4500 Odense";
	}
	public static String[] extendOrderFlowers(String[] myArr, String addToOrder) {
		String[] myRetArr = new String[myArr.length+1];
		System.out.println(myRetArr.length);
		//now copy array content into new array
		for (int i = 0;i<myArr.length;i++){
			myRetArr[i] = myArr[i];
		}
		// add content to new array
		myRetArr[myRetArr.length-1] = addToOrder;
		return myRetArr;
	}
	public static void initArray(int[] myArr,int size) {
		Random myRand = new Random();
		for (int i=0;i<size;i++){
			myArr[i]=myRand.nextInt(size);
		}
	}
}
