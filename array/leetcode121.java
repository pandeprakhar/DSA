public class leetcode121 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] minLeft = new int[n];
        minLeft[0] = prices[0];
        int maxRight = prices[n - 1];
        int max = 0;

        for (int i = 1; i < n; i++) {
            minLeft[i] = Math.min(minLeft[i - 1], prices[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(max, maxRight - minLeft[i]);
            maxRight = Math.max(maxRight, prices[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        leetcode121 obj = new leetcode121();
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(obj.maxProfit(prices));
    }
}