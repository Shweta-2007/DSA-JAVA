package DSA.assignment;

// Given an array A of length N. Also given are integers B and C.
// Return 1 if there exists a subarray with length B having sum C and 0 otherwise
// Return 1 if such a subarray exist and 0 otherwise
// o/p 1

public class ExistSubarray {
    public static void main(String[] args) {
        int A[] = { 4, 2, 2, 5, 1 };
        int N = A.length;
        int B = 4;
        int C = 6;

        // CREATE WINDOW
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        if (sum == C) {
            System.out.println("1");
            return;
        }

        for (int i = B; i < N; i++) {
            sum = sum - A[i - B] + A[i];

            if (sum == C) {
                System.out.println("1");
                return;
            }

        }

        System.out.println("0");

    }

}
