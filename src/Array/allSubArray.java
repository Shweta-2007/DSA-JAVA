package Array;

// print all possible sub arrays
public class allSubArray {
    public static void printAllSubArrays(int[] A){

        int N = A.length;
        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                System.out.print("[");
                for(int k = i; k <= j; k++){
                   System.out.print(A[k] + "");
                }
                System.out.print("]");
                System.out.println();
            }
        }

    }
    public static void main(String[] args){
        int A [] = {4,2,3,5};

        printAllSubArrays(A);

    }
}
