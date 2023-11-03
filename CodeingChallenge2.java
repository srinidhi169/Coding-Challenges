/*Q2) Imagine you are building a Java program for stock traders to analyze potential profits in a 
single trading day. The program should assist traders in making informed decisions about when 
to buy and sell stocks. It includes a `StockAnalyzer` class designed to determine the maximum 
profit that can be achieved by buying and selling a specific stock within the same trading day.
- Traders often look for opportunities to maximize profits by buying low and selling high.
- Throughout the trading day, stock prices vary minute by minute.
- The goal is to find the most profitable buy and sell points within the trading day's data.
- The `StockAnalyzer` class has been developed to facilitate this analysis.
Expected Input:
Enter the stockPrices = {7, 1, 5, 3, 6, 4};
Expected Output:
  The expected maximum profit is 5, which can be achieved by buying the stock at a price of 1 
  and selling it at a price of 6*/

public class CodeingChallenge2 {
    public int maxProfit(int[] stockPrices) {
        int minPrice = Integer.MAX_VALUE; 
        int maxProfit = 0; 

        for (int price : stockPrices) {
           
            if (price < minPrice) {
                minPrice = price;
            } else {
                
                int currentProfit = price - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
      CodeingChallenge2 stockAnalyzer = new CodeingChallenge2();
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        int maxProfit = stockAnalyzer.maxProfit(stockPrices);
        System.out.println("The expected maximum profit is " + maxProfit);
    }
}