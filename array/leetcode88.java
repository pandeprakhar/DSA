import java.util.Arrays;

public class leetcode88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = 0;

        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[x];
            x++;
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        leetcode88 obj = new leetcode88();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        obj.merge(nums1, m, nums2, n);

        System.out.println("Merged Array:");
        System.out.println(Arrays.toString(nums1));
    }
}