import java.util.HashMap;

public class leetcode287 {

    public static int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (freq.get(num) > 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        System.out.println("Duplicate Number: " + findDuplicate(nums));
    }
}