package leetcodeinjava;

public class LongestCommonPrefix {
	/*
	 * Write a function to find the longest common prefix string amongst an array of
	 * strings. If there is no common prefix, return an empty string
	 */

	public static void main(String[] args) {

		String[] strArr1 = { "leetcode", "lead", "leet" };
		String[] strArr2 = { "beast","bead","bean" };
		System.out.println(getCommonPrefix(strArr1));
		System.out.println(getCommonPrefix(strArr2));

	}

	public static String getCommonPrefix(String[] inputStr) {

		if (inputStr.length == 0) {
			return "";
		}

		String prefix = inputStr[0];

		for (int i = 0; i < inputStr.length - 1; i++) {
			
			while (inputStr[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);

				if (prefix.isEmpty()) {
					return "";
				}

			}

			}


		return prefix;
	}

}
