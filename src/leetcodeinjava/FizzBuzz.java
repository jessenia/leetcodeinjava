package leetcodeinjava;

/*
 * Write a program that outputs the string representation of numbers from 1 to n. 
 * For multiples of three it should print "Fizz" instead of the number.
 * For multiples of five it should print "Buzz". 
 * For multiples of both three and five print "FizzBuzz".
 */

public class FizzBuzz {
	
	public static void main (String[] args) {
		int num;
		String resultsStr = new String();
		String[] resultsArr;
		
		//TC #1 int does not contian a multiple of 3 or 5 or both
		num = 2;
		resultsArr = new String[num];
		resultsArr = fizzBuzz(num);
		resultsStr =  printResults(resultsArr);
		System.out.println(resultsStr);
		
		
		
		//TC #2 int contains a multiple of 3 only
		num = 3;
		resultsArr = new String[num];
		resultsArr = fizzBuzz(num);
		resultsStr =  printResults(resultsArr);
		System.out.println(resultsStr);
		
		//TC #3 int is multiple of 5 only
		num = 5;
		resultsArr = new String[num];
		resultsArr = fizzBuzz(num);
		resultsStr =  printResults(resultsArr);
		System.out.println(resultsStr);		
		
		//TC #4 int contains multiple of both
		num = 15;
		resultsArr = new String[num];
		resultsArr = fizzBuzz(num);
		resultsStr =  printResults(resultsArr);
		System.out.println(resultsStr);		
		
		//TC #5 int is zero
		num = 0;
		resultsArr = new String[num];
		resultsArr = fizzBuzz(num);
		resultsStr =  printResults(resultsArr);
		System.out.println(resultsStr);		
		
		
		
		
	}
	
	private static String[] fizzBuzz (int n) {
		String[] strArr = new String[n+1];
		
		for(int i=1;i < strArr.length; i++) {
			if (i % 5 == 0 && i % 3 == 0){
				strArr[i] = "FizzBuzz";			
			}else if (i % 3 == 0) {
				strArr[i] = "Fizz";
			}else if (i % 5 == 0) {
				strArr[i] = "Buzz";
				
			}else {
				strArr[i] = String.valueOf(i);
			}
			
		}
		return strArr;
	}
	
	private static String printResults (String[] results) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < results.length; i ++) {
			sb.append(results[i]);
			sb.append(" ");
		}
		return sb.toString();
	}
	
	
	

}
