class leetcode75 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                a++;
            } else if (nums[i] == 1) {
                b++;
            } else {
                c++;
            }
        }

        for (int i = 0; i < a; i++) {
            nums[i] = 0;
        }

        for (int i = a; i < b + a; i++) {
            nums[i] = 1;
        }

        for (int i = b + a; i < n; i++) {
            nums[i] = 2;
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 2, 0, 1};

        leetcode75 sol = new leetcode75();
        sol.sortColors(nums);

        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}