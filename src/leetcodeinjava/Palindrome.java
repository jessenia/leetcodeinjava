package leetcodeinjava;
/*
 * Determine whether an integer is a palindrome. An
 * integer is a palindrome when it reads the same backward as forward.
 */

public class Palindrome {
		

	public static void main (String[] args) {
		//TC #1 all integers less than 0 or  ending is 0 returns false
		System.out.println("N is -1. Expected Results is false. Actual result is " + isPalindrome(-1));
		System.out.println("N is 10. Expected Results is false. Actual result is " + isPalindrome(10));
		System.out.println("N is 1010. Expected Results is false. Actual result is " + isPalindrome(1010));		
		
		//TC #2 all palindromes return true
		System.out.println("N is 12321. Expected Results is true. Actual result is " + isPalindrome(12321));
		System.out.println("N is 1221. Expected Results is true. Actual result is " + isPalindrome(1221));
		
		//TC #3 non-palindromes return false
		System.out.println("N is 445. Expected Results is false. Actual result is " + isPalindrome(445));
		System.out.println("N is 8709. Expected Results is false. Actual result is " + isPalindrome(8709));
		System.out.println("N is 673409. Expected Results is false. Actual result is " + isPalindrome(8709));
		
	}
	
	public static boolean isPalindrome(int n) {
		int reversedNum, lastDigit;
		boolean isPalindrome;
		
		if (n < 0 || (n % 10 == 0 && n != 0)) {
			return false;
		}
		
		reversedNum = 0;
		while (n > reversedNum) {
			lastDigit = n % 10;
			reversedNum = reversedNum * 10 + lastDigit;
			n = n/10;
		}
		
		isPalindrome = (n == reversedNum || n == reversedNum/10);
		return isPalindrome;
	}
}
