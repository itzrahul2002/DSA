package Scalar;

import java.util.Scanner;

public class Selection_Sorting {
    public static void sort(int arr[]){
        for(int i=0; i<arr.length; i++){
           int minVal = arr[i];
           int minIndex = i;

           for(int j = i+1; j < arr.length; j++){
               if(minVal>=arr[j]){
                   minVal = arr[j];
                   minIndex = j;
               }
           }
           int temp = arr[i];
           arr[i] = arr[minIndex];
           arr[minIndex] = temp;
        }

        for(int i : arr) {
            System.out.print(i+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n ;i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);


    }
}
