package Scalar;

import java.util.Scanner;

public class Array_Found {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a Number You Want to Find :");
        int find = sc.nextInt();
        boolean temp =false;

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] == find) {
                    temp = true;
                    break;
                }
            }
        }

        System.out.println((temp) ? "Data Found ✅" : "Data Not Found ❌");
    }
}
