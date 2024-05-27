package Array;

public class sumOfAll {
    public static int findSum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
           sum += array[i];
        }
        return sum;
    }

}
