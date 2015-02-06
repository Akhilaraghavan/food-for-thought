/**
 * 
 */
package com.puzzle;

import java.util.Scanner;

/**
 * @author Akhila Raghavan
 * 
 */
public class LongestPalindrome {

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String longestPalindrome(String str) {

		int len = str.length();

		int maxlen = 0;
		int startIndex = 0; 
		/** iterate through the chars in the string and check for palindrome*/
		for (int i = 2; i < len - 3; i++) { 
			int left = i - 1;
			int right = i + 1;
			int palinLen = 1;

			while (left >= 0) {
				if (str.charAt(left) == str.charAt(right)) {

					palinLen += 2;

					left--;
					right++;
				} else {
					break;
				}
			}

			if (maxlen < palinLen) {
				startIndex = left + 1;
				maxlen = palinLen;
			}

		}

		return str.substring(startIndex, startIndex + maxlen);
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = scanner.next();
		System.out.println(longestPalindrome(str));
		scanner.close();
	}

}
