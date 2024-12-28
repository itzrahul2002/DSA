package Scalar;

import java.util.Scanner;

public class Reverse_Vowels {
    public static void reverseVowels(String str){
        char s[] = str.toCharArray();
        int i=0;
        int j=s.length-1;

        while (i<j){

            while (s[i]!='a' && s[i]!='e' && s[i]!='i' && s[i]!='o' && s[i]!='u'){
                i++;
            }

            while (s[j]!='a' && s[j]!='e' && s[j]!='i' && s[j]!='o' && s[j]!='u'){
                j--;
            }

            if(i>=j){
                break;
            }
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;

            for(char ch : s){
                System.out.print(ch+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        reverseVowels(str);
    }
}
