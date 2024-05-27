//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {34, 89, 2, 700, 89};
//        int max = Array.maxElem.findMax(array);
        int secondMax = Array.secondMaxElem.findSecondMax(array);
        System.out.println(" Second Max Element: " + secondMax);
    }
}