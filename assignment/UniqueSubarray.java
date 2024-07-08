package DSA.assignment;

// Misha likes finding all Subarrays of an Array. Now she gives you an array A of N elements and told you to find the number of subarrays of A, that have unique elements.
// Since the number of subarrays could be large, return value % 109 +7.
// A = [1, 1, 3]
// 4
// Subarrays of A that have unique elements only:
//  [1], [1], [1, 3], [3]
public class UniqueSubarray {
    public static void main(String[] args) {
        int A[] = { 2, 1, 2 };
        int n = A.length;
        int[] freq = new int[100001];
        int start = 0, end = 0;
        int count = 0;
        int MOD = 1000000007;

        while (end < n) {
            // Expand the window
            while (end < n && freq[A[end]] == 0) {
                freq[A[end]]++;
                end++;
            }

            // Calculate the number of unique subarrays ending at 'end-1'
            count = (count + (end - start)) % MOD;
            System.out.println("COUNT:" + count);

            // Shrink the window
            if (end < n) {
                while (start < end && A[start] != A[end]) {
                    freq[A[start]]--;
                    start++;
                }
                freq[A[start]]--; // move past the repeated element
                start++;
            }
        }

        System.out.println(count);

    }

}
