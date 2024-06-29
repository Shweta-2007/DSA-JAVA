package Array;

public class MaxSumBElements {
    public static int maxSumAfterBOperations(int [] A, int B){
        int maxSum = Integer.MIN_VALUE;
        int N = A.length;

        // Front prefix sum
        int [] frontPrefixSum = new int [B + 1];
        for(int i = 1; i <= B; i++){
            frontPrefixSum[i] = frontPrefixSum[i - 1] + A[i - 1];
        }

        // Back prefix sum
        int [] backPrefixSum = new int [B + 1];
        for(int i = 1; i <= B; i++){
            backPrefixSum[i] = backPrefixSum[i - 1] + A[N - i];
        }

        for(int i = 0; i <= B; i++){
            int sum = (frontPrefixSum[i] + backPrefixSum[B - i]);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args){
        int[] A = {-969, -948, 350, 150, -59, 724, 966, 430, 107, -809, -993, 337, 457, -713, 753, -617, -55, -91, -791, 758, -779, -412, -578, -54, 506, 30, -587, 168, -100, -409, -238, 655, 410, -641, 624, -463, 548, -517, 595, -959, 602, -650, -709, -164, 374, 20, -404, -979, 348, 199, 668, -516, -719, -266, -947, 999, -582, 938, -100, 788, -873, -533, 728, -107, -352, -517, 807, -579, -690, -383, -187, 514, -691, 616, -65, 451, -400, 249, -481, 556, -202, -697, -776, 8, 844, -391, -11, -298, 195, -515, 93, -657, -477, 587};
        int B = 81;
        int result = maxSumAfterBOperations(A,B);
        System.out.print("RESULT: "+result);
    }
}
