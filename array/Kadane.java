import java.util.*;

class Solution {

    public int maxSubArray(int[] nums) {

        long maxsum = Long.MIN_VALUE;

        long sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > maxsum) {
                maxsum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return (int) maxsum;
    }
}

public class Kadane {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        Solution sol = new Solution();

        int maxSum = sol.maxSubArray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
