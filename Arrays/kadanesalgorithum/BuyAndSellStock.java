package kadanesalgorithum;

import java.util.Scanner;

class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        // *****************************Bruteforce soluton***********************/

        // int size = prices.length;
        // // Is varible me profit ko calulate karege
        // int profit = 0;
        // // loop ki help se hum buy stock ko set karenge or uske agel din usse sell
        // karenge
        // for(int buyStock = 0; buyStock<size-1; buyStock++){
        // //Is loop se hum aage wale din me stock ko sell karenge
        // for(int sellStock = buyStock+1; sellStock<size; sellStock++){
        // // Calculate profit
        // int currentProfitOrLoss = prices[sellStock] - prices[buyStock];
        // if(currentProfitOrLoss>profit){ // Agar currentProfitOrloss profit se jyda
        // hai toh usse update karo
        // profit = currentProfitOrLoss;
        // }
        // }
        // }
        // return profit;

        // **************************Optimization Solution***************************
        int size = prices.length;
        // Store Maximum Profit
        int maxProfit = 0;
        // Buying Stock
        int buyPrice = prices[0];

        // Traverse
        for (int i = 1; i < size; i++) {
            // calculate current profit
            int currentProfit = prices[i] - buyPrice;
            // Update MaxProfit
            maxProfit = Math.max(currentProfit, maxProfit);
            // Update Buy price
            if (buyPrice > prices[i])
                buyPrice = prices[i];
        }
        return maxProfit;
    }
    void main() {
        BuyAndSellStock obj = new BuyAndSellStock();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of days:");
       int n = sc.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter the stock prices for " + n + " days:");
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
       }
        int result = obj.maxProfit(arr);
        System.out.println("The Maximum Profit is: " + result);
    }
}
