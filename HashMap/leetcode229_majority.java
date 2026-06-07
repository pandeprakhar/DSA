import java.util.*;

public class leetcode229_majority {

    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> h1 = new HashMap<>();

        for (int num : nums) {
            h1.put(num, h1.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (h1.get(nums[i]) > n / 3 && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        leetcode229_majority obj = new leetcode229_majority();

        int[] nums1 = {3, 2, 3};
        int[] nums2 = {1, 1, 1, 3, 3, 2, 2, 2};

        System.out.println(obj.majorityElement(nums1)); // [3]
        System.out.println(obj.majorityElement(nums2)); // [1, 2]
    }
}