package Scalar;

import java.util.Scanner;

public class Upper_To_Lower {
    public static void UpperToLower1(String str){
        char s[] = str.toCharArray();

        for (int i=0; i<s.length; i++){
            char ch = s[i];
            if(ch >= 'A'  && ch <= 'Z'){
                char ans = (char) (ch - 'A' + 'a');
                s[i] = ans;
            }
        }
        for(char c : s){
            System.out.print(c+" ");
        }
    }

    public static void UpperToLower2(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32)); // Convert to lowercase
            } else {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString()); // Print the final result once
    }

    public static void UpperToLower3(String str){
        System.out.println(str.toLowerCase());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        UpperToLower3(str);
    }
}
