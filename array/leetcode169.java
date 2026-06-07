public class leetcode169 {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        int m = n / 2;

        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > m) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        leetcode169 obj = new leetcode169();

        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(obj.majorityElement(nums1)); // 3
        System.out.println(obj.majorityElement(nums2)); // 2
    }
}