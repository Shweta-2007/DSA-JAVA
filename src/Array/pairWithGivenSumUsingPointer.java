package Array;

public class pairWithGivenSumUsingPointer {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int n = A.length;
        int totalNoOfSubArrays = (n * (n + 1)) / 2;
        int[][] result = new int[totalNoOfSubArrays][];
        int index = 0;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int[] subArray = new int[end - start + 1];
                for (int k = start; k <= end; k++) {
                    subArray[k - start] = A[k];
                }
                result[index++] = subArray;
            }
        }

        // Print the result for verification
        for (int[] subArray : result) {
            System.out.print("[");
            for (int num : subArray) {
                System.out.print(num);
            }
            System.out.println("]");
        }
    }
}
