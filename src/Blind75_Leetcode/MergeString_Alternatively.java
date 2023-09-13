package Blind75_Leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class MergeString_Alternatively {
    public static char[] mergeAlternately(String word1, String word2){
        int p = word1.length()+word2.length();
        char[] ch = new char[p];
        for(int i = 0 , j = 0; i < p; i+=2,j++) {
            if(j < word1.length()) {
                ch[i] = word1.charAt(j);
            }
            if(j < word2.length()) {
                ch[i + 1] = word2.charAt(j);
            }
        }
        StringBuilder ss = new StringBuilder();
        for(int i=0;i<ss.length();i++){

        }
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String:");
        String exp1 = sc.next();
        System.out.println("Enter the 2nd String:");
        String exp2 = sc.next();
        char[] s = mergeAlternately(exp1,exp2);
        System.out.println(Arrays.toString(s));
    }
}
