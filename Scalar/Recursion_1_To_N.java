package Scalar;

import java.util.Scanner;

public class Recursion_1_To_N {
    public static void printing(int n){
        if(n == 0){
            return;
        }
        printing(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printing(n);
    }
}
