public class leetcode50 {

    public double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            return 1.0 / myPower(x, -N);
        }

        return myPower(x, N);
    }

    public double myPower(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        if (n == 1) {
            return x;
        }

        if (n % 2 == 0) {
            return myPower(x * x, n / 2);
        } else {
            return x * myPower(x, n - 1);
        }
    }

    public static void main(String[] args) {
        leetcode50 obj = new leetcode50();

        System.out.println(obj.myPow(2.0, 10));   // 1024.0
        System.out.println(obj.myPow(2.0, -2));   // 0.25
        System.out.println(obj.myPow(2.1, 3));    // 9.261
    }
}