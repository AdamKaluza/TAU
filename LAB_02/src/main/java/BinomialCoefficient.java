public class BinomialCoefficient {
    public long binomialCoefficient(int n, int k) {
        if (n == 0 && k == 0) {
            return 1;
        }

        if (k < 0 || n < 0) {
            throw new IllegalArgumentException("Value can't be negative");
        }

        if (k > n) {
            throw new IllegalArgumentException("K must be bigger than N");
        }

        if (k == 0) {
            return 1;
        } else if (k > n - k) {
            return binomialCoefficient(n, n - k);
        } else {
            return binomialCoefficient(n - 1, k - 1) * n / k;
        }
    }
}
