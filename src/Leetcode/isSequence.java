package Leetcode;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class isSequence {
    static boolean isSubsequence(String str, String exp){
        ArrayList<String> al = new ArrayList<>();
            al.add(exp);
        int[] arr = new int[4];

        if(al.contains(str)){
            int i = 0;
           while(i < str.length()-1){
                if(al.indexOf(str.charAt(i)) > al.indexOf(str.charAt(i+1))){
                    return false;
                }
                i++;
            }
           return true;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of substring:");
        int n = sc.nextInt();
        System.out.println("Enter the first String which is going to be checked:");
        String str = sc.next();
       // str.toCharArray();
        System.out.println("Enter the second String:");
        String exp = sc.next();
        boolean s = isSubsequence(str , exp);
        System.out.println(s);

    }
}
