import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {0, 98, 3, 10, 64, 91};
//        int max = Array.maxElem.findMax(array);
//        int secondMax = Array.secondMaxElem.findSecondMax(array);
//        int sum = Array.sumOfAll.findSum(array);
//        int average = sum / array.length;
//        int min = Array.minElem.findMin(array);
//        int prod = Array.prodOfAll.findProd(array);
//        int[] evenOddCount = Array.countEvenOdd.findEvenOddCount(array);
        Array.reverseArray.reverse(array);
        System.out.println("Original Array: " + Arrays.toString(array));
        Array.reverseArray.reverse(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));
//        System.out.println("Odd Count: " + evenOddCount[1]);
    }
}