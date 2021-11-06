package leetcodeinjava;

/**
 * 
 * Write a function that reverse a string. The input string is given as an array of characters
 *
 */

public class ReverseString {
	
	public static void main (String[] args) {
		System.out.println("peach / " + reverseString("peach"));
		System.out.println("banana / " + reverseString("banana"));
		System.out.println("orange / " + reverseString("orange"));
		System.out.println("strawberry / " + reverseString("strawberry"));

	}
	

	private static String reverseString(String s) {
		int strLength = s.length();
		
		StringBuilder reversedString = new StringBuilder();
		
		while (strLength > 0) {
			reversedString.append(s.charAt(strLength-1));
			strLength --;
		}
		
		return reversedString.toString();
	}
}
