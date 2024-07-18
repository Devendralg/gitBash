package arrayPrograms;

import java.util.HashSet;
public class LongestConsecutiveNumberPrintInAnArray 
{
	public static int longestConsecutive(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		HashSet<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}

		int longestStreak = 0;

		for (int num : nums) {
			if (!set.contains(num - 1)) 
			{
				int currentNum = num;
				int currentStreak = 1;

				while (set.contains(currentNum + 1)) {
					System.out.println(currentNum);
					currentNum++;
					currentStreak++;
				}

				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}

		return longestStreak;
	}

	public static void main(String[] args) {
		int[] nums = {1,5,6,7};
		System.out.println("Longest consecutive sequence length: " + longestConsecutive(nums));

	}

}
