package Array;

public class pairWuthGivenSum {
    public static Boolean sumExists(int [] arr, int sum){
        Boolean exists = false;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    exists = true;
                    break;
                }
            }
        }

        return exists;
    }
    public static void main(String[] args){
        int array [] = {1, -2, 1, 0, 5};
        int x = 0;
       Boolean result = sumExists(array,x);
       System.out.print("RESULT: "+ result);

    }
}
