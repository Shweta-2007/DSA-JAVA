package Array;

// print all possible sub arrays
public class allSubArray {
    public static void printAllSubArrays(int[] A){
        int n = A.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(A[k] + "");
                }
              System.out.println();
            }
        }
    }
    public static void main(String[] args){
        int A [] = {4,2,3,5};
        printAllSubArrays(A);

    }
}
