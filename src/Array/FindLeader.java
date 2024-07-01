package Array;

//Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.
//NOTE: The rightmost element is always a leader.

//A = [16, 17, 4, 3, 5, 2]
//[17, 2, 5]
public class FindLeader {
   public static void allLeaders(int[] A){
       int N = A.length;
       int maxFromRight = A[N - 1];
       int [] leaders = new int [N];
       int index = 0;
       leaders[index++] = maxFromRight;

       for(int i = N - 2; i >= 0; i--){
           if(A[i] > maxFromRight){
               maxFromRight = A[i];
               leaders[index++] = maxFromRight;
           }
       }
       for (int i = index - 1; i >= 0; i--) {
           System.out.print(leaders[i] + " ");
       }

   }

   public static void main(String[] args){
       int [] A = {16, 17, 4, 3, 5, 2};
       System.out.print("Leaders: ");
       allLeaders(A);
   }
}
