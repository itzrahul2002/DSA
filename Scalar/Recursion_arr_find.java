package Scalar;

import java.util.Scanner;

public class Recursion_arr_find {
    public static int find(int arr[],int find,int i){
        if(i == arr.length) {
            return -1;
        }

        if(arr[i] == find){
            return i;
        }
        else {
            return find(arr, find, i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int find = sc.nextInt();

        System.out.println(find(arr,find,0));
    }
}
