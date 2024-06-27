package Array;

import java.util.Scanner;

public class prefixSum {
    public static int [] preSum(int[]  arr){
        int [] pSum = new int [arr.length];
        pSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            pSum[i] = pSum[i - 1] + arr[i];
        }
       return pSum;
    }
    public static void main(String[] args){
//        int [] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int [] arr = new int [n];

       for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
       }

        int [] pSum = preSum(arr);

        for(int sum:pSum){
            System.out.print(sum + " ");
        }
       sc.close();

    }
}
