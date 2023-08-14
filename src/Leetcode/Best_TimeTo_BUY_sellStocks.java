package Leetcode;
import java.util.Scanner;
public class Best_TimeTo_BUY_sellStocks {
    static void profit(int[] prices,Scanner sc) {
        System.out.println("Enter no. of times you want to buy or sell:");
        int repeat = sc.nextInt();
        int profit = 0;
        while (repeat != 0) {
            System.out.println("enter the buy-price of the particular day you want to buy: ");
            int buy = sc.nextInt();
            System.out.println("Enter the sell-price of the particular day you want to sell: ");
            int sell = sc.nextInt();
            profit = profit + (sell-buy);
            repeat--;
        }
        System.out.println("profit: " + profit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the price array: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the elements in the price array: ");
        for(int i = 0;i < n; i++){
            prices[i] = sc.nextInt();
        }
        profit(prices,sc);
    }
}
