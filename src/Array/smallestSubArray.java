package Array;

// Return length of smallest subarray which contains both maximum and minimum elements of array

public class smallestSubArray {
    public static int findMax(int[] A){
        int n = A.length;
        int max = A[0];

        for(int i = 0; i < n; i++){
            max = Math.max(max, A[i]);
        }

        return max;
    }

    public static int findMin(int[] B){
        int n = B.length;
        int min = B[0];

        for(int i = 0; i < n; i++){
            min = Math.min(min, B[i]);
        }

        return min;
    }

    public static int findLength(int [] arr){
        int n = arr.length;
        int ans = n;
        int max = findMax(arr);
        int min = findMin(arr);
        int max_index = -1;
        int min_index = -1;
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);

        for(int i = 0; i < n; i++){
           if(arr[i] == max){
             max_index = i;
             if(min_index != -1){
                ans = Math.min(ans, max_index - min_index + 1);
             }
           } else if(arr[i] == min){
               min_index = i;
               if(max_index != -1){
                   ans = Math.min(ans, min_index - max_index + 1);
               }
           }
        }

        return ans;

    }

    public static void main(String[] args){
        int array[] = {2,2,6,4,5,1,5,2,6,4,1};
        int result = findLength(array);
        System.out.print("RESULT: "+result);
    }

}
