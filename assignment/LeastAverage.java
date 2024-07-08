package DSA.assignment;

// Given an array A of size N, find the subarray of size B with the least average.
// A = [3, 7, 90, 20, 10, 50, 40]
// B = 3
// output => 3
public class LeastAverage {
    public static void main(String[] args) {
        int[] A = { 3, 7, 5, 20, -10, 0, 12 };
        int n = A.length;
        int B = 2;
        double minAverage = Double.MAX_VALUE;
        int startIndex = 0;

        // Calculate the sum of the first window of size B
        int currentSum = 0;
        for (int i = 0; i < B; i++) {
            currentSum += A[i];
        }

        // Initialize minAverage and startIndex with the first window
        minAverage = (double) currentSum / B;
        startIndex = 0;

        for (int i = B; i < n; i++) {
            // Update currentSum by adding the next element and subtracting the element
            // going out of the window
            currentSum += A[i] - A[i - B];

            // Calculate average of the current window
            double currentAverage = (double) currentSum / B;

            // Update minAverage and startIndex if currentAverage is smaller
            if (currentAverage < minAverage) {
                minAverage = currentAverage;
                startIndex = i - B + 1;
            }
        }

        System.out.println(startIndex);
    }
}
