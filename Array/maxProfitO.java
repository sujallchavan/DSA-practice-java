package Array;

public class maxProfitO {
    public int maxProfit(int[] prices) {
        int maxP = Integer.MIN_VALUE;
        int minSoFar = prices[0];

        for (int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(prices[i], minSoFar);
            int profit = prices[i] - minSoFar;
            maxP = Math.max(maxP, profit);
        }

        return maxP;
    }

    public static void main(String[] args) {
        int[] prices = { 1, 2, 3, 4, 5 };

        maxProfitO ob = new maxProfitO();

        int n = ob.maxProfit(prices);

        System.out.println(n);
    }
}
