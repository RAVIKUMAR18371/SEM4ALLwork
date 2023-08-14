package Blind75_Leetcode;
import java.lang.Integer;
import java.util.Scanner;
public class ReverseBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n = sc.nextInt();

        String p = Integer.toBinaryString(n);
        System.out.println(p);

        StringBuilder s = new StringBuilder(p);
        System.out.println(s.reverse());

        System.out.println(Integer.parseInt(String.valueOf(s)));








    }
}
