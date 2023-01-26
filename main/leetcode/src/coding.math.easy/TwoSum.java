package coding.math.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		TwoSum twoSum = new TwoSum();
		
		int[] input = {2,7,11,15};
		int target = 9;
		
		int[] result = twoSum.twoSum(input, target);
		for(int i = 0 ; i < result.length ; i++) {
			System.out.println(result[i]);
		}
	}


	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int val = target - nums[i];
			if (map.containsKey(val)) {
				return new int[] { map.get(val), i };
			}
			map.put(nums[i], i);
		}
		return null;
	}

}
