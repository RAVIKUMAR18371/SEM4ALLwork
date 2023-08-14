package Leetcode;
import java.util.Scanner;
public class PalindromeInteger {
    public static boolean isPalindrome(int x){
        String s = Integer.toString(x);
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n  = sc.nextInt();
        boolean result  = isPalindrome(n);
        System.out.println(result);
    }
}
