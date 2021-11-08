package leetcodeinjava;

/**
 * 
 * Write a function that reverse a string. The input string is given as an array
 * of characters
 *
 */

public class ReverseString {

	public static void main(String[] args) {
		char[] peachArr = {'p','e','a','c','h'};
		char[] bananaArr = {'b','a','n','a','n','a'};
		char[] orangeArr = {'o','r','a','n','g','e'};
		char[] strawberryArr = {'s','t','r','a','w','b','e','r','r','y'};
		
		System.out.println(reverseString("peach"));
		System.out.println(reverseString("banana"));
		System.out.println(reverseString("orange"));
		System.out.println(reverseString("strawberry"));
		
		System.out.println(printResults(peachArr));
		System.out.println(printResults(bananaArr));
		System.out.println(printResults(orangeArr));
		System.out.println(printResults(strawberryArr));

	}
	
	/*
	 * Given a string
	 */

	private static String reverseString(String s) {
		int strLength = s.length();

		StringBuilder reversedString = new StringBuilder();

		while (strLength > 0) {
			reversedString.append(s.charAt(strLength - 1));
			strLength--;
		}

		return reversedString.toString();
	}
	
	/*
	 * Given a char array
	 */
	
	private static char[] reverseString(char[] c) {
		int leftPointer = 0;
		int rightPointer = c.length - 1;
		char tempChar;
		
		while (leftPointer < rightPointer) {
			tempChar = c[leftPointer];
			c[leftPointer] = c[rightPointer];
			c[rightPointer] = tempChar;
			rightPointer--;
			leftPointer++;
			
		}
		
		return c;
		
	}
	
	private static String printResults(char[] charArr) {
		char[] reverseStringArr = reverseString(charArr);
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < reverseStringArr.length;i++) {
			sb.append(reverseStringArr[i]);
		}
		
		return sb.toString();
		
	}
}
