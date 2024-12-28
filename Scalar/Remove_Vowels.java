package Scalar;

import java.util.Scanner;

public class Remove_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String consonents ="";
        for (int i = 0; i< str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                continue;
            }
            else {
                consonents+=str.charAt(i);
            }
        }
        System.out.println(consonents);
    }
}
