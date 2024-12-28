package Scalar;

import java.util.Scanner;

public class Array_Rev_1 {
    static int[] swap(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];

        for (int i=0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int narr[] = swap(arr);

        for(int k :narr){
            System.out.print(k+ " ");
        }
        System.out.println();
        for (int l=0; l<narr.length; l++) {
            System.out.print(narr[l] + "->");
        }
    }
}
