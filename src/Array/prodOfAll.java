package Array;

public class prodOfAll {
    public static int findProd(int[] array) {
        int prod = 1;
        for(int i = 0; i < array.length; i++){
          prod *= array[i];
        }
        return prod;
    }
}
