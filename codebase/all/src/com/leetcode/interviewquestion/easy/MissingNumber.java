package com.leetcode.interviewquestion.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return
 * the only number in the range that is missing from the array.
 * 
 * @author RAHUL MISHRA
 *
 */
public class MissingNumber {

	public static void main(String[] args) {
		MissingNumber missingNumber = new MissingNumber();
		int[] input = new int[] { 2, 1 };
		int result = missingNumber.missingNumber(input);
		System.out.println("result " + result);
	}

	public int missingNumber(int[] nums) {

		int sum = (nums.length * (nums.length+1))/2;
		for (int i = 0; i < nums.length; i++) {
			sum = sum - nums[i];
		}
		return sum;
	}

}
