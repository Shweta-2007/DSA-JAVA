package Array;

//Say you have an array, A, for which the ith element is the price of a given stock on day i.
//If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//Return the maximum possible profit.

import static java.lang.Math.max;
import static java.lang.Math.min;

public class BuySellStock {
    public static int MaxProfit(int [] A){
       int N = A.length;

        int buy = Integer.MIN_VALUE;
        int sell = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
           buy = max(buy, A[i]);
        }

        for(int i = 0; i < N; i++){
            sell = min(sell, A[i]);
        }


        System.out.println("buy:"+buy);
        System.out.println("sell:"+sell);

        System.out.println(" ");

       return buy - sell;
    }

    public static void main(String[] args){
        int [] A = {1, 2};
        int result = MaxProfit(A);
        System.out.print("RESULT:"+result);
    }

}
