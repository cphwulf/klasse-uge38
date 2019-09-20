package numberguess;
public class PineAp {
	public static void main(String[] args) {
		int[] myInt = {1,2,3,4};
	//	int retVal = pineapple(myInt, 45);
		int retVal = pineapple(new int[] {1,2,3,4}, 4);
		System.out.println(retVal);
	}
	
	public static int pineapple(int[] a, int apple) {
		int pear = 0;
		for (int pine: a) {
			System.out.print(pine);
			if (pine == apple) {
				pear++; }
		}
		System.out.println();
		return pear;
	}
}

