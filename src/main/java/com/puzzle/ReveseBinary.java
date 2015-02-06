/**
 * 
 */
package com.puzzle;

import java.util.Scanner;


/**
 * @author Akhila Raghavan
 *
 */
public class ReveseBinary {

	/** Reverse the binary of a number using a temp and char array
	 * 
	 * @param num
	 * @return
	 */
	public static int reverseNumberInBinaryUsingArray(int num){
		char[] chars = Integer.toBinaryString(num).toCharArray();
		int i = 0, j=chars.length-1;
		while(i<=j){
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
			i++;j--;
		}
		
		return parseInt(chars,2);
	}
	
	/** Reverse the binary of a number using modulo
	 * 
	 * @param num
	 * @return
	 */
	
	public static int reverseNumberInBinary(final int num){
		int n = num;
		String bin ="";
		while(n!=0){
			bin =  bin+n%2;
			n= n/2;
		}
		
		return parseInt(bin.toCharArray(),2);
	}
	
	
	public static int parseInt(char[] chars, int radix){
		int len = chars.length-1;
		int[] arr = {1,2,4,8,16,32,64,128,256,612,1024,2048,4096,8192,16384,32768,65536,131072,262144,524288,1048576,2097152,4194304,8388608,16777216,33554432,67108864,134217728,268435456,536870912,1073741824,2147483628};
		int i =0;
		for(char c:chars){			
			i+= Integer.parseInt(String.valueOf(c))*arr[len];
			len--;
		}
		return i;
	}
	
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter number");
		System.out.println("*** Reverse Number in Binary*******");
		System.out.println(reverseNumberInBinary(scanner.nextInt()));
		System.out.println("*** Reverse Number in Binary using array *******");
		System.out.println(reverseNumberInBinaryUsingArray(scanner.nextInt()));
		scanner.close();
	}
}
