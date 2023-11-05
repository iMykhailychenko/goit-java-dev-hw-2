package ua.goit;

public class SumCalculator {
    int sum(int n) {
        if (n == 0) {
            throw new IllegalArgumentException();
        }

        if (n == 1) return 1;

        return n + sum(n - 1);
    }
}
