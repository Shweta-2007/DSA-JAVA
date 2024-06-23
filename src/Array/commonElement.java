package Array;

public class commonElement {
    public static void main(String[] args){
      int [] arr1 = {2,5,6,10,12};
      int [] arr2 = {10, 6,1,3};
      boolean found = false;
    for(int i = 0; i < arr1.length; i++){
        for(int j = 0; j < arr2.length; j++){
            if(arr1[i] == arr2[j]){
              System.out.println("Found element are " + arr1[i]);
              found = true;
            }
        }
    }
    if(!found){
        System.out.print("No common element found");
    }
    }
}
