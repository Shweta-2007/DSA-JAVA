package Array;

public class countEvenOdd {
    public static int[] findEvenOddCount(int[] array) {
       int evenCount = 0, oddCount = 0;

       for(int num : array){
           if(num % 2 == 0){
               evenCount++;
           } else{
               oddCount++;
           }
       }
        return new int[]{evenCount, oddCount};
    }
}
