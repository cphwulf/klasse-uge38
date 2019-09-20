package numberguess;

public class Anagram {
	public static void  main(String[] args) {
		boolean retBool = isAnagram("stop","pots");
		System.out.println(retBool);
	}
	public static boolean isAnagram(String s1, String s2) {
		boolean isA = true;
		if (s1.length() != s2.length()) {
			isA = false;
			return isA;
		}
		for (int i=0; i<s1.length();i++) {
			char s1c = s1.charAt(i);
			char s2c = s2.charAt((s1.length()-1)-i);
			System.out.printf("%c%n",s1c);
			System.out.printf("%c%n",s2c);
			if (s1c != s2c) {
				isA = false;
				return isA;
			}
		}
		System.out.println();
		return isA;
	}
}
