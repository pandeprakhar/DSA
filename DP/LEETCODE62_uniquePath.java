public class LEETCODE62_uniquePath {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                if (i > 0) {
                    up = dp[i - 1][j];
                }

                if (j > 0) {
                    left = dp[i][j - 1];
                }

                dp[i][j] = up + left;
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        LEETCODE62_uniquePath obj = new LEETCODE62_uniquePath();

        System.out.println(obj.uniquePaths(3, 7)); // 28
        System.out.println(obj.uniquePaths(3, 2)); // 3
        System.out.println(obj.uniquePaths(7, 3)); // 28
    }
}