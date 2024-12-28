package Scalar;

import java.util.Scanner;

public class Recursion_Fact {
    public static int fact(int n){
        if(n==0) return 1;

        int n_one = fact(n-1);
        return n*n_one;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
