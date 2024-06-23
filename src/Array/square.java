package Array;

import java.util.Scanner;

public class square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print(i*i + " ");
        }
    }

}
