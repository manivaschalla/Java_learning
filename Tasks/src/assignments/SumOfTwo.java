package assignments;

import java.util.Arrays;

public class SumOfTwo {
	public static void main(String[] args) {
		int target = 16;
		int[] nums = {7,2,11,8,5};

		for(int i =0; i<nums.length;i++) {
			for(int j =i+1;j<nums.length;j++) {
				
				if(nums[i] + nums[j] == target) {
					int[] result = new int[] {i,j};
					System.out.println(Arrays.toString(result));
				}
				
				
			}
		}
	}

}
