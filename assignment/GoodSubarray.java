package DSA.assignment;

// Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
// 1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
// 2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
// Your task is to find the count of good subarrays in A.
// A = [1, 2, 3, 4, 5]
// B = 4
// 6

public class GoodSubarray {
    public static void main(String[] args) {
        int A[] = { 13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9 };
        int n = A.length;
        int B = 65;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                int length = j - i + 1;
                if ((length % 2 == 0 && sum < B) || (length % 2 != 0 && sum > B)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}
