package leetcodeinjava;

/*
 * Implement pow(x,n) which calculates x raised to the power of n (i.e. x^n)
 */

public class PowerOfXToTheN {
	public static void main(String[] args) {

		int count = 0;

		while (count <= 10) {
			System.out.println("Power of 3 to the  " + count + " is " + pow(3.0,count));
			count ++;
		}

	}

	private static double pow(double x, int n) {

		/*
		 * Case 1: N is divisible by 2
		 * This: 2^14 -> (2^2)^7 -> 4^7 
		 * Translates to: x^n	-> (x*x)^(n/2) -> (x^2)^(n/2)
		 *	
		 */

		double result = 1.0;
		long num = n;

		if (num < 0) {
			num *= -1;
		}

		while (num > 0) {

			if (num % 2 == 0) {
				x = x * x;
				num = num / 2;
			} else {
				result *= x;
				num = num - 1;
			}

			if (num < 0) {
				return 1.0 / result;
			}

		}

		return result;

	}
}
