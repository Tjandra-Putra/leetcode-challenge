// 1. Two Sum
package arrays_and_hashing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum1(nums, target);

        if (result.length == 2) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }

    // two pointer approach
    public static int[] twoSum1(int[] nums, int target) {
        // Sort the input array
        Arrays.sort(nums);

        // Initialize two pointers
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                // Found the pair that adds up to the target
                return new int[]{left, right};
            } else if (sum > target) {
                // Move the right pointer to decrease the sum
                right--;
            } else {
                // Move the left pointer to increase the sumß
                left++;
            }
        }

        return new int[0]; // Or return null or handle it as needed
    }
}
