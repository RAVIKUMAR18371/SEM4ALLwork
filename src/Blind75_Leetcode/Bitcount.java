package Blind75_Leetcode;

import java.util.Scanner;
import java.lang.Integer;
public class Bitcount {
    static int count(int n){
        return Integer.bitCount(n);
        //VVI.--> check more bit METHOD IS ALSO THERE
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer you want to count the bit:");
        int n = sc.nextInt();
        System.out.println("The 1's bit count will be:");
        System.out.println("output: " + count(n));

    }
}
