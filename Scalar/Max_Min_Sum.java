package Scalar;

import java.util.Scanner;

public class Max_Min_Sum {
    public static int MAX_MIN(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min=arr[i];
            }
            if (arr[i] > max) {
                max=arr[i];
            }
        }
        return min+max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of Maximum & Minimum : "+MAX_MIN(arr));
    }
}
