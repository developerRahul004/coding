package com.leetcode.all.math.easy;

public class Numberof1Bits {

	public static void main(String[] args) {
		Numberof1Bits noB = new Numberof1Bits();

		byte input = 0B00000000000000000000000000001011;
		int result = noB.hammingWeight(input);
		System.out.println(" result " + result);

		byte input1 = 0B11111111111111111111111111111101;
		int result1 = noB.hammingWeight(input1);
		System.out.println(" result1 " + result1);
	}

	public int hammingWeight(int n) {
		int count = Integer.bitCount(n);
		System.out.println(" count " + count);
	/*	for(int i = 0 ; i < bits.length() ; i ++) {
			if(bits.charAt(i) == '1') {
				count = count + 1;
			}
		}*/
		return count;

	}
}
