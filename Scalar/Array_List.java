package Scalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(12,24));

        System.out.println(arr);

        //add a element
        arr.add(36);
        arr.add(48);
        arr.add(60);
        System.out.println(arr);

        //remove a element
        arr.remove(1);
        System.out.println(arr);

        // set a Element
        arr.set(1,24);
        System.out.println(arr);

        // get a element
        System.out.println(arr.get(2));

        //size or list
        System.out.println(arr.size());

        System.out.println("--------------------------------");
        for (Integer i : arr){
            System.out.println(i);
        }

        System.out.println("--------------------------------");
        Iterator list = arr.iterator();

        while (list.hasNext()){
            System.out.print(list.next()+" ");
        }
    }
}
