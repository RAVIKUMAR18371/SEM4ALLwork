package Leetcode;
import java.util.Scanner;
public class powerX_N {
    public static double myPow(double x, int n) {
      return  Math.pow(x,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double result = myPow(x,n);
        System.out.println(result);
    }
}
