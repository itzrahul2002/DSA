package Scalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Remove_Even_Arlist {
    public static void Even_Remove(ArrayList<Integer> list){
        for (int i =list.size()-1; i>=0; i--){
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//        for (int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            if(arr[i]%2!=0){
//                list.add(arr[i]);
//            }
//        }
//
//        System.out.println(list);

        ArrayList all = new ArrayList(Arrays.asList(5,10,4,15,8,21,3,2));
        Even_Remove(all);
    }
}
