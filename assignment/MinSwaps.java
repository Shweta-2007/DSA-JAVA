package DSA.assignment;

// Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

// Note: It is possible to swap any two elements, not necessarily consecutive.

public class MinSwaps {
    public static void main(String[] args) {
        int[] A = { 5, 17, 100, 11 };
        int B = 20;

        int countValid = 0;
        for (int num : A) {
            if (num <= B) {
                countValid++;
            }
        }

        // EDGE CASE
        if (countValid == 0 || countValid == 1) {
            System.out.println("no swap required");
        }

        int countInValid = 0;
        for (int i = 0; i < countValid; i++) {
            if (A[i] > B) {
                countInValid++;
            }
        }

        int minSwap = countInValid;
        for (int i = 0; i < A.length - countValid; i++) {
            if (A[i] > B) {
                countInValid--;
            }
            if (A[i + countValid] > B) {
                countInValid++;
            }
            minSwap = Math.min(minSwap, countInValid);
        }
        System.out.println(minSwap);

    }

}
