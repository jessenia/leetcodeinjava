package leetcodeinjava;

/*
 * Given an integer n, return the number of trailing zeroes in n factorial
 */

public class FactorialTrailingZeros {
	public static void main (String[] args){
		System.out.println(trailingZeroes(5));
		System.out.println(trailingZeroes(100));
		
		
	}
	
	private static int trailingZeroes(int n) {
		int count = 0;
		while (n > 0) {//1
			n /= 5;//1
			count += n;//1
		}
		return count;
	}

}
