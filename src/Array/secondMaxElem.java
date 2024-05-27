package Array;

public class secondMaxElem {
    public static int findSecondMax(int[] arr){
       if(arr.length < 2){
          return -1;
       }
        int largest = arr[0];
        int secondLargest = -1;
       for(int i = 0; i < arr.length; i++){
        if(arr[i] > largest){
            secondLargest = largest;
            largest = arr[i];
        } else if(arr[i] > secondLargest && arr[i] != largest){
            secondLargest = arr[i];
        }

       }
       return secondLargest;
    }
}
