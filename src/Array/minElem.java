package Array;

public class minElem {
    public static int findMin(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++){
           if(min > array[i]){
               min = array[i];
           }
        }
        return min;
    }
}
