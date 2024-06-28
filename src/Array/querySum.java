package Array;

public class querySum {
    public static int [] prefixSum(int [] arr){

        int [] preSum = new int [arr.length];
        preSum[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
          preSum[i] = preSum[i - 1] + arr[i];
        }

        return preSum;
    }

    public static int querySumFunc(int [] [] arr){
        for(int i = 0; i < arr.length; i++){
            int start = arr[i][0];
            int end = arr[i][1];
            int [] preSum = prefixSum(arr[i]);
           if(start == 0){
              return preSum[end];
           } else{
              return (preSum[end] - preSum[start - 1]);
           }

        }
        return -1;
    }

    public static void main(String[] args){
       int [] arr = {2,6,3,7,1};
       int [][] query = {{1,3}, {0,2}};
       int result = querySumFunc(query);
      System.out.print("RESULT: " + result);
    }


}
