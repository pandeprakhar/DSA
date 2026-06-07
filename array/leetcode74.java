public class leetcode74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] < target) {
                start = i;
            } else if (matrix[i][0] == target) {
                return true;
            } else {
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            if (matrix[start][i] == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        leetcode74 obj = new leetcode74();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 3;

        boolean result = obj.searchMatrix(matrix, target);
        System.out.println(result);
    }
}