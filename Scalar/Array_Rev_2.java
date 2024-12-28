package Scalar;

import java.util.*;


public class Array_Rev_2 {
    static void rev(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    static void easy_rev(int[] arr){
        List al = Arrays.asList(arr);
//        Collections.reverse(al);
        System.out.println(al);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        rev(arr);
        easy_rev(arr);
    }
}
